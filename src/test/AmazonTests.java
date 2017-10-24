package test;

import pages.AmazonHomePage;
import utilities.SetUp;

import org.testng.annotations.Test;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


public class AmazonTests{
	SetUp set = new SetUp();
//	protected RemoteWebDriver driver;
	AmazonHomePage amazon;

	@BeforeTest
	public void setUpAmazon() throws Exception{
		set.setUpAppiumForAmazon();
		amazon = new AmazonHomePage();
	}

	@AfterTest
	public void closeConnections () throws Exception{
		set.tearDown();
	}


	@Test
	public void atTest() throws Exception{
		System.out.println("in test block");
		Thread.sleep(1000);
	}
	
	@Test
	public void checkAmazonLogoShown() throws Exception{
	amazon.printTest();	
	}
	
	@Test
	public void checkItemAddedSuccessfully () {
		
	}
	
	@Test
	public void itemDeletedFromBasket () {
		
	}
	
	

}