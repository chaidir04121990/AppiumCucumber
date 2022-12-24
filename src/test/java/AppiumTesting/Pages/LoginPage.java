package AppiumTesting.Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage{

    AndroidDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By BTNlogin = By.id("login-button");
    By errorMsg = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void setUsername(){

    }
    public void setPassword(){

    }
    public void clickBTNlogin(){

    }

    public void ErrorMsg(){
        String expectedString = "Username is required";
        String actualString = driver.findElement(errorMsg).getText();
        Assert.assertTrue(actualString.contains(expectedString));
    }
}
