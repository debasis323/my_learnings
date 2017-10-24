package test;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SetUp;



public class FlipkartTests{

	protected RemoteWebDriver driver;
	SetUp set = new SetUp();
	
	@BeforeTest
	public void setUpFlipkart() throws Exception{
		set.setUpAppiumForFlipkart();
	}
	

	@AfterTest
	public void closeConnections() throws Exception {
		set.tearDown();
	}
	
	@Test
	public void afterTestBlock() throws InterruptedException {
		System.out.println("actual test executes here");
		Thread.sleep(3000);
		}
	
	@Test
	public void invalidSignIn () {
		
	}
	
	@Test
	public void priceRangeTest () {
		
	}
		
	}
	
