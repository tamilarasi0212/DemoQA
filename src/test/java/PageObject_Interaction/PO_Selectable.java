package PageObject_Interaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PO_Selectable {
	
    WebDriver ldriver;
    
    public PO_Selectable(WebDriver rdriver)
    {
    	PageFactory.initElements(rdriver,this);
    	ldriver = rdriver; 
    }

	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement interactionsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Selectable')]")
	WebElement selectableMenu;
	
	@FindBy(xpath="//*[@id=\"selectable\"]/li[4]")
	WebElement item;
	
	public void selectable_tab() {
		
		interactionsMenu.click();
		
		selectableMenu.click();

		item.click();
	}

}
