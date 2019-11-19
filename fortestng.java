package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fortestng {

	public WebDriver driver;

	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("account")).click();
		System.out.println("hello this is  First Test method executing first ");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// driver.quit();
	}

	@Test
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.findElement(By.id("account")).click();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		/*
		 * WebElement username = driver.findElement(By.id("username")); WebElement
		 * password = driver.findElement(By.id("password")); WebElement login =
		 * driver.findElement(By.xpath("//button[text()='Sign in']"));
		 * username.sendKeys("iamteddusandeep@gmail.com");
		 * password.sendKeys("sandY0264"); login.click(); System.out.
		 * println(" Login Successfully, now it is the time to Log Off buddy.");
		 * driver.findElement(By.
		 * xpath("//img[@class='nav-item__profile-member-photo nav-item__icon ember-view']"
		 * )).click(); driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 * driver.findElement(By.
		 * xpath("//a[@class='block ember-view' and text()='Sign out']")).click();
		 * driver.close();
		 * 
		 * }
		 */
	}
	// @BeforeMethod

	@Test
	public void Test1() {
		// Create a new instance of the Firefox driver
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// Put a Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("this is second Test method executing now :");
		String actualtitle = driver.getTitle();
		System.out.println("the title of the page is ," + actualtitle);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		assertEquals(expectedTitle, actualtitle);
		System.out.println("Both the titles are same and hence texecuting this line");
		// driver.quit();
	}

	// @AfterMethod
	@Test
	public void Test2() {
		// Close the driver
		driver = new ChromeDriver();
		driver.get("http://www.linkedin.com");
		driver.manage().window().maximize();
		System.out.println("this is last Test2 method executing and will close now and end the test cases execution");
		/*
		 * String expectedTitle ="flipkart"; String actualtitle=driver.getTitle();
		 * assertEquals(expectedTitle, actualtitle);
		 */
		// driver.quit();

	}

	@Test
	public void Test3() {
		// Close the driver
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		System.out.println("this is last Test3 method executing and will close now and end the test cases execution");
		/*
		 * String expectedTitle ="gmail"; String actualtitle=driver.getTitle();
		 * assertEquals(expectedTitle, actualtitle);
		 */
		// driver.quit();
	}

	@AfterEach
	private void AfterTest() {
		// TODO Auto-generated method stub
		driver.quit();
		driver.close();
	}

	@BeforeEach
	private void BeforeEach() {
		System.out.println("This is executed before all the methods");
	}
}
