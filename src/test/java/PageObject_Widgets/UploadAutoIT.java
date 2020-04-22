package PageObject_Widgets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAutoIT {
	
	public WebDriver driver;
	
	@Test
	public void upload() throws InterruptedException, Exception {
		
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
	 driver.findElement(By.xpath("//li[6]//a[1]")).click();
	 
	 WebElement chooseFileBtn=  driver.findElement(By.id("browseFile"));
	 

	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Thread.sleep(3000);
	 js.executeScript("arguments[0].click()",chooseFileBtn);
	 
	 Thread.sleep(3000);
	 Runtime.getRuntime().exec("C:\\AutoIT\\autoITFile.exe"+" "+"C:\\PerTamil\\TamilJobs\\NewJob\\sqlqueries");
	 Thread.sleep(3000);
	 
	 System.out.println("File Uploaded");
	 
	driver.findElement(By.xpath("//button[@id='uploadButton']")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.close();
	}
}
