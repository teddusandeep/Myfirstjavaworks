package com.demo;

import com.demo.Assert;
import com.google.common.io.Files;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.Properties;

public class demo777 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		System.out.print(driver.getTitle());
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
		username.sendKeys("iamteddusandeep@gmail.com");
		password.sendKeys("sandY0264");
		login.click();
		String actualUrl = "https://www.linkedin.com/feed/";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		driver.findElement(By.xpath("//img[@class='nav-item__profile-member-photo nav-item__icon ember-view']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='block ember-view' and text()='Sign out']")).click();
		driver.close();
		}
	}
