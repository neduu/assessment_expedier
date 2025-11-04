package utils;

import BaseClasses.TestBase;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DeviceCaps extends TestBase {

    public static void TECNOKJ5() {
        caps = new DesiredCapabilities();
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("deviceName", "TECNO-KJ5");
        caps.setCapability("appPackage", "com.msquare.market.app.dev");
        caps.setCapability("appActivity", "com.msquare.market.app.MainActivity");
        caps.setCapability("noReset", false);
        caps.setCapability("autoGrantPermissions", true);
    }
    public static void Emulator() {
        caps = new DesiredCapabilities();
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13.0");
        caps.setCapability("appPackage", "com.msquare.market.app.dev");
        caps.setCapability("appActivity", "com.msquare.market.app.MainActivity");
        caps.setCapability("noReset", false);
        caps.setCapability("autoGrantPermissions", true);
    }
}
