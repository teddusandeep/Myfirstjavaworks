package com.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nov11 {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		String st= driver.getCurrentUrl();
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("iamteddusandeep@gmail.com");
		password.sendKeys("sandY0264");
		System.out.println("This is the url "+st);
		driver.manage().window().maximize();
	
	}

}
