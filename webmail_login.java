package com.demo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class webmail_login {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=0&client-request-id=be88a43a-b075-41c1-80a8-892ac99837fb&protectedtoken=true&domain_hint=evoketechnologies.com&nonce=637087876769819213.c1376b88-c1c4-4fc8-ae43-bfdb7a203700&state=DctBDoMgEEBRqHfpqigIYcaF6VlgHFtTkKQ1ev3O4v3d10qpTtyEthIF0YNFQIgQJ3TT6HxPzkPMiIYcBRNWQpM4eJPXJUMarRxWy_sY2pWG55dTqTOf7cMH03tvpb02_vXU6v1c5otzTVv5Aw");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("steddu@evoketechnologies.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Enter Password  
		driver.findElement(By.id("i0118")).sendKeys("sandY0264");
		//driver.findElement(By.id("idSIButton9")).click();
		//driver.findElement(By.id("//*([@id='idSIButton9'])")).click();
		//WebElement login= 
		//driver.findElement(By.xpath("//input([@type='submit'])")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//login.click(); 
		//
		/*
		 * try { Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ENTER); } catch
		 * (AWTException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.close();
		
	}

}