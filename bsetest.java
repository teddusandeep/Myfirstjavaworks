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
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import java.util.Properties;

public class bsetest {

		public static WebDriver driver;
		
		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bseindia.com");
			driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//select[@id='ddltype']")).click();
		 * 
		 * //driver.findElement(By.xpath("//input[@id='getquotesearch']")).
		 * sendKeys("Federal Bank Ltd");
		 * driver.findElement(By.xpath("//body[@ng-app='mktHome']")).getTagName();
		 * //WebElement d=
		 * driver.findElement(By.xpath("//a[contains(text(),'S&P BSE Bharat 22 Index')]"
		 * )); System.out.print(driver.getTitle());
		 */
			driver.findElement(By.xpath("//a[starts-with(text(),'USDINR19NOVFUT')]/parent::td[@class='tdcolumn']")).click();
			
			}
		}

