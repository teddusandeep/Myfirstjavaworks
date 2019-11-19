package com.demo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gm_login {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("https://mail.google.com/");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("iamteddusandeep");
		driver.findElement(By.xpath("//span[@class=\'RveJvd snByac\']")).click();
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("sandY0264");
		//driver.findElement(By.name("password")).submit();
		//driver.findElement(By.xpath("//*[@id='passwordNext' and text()='Next']")).click(); 
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandY0264");
		//driver.findElement(By.id("//div[@id='passwordNext']")).click();
		
		try {
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click(); 
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();

		
	}

}
