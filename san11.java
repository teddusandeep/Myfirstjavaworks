package com.demo;

import com.demo.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class san11 {
	public static WebDriver driver;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize(); 
		System.out.print(driver.getTitle());
		WebElement username=driver.findElement(By.id("username")); 
		WebElement password=driver.findElement(By.id("password")); 
		WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
		username.sendKeys("iamteddusandeep@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		password.sendKeys("sandY0264"); 
		login.click(); 
		String actualUrl="https://www.linkedin.com/feed/"; 
		String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualUrl);
		driver.findElement(By.xpath("//img[@class='nav-item__profile-member-photo nav-item__icon ember-view']")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.id("mynetwork-tab-icon")).click();
		driver.findElement(By.xpath("//a[@class='block ember-view' and text()='Sign out']")).click();
		driver.close();

	}

}
