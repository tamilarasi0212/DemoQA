package PageObject_Widgets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_MessageWindow {
	
	WebDriver ldriver;
	public PO_MessageWindow(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//div[@id='content']//li[1]//a[1]")
	WebElement windowHandlingMenu;
	
	@FindBy(xpath="//button[contains(text(),'New Message Window')]")
	WebElement messageWindow;
	
	public void message_Window() throws Throwable {
		
		widgetsMenu.click();
		windowHandlingMenu.click();
		messageWindow.click();
		
		Thread.sleep(3000);
		
		String MainWindow = ldriver.getWindowHandle();
		Set<String> s = ldriver.getWindowHandles();
		Iterator<String> it = s.iterator();
		
		while(it.hasNext())
		{
			String ChildWindow = it.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				ldriver.switchTo().window(ChildWindow);
				ldriver.close();
			}
		}
			
			ldriver.switchTo().window(MainWindow);
			Thread.sleep(3000);
		
	}

}
