package QA_Bootcamp_Maven.MyApplication;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MainTestFacebook {

	private AndroidDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appium:platformName", "Android");
		caps.setCapability("appium:deviceName", "Medium Phone API 35");
		caps.setCapability("appium:platformVersion", "15");
		caps.setCapability("appium:app", "D:\\Documents\\Desktop\\QA\\Mobile\\com.facebook.katana.apk");
	    caps.setCapability("appium:automationName", "UiAutomator2");
	

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@Test
	public void clickItem() {
		driver.findElement(AppiumBy.androidUIAutomator(
			"new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("Lina");;
	   driver.findElement(AppiumBy.androidUIAutomator(
			"new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("sfgsfgsg");
	   driver.findElement(AppiumBy.accessibilityId("Log in")).click();
	  WebElement errorMessage =  driver.findElement(AppiumBy.androidUIAutomator(
				"new UiSelector().text(\"Wrong Credentials\")"));
	   assert errorMessage.getText().contains("Wrong Credentials") : "Error message is not displayed stating Wrong Credentials";
	}
	
	

	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}