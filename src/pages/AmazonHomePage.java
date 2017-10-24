package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.accessibility.internal.resources.accessibility;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
import utilities.SetUp;

//import org.openqa.selenium.remote.RemoteWebDriver;
//import utilities.SetUp;



//import io.appium.java_client.MobileDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.pagefactory.AndroidFindBy;

public class AmazonHomePage extends SetUp{
	
//public String s1;

	//	protected RemoteWebDriver driver = null;
//	driver = new RemoteWebDriver();
//	@AndroidFindBy(id="nav-logo")
//	@AndroidFindBy(xpath="//android.view.View[@resource-id='nav-logo']")
//	private MobileElement siteLogo;
	
//	public WebElement siteLogo() {
//		return driver.findElement(By.xpath("//android.view.View[@resource-id='nav-logo']"));
//	}
//	
	
	public void waitForElement(By by) {
		WebDriverWait webDriverWait=new WebDriverWait(driver, 10);
		 webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public WebElement searchField() {
		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("nav-search-keywords")));
		//System.out.println(driver.findElement(By.id("nav-search-keywords")));
		waitForElement(By.id("nav-search-keywords"));
		 return driver.findElement(By.id("nav-search-keywords"));
	}
	

	public WebElement searchButton() {
		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@index='0']")));
		waitForElement(By.xpath("//android.widget.Button[@index='0']"));
		return driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
	}
	
	
	public WebElement firstSearchItem() {
//		waitForElement(By.xpath("//android.view.View[contains(@content-desc,'Prestige Electric Kettle PKOSS 1.8Ltr')]"));
//		return driver.findElement(By.xpath("//android.view.View[@index='0']"));
		//return driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Prestige Electric Kettle')]"));
		return driver.findElement(By.xpath("//span[contains(text(),'Prestige Electric Kettle PKOSS')]"));
	}
	//scroll one page logic here
	
	
	public WebElement addToCart() {
		waitForElement(By.id("add-to-cart-button"));
		return driver.findElement(By.id("add-to-cart-button"));
	}
	
	
	public WebElement deleteFirstItemFromCart() {
		waitForElement(By.xpath("//android.widget.Button[contains(@content-desc,'Delete')]\""));
		return driver.findElement(By.xpath("//android.widget.Button[contains(@content-desc,'Delete')]\""));
	}
	
	
	 public void printTest() throws Exception{
//		 Thread.sleep(2000);
		 
//		 System.out.println(siteLogo().isDisplayed());
		 
//		 Thread.sleep(1000);
		
		 searchField().sendKeys("Prestige kettle");
//		 Thread.sleep(1000);
		 searchField().sendKeys(Keys.ENTER);
		 Thread.sleep(15000);
		 System.out.println(firstSearchItem());
		 firstSearchItem().click();
		 
//		 TouchAction scroll = new TouchAction(driver);
//		 scroll.longPress(67,1652).moveTo(-10,-233).release().perform();
//		 Thread.sleep(1000);
		 addToCart().click();
//		 Thread.sleep(1000);
		 deleteFirstItemFromCart().click();
//		 Thread.sleep(2000);
	 }
}
