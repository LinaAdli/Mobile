package QA_Bootcamp_Maven.MyApplication;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;
import org.testng.annotations.DataProvider;

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
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
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

public class TourPalestineOrganized {

    private AndroidDriver driver;

    private By letGoButton = AppiumBy.accessibilityId("Let's Go");
    private By giftsAndAntiques = AppiumBy.accessibilityId("Gifts and Oriental Antiques");
    private By moreButton = By.xpath("(//android.widget.ImageView[@content-desc='More'])[1]");
    private By phonecall = By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]");
    private By location = By.xpath("//android.widget.ScrollView/android.widget.ImageView[3]");
    
    private By icon1 = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)");
    private By icon2 = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)");
    private By icon3 = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(7)");
    private By icon4 = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(8)");
    
    private By hebron = By.xpath("//android.view.View[@content-desc=\"Hebron\"]");
    private By image = By.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View/android.widget.ImageView[2]");
    private By mainButton = AppiumBy.className("android.widget.Button");
    private By english = AppiumBy.accessibilityId("English");
    private By arabic = AppiumBy.accessibilityId("العربية");
    private By addFacility = AppiumBy.accessibilityId("Add your facility");
    private By turkey = AppiumBy.accessibilityId("turkey");

    private By LocationAccept2 = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_one_time_button\")");
    private By locationAccept = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    private By nameField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
    private By phoneField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private By citySelector = AppiumBy.androidUIAutomator("new UiSelector().description(\"Select City\")");
    private By bethlehemCity = AppiumBy.androidUIAutomator("new UiSelector().description(\"Bethlehem\")");
    private By categorySelector = AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Category\")");
    private By hotelCategory = AppiumBy.androidUIAutomator("new UiSelector().description(\"Hotel\")");
    private By whatsappField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private By websiteField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)");
    private By facebookField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)");
    private By addressField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(5)");
    private By descriptionField = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(6)");
    private By submitButton = AppiumBy.androidUIAutomator("new UiSelector().description(\"Submit\")");
    private By okayButton = AppiumBy.androidUIAutomator("new UiSelector().description(\"Okay\")");
    
    private By CulturalOrganization = AppiumBy.androidUIAutomator("new UiSelector().description(\"Cultural Organization\")");


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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

   @Test (priority = 1)
   public void GiftsTest() throws InterruptedException {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));

       WebElement LetGoButton = wait.until(ExpectedConditions.elementToBeClickable(letGoButton));
       LetGoButton.click();
       driver.findElement(
               AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" 
                       + "new UiSelector().description(\"Gifts and Oriental Antiques\"))"));

       WebElement Gifts = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(giftsAndAntiques)));
       Gifts.click();

       WebElement moreButton = driver.findElement(this.moreButton);
       moreButton.click();

       WebElement phonecall = driver.findElement(this.phonecall);
       phonecall.click();
       	for (int i = 0; i < 3; i++) {
           ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
           Thread.sleep(2000);
       	}
       	
       WebElement location = driver.findElement(this.location);
       location.click();
       driver.executeScript("mobile: shell", ImmutableMap.of("command", "sleep 10"));
       ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

       WebElement Hebron = wait.until(
               ExpectedConditions.elementToBeClickable(this.hebron));
       Hebron.click();

       WebElement image = wait.until(ExpectedConditions.elementToBeClickable(this.image));
       image.click();
       Thread.sleep(5000);
       ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
       Thread.sleep(5000);

       WebElement mainbutton = wait
               .until(ExpectedConditions.elementToBeClickable(this.mainButton));
       mainbutton.click();

       WebElement English = wait.until(ExpectedConditions.elementToBeClickable(this.english));
       English.click();
       WebElement Arabic = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
       Arabic.click();
       Thread.sleep(5000);

       WebElement mainbutton2 = wait
               .until(ExpectedConditions.elementToBeClickable(this.mainButton));
       mainbutton2.click();
       WebElement Arabic2 = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
       Arabic2.click();
       Thread.sleep(5000);

       WebElement English2 = wait.until(ExpectedConditions.elementToBeClickable(this.english));
       English2.click();
       Thread.sleep(5000);
   }
    
   @Test (priority = 2)
   public void CulturalOrganizationTest() throws InterruptedException {

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));

       WebElement LetGoButton = wait.until(ExpectedConditions.elementToBeClickable(letGoButton));
       LetGoButton.click();
       driver.findElement(
               AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" 
                       + "new UiSelector().description(\"Cultural Organization\"))"));

       WebElement CulturalOrganization2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CulturalOrganization)));
       CulturalOrganization2.click();

       
       WebElement moreButton = driver.findElement(this.moreButton);
       moreButton.click();


    WebElement icon1 = wait.until(ExpectedConditions.elementToBeClickable(this.icon1));
    icon1.click();
    for (int i = 0; i < 3; i++) {
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(5000);
    }

    WebElement icon2 = wait.until(ExpectedConditions.elementToBeClickable(this.icon2));
    icon2.click();
    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(5000);


    WebElement icon3 = wait.until(ExpectedConditions.elementToBeClickable(this.icon3));
    icon3.click();
    Thread.sleep(5000);

   // ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    

    WebElement icon4 = wait.until(ExpectedConditions.elementToBeClickable(this.icon4));
    icon4.click();
    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    Thread.sleep(5000);


       WebElement image = wait.until(ExpectedConditions.elementToBeClickable(this.image));
       image.click();
       Thread.sleep(5000);
       ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
       Thread.sleep(5000);

       WebElement mainbutton = wait
               .until(ExpectedConditions.elementToBeClickable(this.mainButton));
       mainbutton.click();

       WebElement English = wait.until(ExpectedConditions.elementToBeClickable(this.english));
       English.click();
       WebElement Arabic = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
       Arabic.click();
       Thread.sleep(5000);

       WebElement mainbutton2 = wait
               .until(ExpectedConditions.elementToBeClickable(this.mainButton));
       mainbutton2.click();
       WebElement Arabic2 = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
       Arabic2.click();
       Thread.sleep(5000);

       WebElement English2 = wait.until(ExpectedConditions.elementToBeClickable(this.english));
       English2.click();
       Thread.sleep(5000);
   }


      


    @Test(priority = 3, dataProvider = "facilityData")
    public void AddYourFacilityTest(String name, String phone, String whatsapp, String website, String facebook, String description) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement LetGoButton = wait.until(ExpectedConditions.elementToBeClickable(letGoButton));
        LetGoButton.click();

        Assert.assertTrue(driver.findElement(mainButton).isDisplayed(), "Main button not displayed after clicking LetGo.");

        WebElement mainbutton3 = wait.until(ExpectedConditions.elementToBeClickable(this.mainButton));
        mainbutton3.click();
        Thread.sleep(5000);

        WebElement Facility = wait.until(ExpectedConditions.elementToBeClickable(this.addFacility));
        Facility.click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(nameField).isDisplayed(), "Add you Facility page is not displayed");

////        try {
////            WebElement locationaccept = wait.until(ExpectedConditions.elementToBeClickable(this.locationAccept));
////            locationaccept.click();
////        } catch (NoSuchElementException e) {
////            System.out.println("The location accept button was not found.");
////            e.printStackTrace();
////        }
        
    	WebElement locationaccept = wait.until(ExpectedConditions.elementToBeClickable(
				AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button")));
		locationaccept.click();
        Thread.sleep(5000);

        WebElement Name = wait.until(ExpectedConditions.presenceOfElementLocated(this.nameField));
        Name.click();
        Name.sendKeys(name);
        Thread.sleep(2000);
        

        WebElement Phone = wait.until(ExpectedConditions.presenceOfElementLocated(this.phoneField));
        Phone.click();
        Phone.sendKeys(phone);
        Thread.sleep(2000);


        WebElement City = wait.until(ExpectedConditions.presenceOfElementLocated(this.citySelector));
        City.click();
        WebElement BethlehemCity = wait.until(ExpectedConditions.presenceOfElementLocated(this.bethlehemCity));
        BethlehemCity.click();
        Thread.sleep(2000);


        Assert.assertTrue(driver.findElement(bethlehemCity).isDisplayed(), "City selection failed.");

        WebElement Category = wait.until(ExpectedConditions.presenceOfElementLocated(this.categorySelector));
        Category.click();
        WebElement Hotel = wait.until(ExpectedConditions.presenceOfElementLocated(this.hotelCategory));
        Hotel.click();
        Thread.sleep(2000);


        Assert.assertTrue(driver.findElement(hotelCategory).isDisplayed(), "Category selection failed.");

        WebElement Whatsapp = wait.until(ExpectedConditions.presenceOfElementLocated(this.whatsappField));
        Whatsapp.click();
        Whatsapp.sendKeys(whatsapp);

        Assert.assertEquals(Whatsapp.getText(), whatsapp, "Whatsapp field does not have correct text.");

        WebElement Website = wait.until(ExpectedConditions.presenceOfElementLocated(this.websiteField));
        Website.click();
        Website.sendKeys(website);
        Thread.sleep(2000);



        WebElement Facebook = wait.until(ExpectedConditions.presenceOfElementLocated(this.facebookField));
        Facebook.click();
        Facebook.sendKeys(facebook);
        Thread.sleep(2000);



        WebElement Address = wait.until(ExpectedConditions.presenceOfElementLocated(this.addressField));
        Address.click();
        Address.sendKeys("0598");
        Thread.sleep(2000);



        WebElement Description = wait.until(ExpectedConditions.presenceOfElementLocated(this.descriptionField));
        Description.click();
        Description.sendKeys(description);
        Thread.sleep(5000);


        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"Submit\"))"));
        int startX = 501;
        int startY = 1198;
        int endX = 621;
        int endY = 1290;

        int centerX = (startX + endX) / 2;
        int centerY = (startY + endY) / 2;
        Thread.sleep(2000);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(centerX, centerY)).perform();
        Thread.sleep(2000);

        WebElement SubmitButton = driver.findElement(this.submitButton);
        Assert.assertTrue(SubmitButton.isDisplayed(), "Submit button is not displayed.");

        SubmitButton.click();
        
        try {
            WebElement Okay = driver.findElement(this.okayButton);
            Assert.assertTrue(Okay.isDisplayed(), "Okay button is not displayed.");
            Okay.click();
        } catch (NoSuchElementException e) {
            System.out.println("Okay button not found.");
        }
    }
        
        @DataProvider(name = "facilityData")
        public Object[][] facilityData() {
            return new Object[][] {
               // { "//", "0598123456", "+970598123456", "https://www.facebook.com/", "https://www.facebook.com/", "Description is here" },
                { "My Name5", "0598123456", "0598", "0598", "0598", "Description is here" }

            };
        }
    
    @Test (priority = 4)
    public void Language() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));

        WebElement LetGoButton = wait.until(ExpectedConditions.elementToBeClickable(letGoButton));
        LetGoButton.click();
 

        WebElement mainbutton = wait
                .until(ExpectedConditions.elementToBeClickable(this.mainButton));
        mainbutton.click();

        WebElement English = wait.until(ExpectedConditions.elementToBeClickable(this.english));
        English.click();
        WebElement Arabic = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
        Arabic.click();
        Thread.sleep(5000);
        
        WebElement mainbutton2 = wait
                .until(ExpectedConditions.elementToBeClickable(this.mainButton));
        mainbutton2.click();
        WebElement Arabic2 = wait.until(ExpectedConditions.elementToBeClickable(this.arabic));
        Arabic2.click();
        Thread.sleep(5000);


        WebElement Turkey = wait.until(ExpectedConditions.elementToBeClickable(this.turkey));
        Turkey.click();
        Thread.sleep(5000);

       
    }
}
            


    

