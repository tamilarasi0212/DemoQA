package PageObject_Interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_Dropable {
	
	public WebDriver ldriver;
	
	public PO_Dropable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement interactionsMenu;
	
	@FindBy(xpath="//div[@class='demo-frame']//a[contains(text(),'Droppable')]")
	WebElement dropable;
	
	@FindBy(xpath="//div[@id='draggable']")
	WebElement drag;
	
	@FindBy(xpath="//div[@id='droppable']")
	WebElement drop;
	
	public void dropable_menu() throws InterruptedException {
		
		interactionsMenu.click();
		dropable.click();
		Thread.sleep(3000);
		Actions ac = new Actions(ldriver);
		ac.dragAndDrop(drag, drop).perform();
		
	}

}
