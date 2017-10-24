package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;

public class JustTest {
	protected static WebDriver driver;
	
	
	@BeforeTest
	public void setUpAppiumForAmazon() throws MalformedURLException{
//		str="testing....";
//		service = AppiumDriverLocalService.buildDefaultService();
		System.out.println("Touched before test block");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName",MobileBrowserType.CHROME); //leaving it blank will pick the default browser
		//cap.setCapability("browserName","");
		cap.setCapability("appium-version", "1.6.3");
		cap.setCapability("VERSION","6.0.1");
		cap.setCapability("deviceName","Galaxy S5"); //for physical phone just keep "ANDROID"
		cap.setCapability("platformName","ANDROID");
//		cap.setCapability("chromedriverExecutable", "/Users/pattnd01/Documents/Workspace201/chromedriver");
//		cap.setCapability("appPackage", "com.android.browser");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity","com.android.browser.BrowserActivity");
		//System.setProperty("webdriver.chrome.driver", "/Users/pattnd01/Desktop/deleteIt4.35Release/chromedriver");
//System.out.println(str);
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.get("https://www.amazon.in");
//		System.out.println("driver = "+driver.toString());
//		driver.quit();
		//return driver;
//		return str;
	}
	
	@AfterTest
	public void tearDown() throws Exception{
		if (driver != null) {
			System.out.println("after test");
		driver.quit();
		}
	}
	
	@Test
	public void realTest() {
		System.out.println("in test");
		
		driver.findElement(By.id("nav-search-keywords")).sendKeys("Fire TV");
		driver.findElement(By.id("nav-search-keywords")).sendKeys(Keys.ENTER);
	}

}
