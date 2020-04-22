package PageObject_Widgets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	public WebDriver driver;
	
@Test
	public void webTable() {
		
	 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Automation practice table')]")).click();
	 
	int row = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr")).size();
	int col =  driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr/th")).size();
	 
	 
		System.out.println(row);
		System.out.println(col);
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<col;j++)
			{
				System.out.print(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table/thead/tr["+i+"]/th["+j+"]")).getText());
			}
			
			System.out.println();
				
				}
	}

@Test(enabled=false)
public void uploadAutoIT() throws Throwable {
	
 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://demoqa.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
 driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
 driver.findElement(By.xpath("//a[contains(text(),'Automation practice form')]")).click();
 
 WebElement chooseFileBtn=  driver.findElement(By.id("photo"));
 

 JavascriptExecutor js = (JavascriptExecutor)driver;
 Thread.sleep(3000);
 js.executeScript("arguments[0].click()",chooseFileBtn);
 
 Thread.sleep(3000);
 Runtime.getRuntime().exec("C:\\AutoIT\\autoITFile.exe"+" "+"C:\\PerTamil\\TamilJobs\\NewJob\\sqlqueries");
 Thread.sleep(3000);
 
 System.out.println("File Uploaded");
}
}













