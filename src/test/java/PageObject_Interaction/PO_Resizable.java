package PageObject_Interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Resizable {
	
	WebDriver ldriver;
	public PO_Resizable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement interactionsMenu;
	
	@FindBy(xpath="//div[@class='demo-frame']//a[contains(text(),'Resizable')]")
	WebElement resizable;
	
	@FindBy(xpath="//div[@class='ui-resizable-handle ui-resizable-e']")
	WebElement arrowMark;
	
	public void Resizable_menu() throws InterruptedException {
		interactionsMenu.click();
		resizable.click();
		
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(ldriver);
		
		ac.clickAndHold(arrowMark).moveByOffset(60,20).release(arrowMark).build().perform();
		Thread.sleep(4000);
	}

}
