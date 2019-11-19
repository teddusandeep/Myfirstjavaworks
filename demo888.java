package com.demo;
import java.sql.DriverAction;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;



public class demo888 {	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//button[contains(text(),\"Close Menu\")]")).click();
		driver.findElement(By.xpath("//button[text()=\"Open Menu\"]")).click();
		driver.findElement(By.xpath("//a[@id='reset_sidebar_link']")).click();
	
		//driver.close();
		

	}}

