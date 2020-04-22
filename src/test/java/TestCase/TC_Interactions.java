package TestCase;

import org.testng.annotations.Test;

import BaseClass.InitialSetup;
import PageObject_Interaction.PO_Dragable;
import PageObject_Interaction.PO_Dropable;
import PageObject_Interaction.PO_Resizable;
import PageObject_Interaction.PO_Selectable;
import PageObject_Interaction.PO_Sortable;

public class TC_Interactions extends InitialSetup {


	@Test(priority = 1)
	public void sortable_menu() throws Throwable {
		
		PO_Sortable sortObj = new PO_Sortable(driver);

		logger.info("Sorted Items");

		sortObj.sortable_menu();
	}

	@Test(priority = 2)
	public void selectable_menu() {

		PO_Selectable selectableObj = new PO_Selectable(driver);

		logger.info("clicked the selectable menu");

		selectableObj.selectable_tab();

	}
	
	@Test(priority=3)
	public void resizable_menu() throws Exception {
		
		PO_Resizable resizeObj = new PO_Resizable(driver);
		
		logger.info("Resized the window");
		
		resizeObj.Resizable_menu();
		
	}
	
	@Test(priority=4)
	public void Dropable_menu() throws InterruptedException {
		
		PO_Dropable dropObj = new PO_Dropable(driver);
		

		logger.info("Clicked the dropable menu");
		dropObj.dropable_menu();
	}
	
	@Test(priority=5)
	public void Dragable_menu() throws Throwable {
		
		PO_Dragable dragObj = new PO_Dragable(driver);
		
		logger.info("Clicked the dragable menu");
		dragObj.draggable_menu();
	}

}
