package QA_Bootcamp_Maven.MyApplication;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
public class TestSetupForTour {

	private AndroidDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("appium:platformVersion", "15.0");
	    caps.setCapability("appium:deviceName", "emulator-5554");
	    caps.setCapability("appium:appPackage", "com.element.tour_app");
	    caps.setCapability("appium:appActivity", ".MainActivity");
	    caps.setCapability("appium:noReset", true);
	    caps.setCapability("appium:automationName", "UiAutomator2");

	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
