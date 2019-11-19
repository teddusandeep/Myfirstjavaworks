import org.hamcrest.core.IsNull;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.xml.xpath.XPath;

public class demoxpath {
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steddu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("config.properties");
	   	prop.load(input);
		driver.get(prop.getProperty("demourl"));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sandeep");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Teddu");
		driver.findElement(By.name("phone")).sendKeys("9177592287");
		driver.findElement(By.id("username")).sendKeys("san07dip1@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("1-8-801,67SRT,PrakashNagar");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("500016");
		//driver.findElement(By.name("country")).click();
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("INDIA");
		//drpcountry.selectByValue("INDIA");
		//drpcountry.selectByIndex(107);
		//input[@id='email']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sandeep_Teddu");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("sandY0264");
		driver.findElement(By.xpath("//input[@type='password' and @name='confirmPassword']")).sendKeys("sandY0264");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//sendKeys("Keys.ENTER");
		//driver.quit();
			}

}
