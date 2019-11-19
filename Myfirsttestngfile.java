package myfirsttestngpackage;

import org.testng.annotations.Test;
import org.hamcrest.core.Is;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Myfirsttestngfile {
	public static WebDriver driver;
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() 
	{
		  return new Object[][] { { "iamteddusandeep@gmail.com", "sandY0264" }, {"sandeepkumar","abcdef"},{"teddusandeep", "Test@123" }};
	}
	
	@Test(dataProvider = "Authentication")
	public void test(String sUsername, String sPassword) 
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		  driver.get("https://www.linkedin.com/login");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("username")).sendKeys(sUsername);
	      driver.findElement(By.id("password")).sendKeys(sPassword);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	           
	      //if(driver.getPageSource().contains("Please enter a valid username")) {
		  //System.out.println("Pass"); }
		 //driver.findElement(By.xpath("//img[@class='nav-item__profile-member-photo nav-item__icon ember-view']")).click();
	 	  driver.quit();
	      
	}
	
	/*
	 * @Test(dataProvider = "dp") public void f(Integer n, String s) { }
	 * 
	 * @DataProvider public Object[][] dp() { return new Object[][] { new Object[] {
	 * 1, "a" }, new Object[] { 2, "b" }, }; }
	 */

	@BeforeTest
 // public void beforeTest() {
	//	System.out.println("This is before TEST method :");
		public void setup(ITestContext ctx) {
			TestRunner runner = (TestRunner) ctx;
			runner.setOutputDirectory("C:\\Users\\steddu\\Desktop\\Output");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after TEST method");
  }

}
