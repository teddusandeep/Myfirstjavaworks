package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo789 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.print(driver.getTitle());
		driver.manage().window().maximize();

	}}
