package PageObject_Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Frames {
	
	WebDriver ldriver;
	public PO_Frames(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//a[contains(text(),'IFrame practice page')]")
	WebElement framesMenu;
	
	@FindBy(id="IF1")
	WebElement frame1;
	
	@FindBy(id="IF2")
	WebElement frame2;
	
	public void frames() throws Throwable{
		
		widgetsMenu.click();
		framesMenu.click();
		
		Thread.sleep(3000);
		ldriver.switchTo().frame("iframe1");
		
		Thread.sleep(3000);
		ldriver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		ldriver.switchTo().frame("IF2");
		
		}

}
