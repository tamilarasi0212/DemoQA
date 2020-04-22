package PageObject_Widgets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PO_WebTable {

	WebDriver ldriver;
	public PO_WebTable(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement widgetsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Automation practice table')]")
	WebElement tableMenu;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr['+i+']/th['+j+']")
	//WebElement webTable;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr")
	List<WebElement> row;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr[1]/th")
	List<WebElement> col;
	
	
    public void web_Table() {
		
		widgetsMenu.click();
		tableMenu.click();
		
		int r = row.size();
		System.out.println(r);
		
		int c = col.size();
		System.out.println(c);
		
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				System.out.print(ldriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/table[1]/thead[1]/tr["+i+"]/th["+j+"]")).getText());
			}
			
			System.out.println();
				
				}
	}
}
