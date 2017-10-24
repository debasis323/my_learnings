package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;



public class SetUp {
	
//	protected RemoteWebDriver driver;
//	@SuppressWarnings("rawtypes")
	protected static WebDriver driver;
//	protected static  String str ; 
	
	
	public void setUpAppiumForFlipkart() throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		System.out.println("Touched before test block");
		
		cap.setCapability("appium-version", "1.6.3");
		cap.setCapability("VERSION","6.0.1");
		cap.setCapability("deviceName","Galaxy S6"); //Android Emulator
		cap.setCapability("platformName","ANDROID");
		cap.setCapability("noReset",true);
//		cap.setCapability("no", "true");
//		cap.setCapability("newCommandTimeout", 100000);
		cap.setCapability("appPackage", "com.flipkart.android");
		cap.setCapability("appActivity","com.flipkart.android.SplashActivity");
		cap.setCapability("app", "/Users/pattnd01/Documents/Workspace201/apps/flipkart.apk");

		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}

	
	@SuppressWarnings("rawtypes")
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
	
	public void tearDown() throws Exception{
		if (driver != null) {
		driver.quit();
		}
	}
	
}
