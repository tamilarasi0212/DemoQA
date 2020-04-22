package PageObject_Interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Dragable {
	
	WebDriver ldriver;
	public PO_Dragable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement interactionsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Draggable')]")
	WebElement draggableMenu;
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement dragBox; 
	
	public void draggable_menu() throws Throwable {
		
		interactionsMenu.click();
		draggableMenu.click();
		
		Thread.sleep(4000);
		
		Actions ac = new Actions(ldriver);
		
		ac.clickAndHold(dragBox).moveByOffset(70, 30).release(dragBox).build().perform();
		
		Thread.sleep(4000);
	}

}
