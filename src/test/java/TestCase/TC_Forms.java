package TestCase;

import org.testng.annotations.Test;

import BaseClass.InitialSetup;
import PageObject_Widgets.PO_Forms;


public class TC_Forms extends InitialSetup{
	
	@Test
	public void formsMenu() {
	
	PO_Forms formObj = new PO_Forms(driver);
	
	formObj.forms();

}
}