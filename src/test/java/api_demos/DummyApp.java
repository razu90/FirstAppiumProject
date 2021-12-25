package api_demos;

import org.testng.annotations.Test;
import utilities.DriveSession;

import java.io.File;
import java.net.MalformedURLException;

public class DummyApp {
    @Test
    public void launchDummyApp() throws MalformedURLException {
        String deviceName = "Pixel 5";
        String udId = "emulator-5554";
        String appPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "apps" + File.separator + "ApiDemos-debug.apk" ;
        DriveSession.driverSession(deviceName, udId, appPath);

    }
}
