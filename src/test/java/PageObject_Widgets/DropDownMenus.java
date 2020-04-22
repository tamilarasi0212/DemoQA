package PageObject_Widgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownMenus {

	public WebDriver driver;
	
	@Test
	public void Menus() throws InterruptedException, Exception {
		
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://demoqa.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Menu')]")).click();
	 
	WebElement Music = driver.findElement(By.cssSelector("body.post-template-default.single.single-post.postid-44.single-format-standard.wp-embed-responsive.singular.image-filters-enabled:nth-child(2) div.clearfix.row:nth-child(3) div.content-right.twelve.columns div.demo-frame:nth-child(4) ul.ui-menu.ui-widget.ui-widget-content:nth-child(6) li.ui-menu-item:nth-child(6) div.ui-menu-item-wrapper.ui-state-active > span.ui-menu-icon.ui-icon.ui-icon-caret-1-e"));
	WebElement Rock = driver.findElement(By.cssSelector("body.post-template-default.single.single-post.postid-44.single-format-standard.wp-embed-responsive.singular.image-filters-enabled:nth-child(2) div.clearfix.row:nth-child(3) div.content-right.twelve.columns div.demo-frame:nth-child(4) ul.ui-menu.ui-widget.ui-widget-content:nth-child(6) li.ui-menu-item:nth-child(6) ul.ui-menu.ui-widget.ui-widget-content.ui-front li.ui-menu-item:nth-child(1) div.ui-menu-item-wrapper.ui-state-active > span.ui-menu-icon.ui-icon.ui-icon-caret-1-e"));
	
	
	WebElement MusicMenu = driver.findElement(By.id("ui-id-9"));
	WebElement RockMenu = driver.findElement(By.id("ui-id-10"));
	WebElement ClassicMenu = driver.findElement(By.id("ui-id-12"));
	
	 Actions ac = new Actions(driver);
	 ac.moveToElement(Music).click(Music)
	 .moveToElement(Rock).click(Rock)
	 .moveToElement(ClassicMenu)
	 .build()
	 .perform();
	 
	 driver.quit();
	 
	}

}
