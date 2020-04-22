package PageObject_Widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Alert {
	WebDriver ldriver;
	public PO_Alert(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//div[@id='content']//li[1]//a[1]")
	WebElement windowHandlingMenu;
	
	@FindBy(xpath="//button[@id='alert']")
	WebElement alertMenu;
	
public void alert_Window() throws Throwable  {
		
		widgetsMenu.click();
		windowHandlingMenu.click();
        alertMenu.click();
        
        Thread.sleep(3000);
        ldriver.switchTo().alert().accept();

}


}
