import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DND {				

    WebDriver driver;			

    @Test		
    public void DragnDrop()					
    {		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");					
         driver= new ChromeDriver();			
         driver.get("http://demo.guru99.com/test/drag_drop.html");					
         driver.manage().window().maximize();
         
         WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         Actions act=new Actions(driver);					
         act.dragAndDrop(From, To).build().perform();
          //driver.quit();
	}		
}