package com.demo;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='oneway']")).click();
		//driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).sendKeys("HYD");
		driver.findElement(By.xpath("//a[@class='fb button orange txtTransUpper marginB10 fltHpySrchBtn']")).click();
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("HYD");
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Destination']")).sendKeys("DXB");	
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		driver.findElement(By.xpath("//div[@id='fare_20191108']")).click();		
		String actualUrl="goibibo"; 
		String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualUrl);
		//driver.quit();
		
	}

}
