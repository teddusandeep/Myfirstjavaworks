package com.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import com.demo.AfterMethod;
import com.demo.BeforeMethod;

public class mytestngdemo {
	public WebDriver driver;
	
	//public String testURL = "http://www.swtestacademy.com/";
		 
		    //-----------------------------------Suite Suite-----------------------------------
		    //You can set suite level setup such as test environment, Database connection string etc.
		    @Before
		    public void setupSuite () {
		        System.out.println("@BeforeSuite started.");
		    }
		 
		    //-----------------------------------All Tests Setup-----------------------------------
		    //All Tests setup
		    @Before
		    public void setupTests () {
		        System.out.println("@BeforeTest started.");
		    }
		 
		    //-----------------------------------Class Setup-----------------------------------
		    //All Tests setup
		    @BeforeClass
		    public void setupClass () {
		        System.out.println("@BeforeClass started.");
		    }
		 
		    //-----------------------------------Test Setup-----------------------------------
		    @BeforeMethod
		    public void setupTest (){
		        //Print console that code is in @BeforeMethod!
		        System.out.println("@BeforeMethod has started.");
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		        //Create a new ChromeDriver
		        driver = new ChromeDriver();
		    }
		 
		    //-----------------------------------Tests-----------------------------------
		    @Test
		    public void firstTest () {
		        System.out.println("First Test is Started.");
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		        String testURL;
				//Go to www.swtestacademy.com
		        driver.navigate().to(testURL);
		 
		        //Get page title
		        String title = driver.getTitle();
		 
		        //Print page's title
		        System.out.println("Page Title: " + title);
		    }
		 
		    @Test
		    public void secondTest () {
		        System.out.println("Second Test is Started.");
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		        //Go to www.amazon.com
		        driver.navigate().to("https://www.amazon.com/");
		 
		        //Get page title
		        String title = driver.getTitle();
		 
		        //Print page's title
		        System.out.println("Page Title: " + title);
		    }
		 
		    //-----------------------------------Test TearDown-----------------------------------
		    @AfterMethod
		    public void teardownTest (){
		        System.out.println("@AfterMethod has started.");
		        //Close browser and end the session
		        driver.quit();
		    }
		 
		    //-----------------------------------Class TearDown-----------------------------------
		    @AfterClass
		    public void teardownClass (){
		        System.out.println("@AfterClass has started.");
		    }
		 
		    //-----------------------------------All Tests TearDown-----------------------------------
		    @After
		    public void teardownTests (){
		        System.out.println("@AfterTest has started.");
		    }
		 
		    //-----------------------------------Suite TearDown-----------------------------------
		    @After
		    public void teardownSuite (){
		        System.out.println("@AfterSuite has started.");
		    }
		}
