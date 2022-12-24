import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy A71");
        cap.setCapability(MobileCapabilityType.UDID,"RR8NC04VAPB");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,cap);

        System.out.println("Setup Done!!!");
        System.out.println("Calculator is opened");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
