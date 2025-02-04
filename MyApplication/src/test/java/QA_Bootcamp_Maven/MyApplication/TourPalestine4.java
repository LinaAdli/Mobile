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
import io.appium.java_client.TouchAction;
public class TourPalestine4 {

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


	@Test
	public void clickItem() throws InterruptedException {
		
		
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));


        WebElement LetGoButton = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Let's Go")));
        LetGoButton.click();
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                + "new UiSelector().description(\"Gifts and Oriental Antiques\"))"
            ));

        WebElement Gifts = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AppiumBy.accessibilityId("Gifts and Oriental Antiques"))));
        Gifts.click();
        
        WebElement moreButton = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='More'])[1]"));
        moreButton.click();
        
        WebElement phonecall = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]"));
        phonecall.click();

		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);
        
        WebElement location = driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[3]"));
        location.click();
        driver.executeScript("mobile: shell", ImmutableMap.of("command", "sleep 10"));
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        
        
            WebElement Hebron = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc=\"Hebron\"]")));
            Hebron.click();

          
            WebElement image = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.ImageView[2]")));
            image.click();
            Thread.sleep(5000);
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(5000);


//            WebElement mainbutton = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("android.widget.Button")));
//            mainbutton.click();
            
//          WebElement English = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("English")));
//          English.click();
//          WebElement Arabic = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("العربية")));
//          Arabic.click();
//          Thread.sleep(5000);
//
//          WebElement mainbutton2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("android.widget.Button")));
//          mainbutton2.click();
//          WebElement Arabic2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("العربية")));
//          Arabic2.click();
//          Thread.sleep(5000);
//
//          WebElement English2 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("English")));
//          English2.click();
//          Thread.sleep(5000);

          WebElement mainbutton3 = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("android.widget.Button")));
          mainbutton3.click();
          Thread.sleep(5000);

          WebElement element = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Add your facility")));
          element.click();
          
         
          
//          WebElement locationaccept = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")));
//          locationaccept.click();
          
         // WebElement turnOnLocation = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("android:id/button1")));
        //  turnOnLocation.click(); 
          
          
      
          WebElement Name = wait.until(ExpectedConditions.presenceOfElementLocated(
        	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
          Name.click();
          Name.sendKeys("My Name");
  		  Thread.sleep(5000);

//          WebElement Phone = wait.until(ExpectedConditions.presenceOfElementLocated(
//        	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
//          Phone.click();
//          Phone.sendKeys("0598");
//  		  Thread.sleep(5000);
//
//  		  
//        	 WebElement City = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select City\")")));
//        	 City.click();
//     		  Thread.sleep(5000);
//
//        	 WebElement BethlehemCity = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bethlehem\")")));
//        	 BethlehemCity.click();
//     		  Thread.sleep(5000);
//     		  
//     		 WebElement Category = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Category\")")));
//        	 Category.click();
//     		  Thread.sleep(5000);
//
//        	 WebElement Hotel = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Hotel\")")));
//        	 Hotel.click();
//     		  Thread.sleep(5000); 
//     		  
//     		  WebElement Whatsapp = wait.until(ExpectedConditions.presenceOfElementLocated(
//          	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
//     		 Whatsapp.click();
//     		 Whatsapp.sendKeys("0598");
//    		//  Thread.sleep(5000);
//
//    		  
//    		  WebElement Website = wait.until(ExpectedConditions.presenceOfElementLocated(
//            	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")));
//    		  Website.click();
//    		  Website.sendKeys("0598");
//      		//  Thread.sleep(5000);
//        	 
//      		 WebElement Facebook = wait.until(ExpectedConditions.presenceOfElementLocated(
//         	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
//      		 Facebook.click();
//      		Facebook.sendKeys("0598");
//      		// Thread.sleep(5000);
//      		 
//      		WebElement Address = wait.until(ExpectedConditions.presenceOfElementLocated(
//         	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(5)")));
//      		Address.click();
//      		Address.sendKeys("0598");
//      		// Thread.sleep(5000);
//      		 
//      		 
//      		WebElement Description = wait.until(ExpectedConditions.presenceOfElementLocated(
//         	        AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(6)")));
//      		Description.click();
//      		Description.sendKeys("Description is here");
//      		Thread.sleep(5000);
         	
      		//scrollToText("Your business image");
  		
  		int x = (501 + 621) / 2;  // Center X
  		int y = (1198 + 1290) / 2; // Center Y

  		// Perform press and release at the given coordinates
  		TouchAction action = new TouchAction(driver);
  		action.press(PointOption.point(x, y))  // Press on the element
  		      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))  // Hold for 200ms
  		      .release()  // Release the press
  		      .perform();


//  		// Use TouchAction to perform a more precise tap
//  		TouchAction action = new TouchAction(driver);
//  		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(imageupload))).perform();
//
//  		// OR Try JavaScript execution for a more reliable click
//  		((JavascriptExecutor) driver).executeScript("arguments[0].click();", imageupload);
//
//  		Thread.sleep(5000);

      		//new UiSelector().resourceId("com.google.android.providers.media.module:id/icon_thumbnail").instance(0)
//      		WebElement selectimage = wait.until(ExpectedConditions.presenceOfElementLocated(
//      			  AppiumBy.androidUIAutomator("new UiSelector().text(\"Albums\")")));
//      		selectimage.click();
//      		Thread.sleep(5000);
//      		
//      		WebElement selectimage2 = wait.until(ExpectedConditions.presenceOfElementLocated(
//        			  AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.LinearLayout\").instance(3)")));
//        		selectimage2.click();
//        		Thread.sleep(5000);
//      		
      		//n
      		 
//             WebElement bethlehem = wait.until(ExpectedConditions.elementToBeClickable(
//                            AppiumBy.androidUIAutomator("new UiSelector().description(\"Bethlehem\")")));
//            bethlehem.click();
//         	Thread.sleep(5000);
        	
         //ok //new UiSelector().resourceId("android:id/button1")
          //new UiSelector().description("City")
          //new UiSelector().description("Select Category")
          //new UiSelector().className("android.widget.EditText").instance(1)
         // new UiSelector().className("android.widget.EditText").instance(2)
          //new UiSelector().className("android.widget.EditText").instance(3)
          //new UiSelector().className("android.widget.EditText").instance(4)
          //new UiSelector().className("android.widget.EditText").instance(4)
          //new UiSelector().className("android.widget.EditText").instance(6)
          
//       WebElement more = driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiSelector().description(\"More\").instance(0))"));
//       more.click();
//		new UiSelector().className("android.widget.ImageView").instance(1)
	}
	
	private void scrollToText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));"
        ));
    }
	
	
//	@AfterMethod
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
}