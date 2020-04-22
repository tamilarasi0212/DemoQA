package PageObject_Widgets;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_WindowHandling {
	
	WebDriver ldriver;
	public PO_WindowHandling(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//div[@id='content']//li[1]//a[1]")
	WebElement windowHandlingMenu;
	
	@FindBy(id="button1")
	WebElement newBrowserWindow;
	
	
	public void newBrowserWindow() throws Throwable {
		
		widgetsMenu.click();
		windowHandlingMenu.click();
		newBrowserWindow.click();

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
	

