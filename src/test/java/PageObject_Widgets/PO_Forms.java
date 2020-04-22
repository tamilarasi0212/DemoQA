package PageObject_Widgets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PO_Forms {
	
	WebDriver ldriver;
	public PO_Forms(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;

	@FindBy(xpath="//a[contains(text(),'Automation practice form')]")
	WebElement formsMenu;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastName;
	
	@FindBy(id="sex-1")
	WebElement sex;
	
	@FindBy(xpath="//input[4]")
	WebElement yearOfExp;
	
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement date;
	
	@FindBy(id="profession-1")
	WebElement profession;
	
	@FindBy(xpath="//input[@name='photo']")
	WebElement upload;
	
	@FindBy(xpath="//a[contains(text(),'Selenium Automation Hybrid Framework')]")
	WebElement download;
	
	@FindBy(xpath="//div[29]//input[3]")
	WebElement tool;
	
	@FindBy(id="continents")
	WebElement continents;
	
	@FindBy(id="continentsmultiple")
	WebElement continentsMultiple;
	
	@FindBy(id="selenium_commands")
	WebElement seleniumCommands;
	
	public void forms() {
		
		widgetsMenu.click();
		formsMenu.click();
		firstName.sendKeys("Mickey");
		lastName.sendKeys("Mouse");
		sex.click();
		yearOfExp.click();
		date.sendKeys("24/5/2019");
		profession.click();
		upload.sendKeys("C:\\PerTamil\\TamilJobs\\NewJob\\sqlqueries.txt");
		download.click();
		tool.click();
		
		Select st1 = new Select(continents);
		st1.selectByVisibleText("Asia");
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		
		
		Select st2 = new Select(continentsMultiple);
		js.executeScript("window.scrollBy(0,50)");
		st2.selectByVisibleText("North America");
		
		Select st3 = new Select(seleniumCommands);
		js.executeScript("window.scrollBy(0,50)");
		st3.selectByVisibleText("WebElement Commands");
	}
}
