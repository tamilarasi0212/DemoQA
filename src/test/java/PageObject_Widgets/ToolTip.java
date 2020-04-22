package PageObject_Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ToolTip {
	
public WebDriver driver;
	
	@Test
	public void toolTip() throws InterruptedException, Exception {
		
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
	 driver.findElement(By.xpath("//aside[@class='widget']//a[contains(text(),'Tooltip and Double click')]")).click();
	 
	  WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	  
	  Actions ac = new Actions(driver);
	  
	  ac.doubleClick(doubleClick).perform();
	  
	  System.out.println(driver.switchTo().alert().getText());
	  
	  driver.switchTo().alert().dismiss();
	  
	  Thread.sleep(3000);
	  
	  WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	  
	  ac.contextClick(rightClick).perform();
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,200)");
	  
	  Thread.sleep(3000);
	 
	  driver.findElement(By.xpath("//div[contains(text(),'Copy Me')]")).click();
	 
	  System.out.println(driver.switchTo().alert().getText());
	  
	  driver.switchTo().alert().dismiss();
	  
	  Thread.sleep(3000);
	  
	  WebElement mouseOverClick =driver.findElement(By.xpath("//div[@id='tooltipDemo']"));
	  
	  ac.moveToElement(mouseOverClick).perform();;
	  
	  String actualToolTip = driver.findElement(By.xpath("//span[@class='tooltiptext']")).getText();
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(actualToolTip.contains("We ask for your"));
	
	  System.out.println(actualToolTip);
	  
	  driver.close();
			  
			  
	 
	}
	 


}
