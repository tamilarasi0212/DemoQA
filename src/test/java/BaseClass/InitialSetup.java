package BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitialSetup {
	
 public WebDriver driver;
 public Logger logger; 
 
 @BeforeClass
 public void setup() {
	 
	 logger = Logger.getLogger("DemoQATest");
	 PropertyConfigurator.configure("Log4j.properties");
	 
	 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void tearDown() {
	
	// driver.quit();
 }
 
}
