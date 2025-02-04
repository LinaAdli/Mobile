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

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MainTest1 {

	private AndroidDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appium:platformName", "Android");

		caps.setCapability("appium:deviceName", "Medium Phone API 35");
		caps.setCapability("appium:platformVersion", "15");

		caps.setCapability("appium:app", "D:\\Documents\\Desktop\\QA\\Mobile\\ApiDemos-debug.apk");

	   // caps.setCapability("appium:automationName", "UiAutomator2");
	    

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void clickItem() {
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Controls']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='2. Dark Theme']")).click();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
        scrollToText("Alert Dialogs");
        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		//driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Mumbai");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));

		//((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));

		//driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Mumbai");

		//driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		//driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();

	}
	private void scrollToText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"
        ));
    }

	@Test
	public void ScrollToText2(){
	scrollToText("Views");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
	System.out.println("Scrolling has been started to find text -> Tabs.");
	scrollToText("Tabs");
	System.out.println("Tabs text has been found and now clicking on it.");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Tabs']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}