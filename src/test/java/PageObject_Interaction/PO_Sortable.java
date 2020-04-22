package PageObject_Interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PO_Sortable {
	
	WebDriver ldriver;
	public PO_Sortable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement interactionsMenu;
	
	@FindBy(xpath="//div[@class='demo-frame']//a[contains(text(),'Sortable')]")
	WebElement sortableMenu;
	
	@FindBy(xpath="//li[contains(text(),'Item 2')]")
    WebElement item2;
	
	@FindBy(xpath="//li[contains(text(),'Item 5')]")
	WebElement item5;
	
	
	public void sortable_menu() throws Throwable {
		
		interactionsMenu.click();
		sortableMenu.click();
		
		Thread.sleep(3000);
		
		Actions ac = new Actions(ldriver);
		
		ac.clickAndHold(item2).moveByOffset(0,50).release(item2).build().perform();
		ac.clickAndHold(item5).moveByOffset(0,50).release(item5).build().perform();
		
		Thread.sleep(3000);	
		
		}
}
