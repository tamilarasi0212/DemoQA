package TestCase;

import org.testng.annotations.Test;

import BaseClass.InitialSetup;
import PageObject_Widgets.PO_Alert;
import PageObject_Widgets.PO_Frames;
import PageObject_Widgets.PO_MessageWindow;
import PageObject_Widgets.PO_WebTable;
import PageObject_Widgets.PO_WindowHandling;

public class TC_Widgets extends InitialSetup {
	
/*	@Test(priority =1)
	public void newBrowserWindow() throws Throwable {
		
		PO_WindowHandling winHandleObj = new PO_WindowHandling(driver);
		
		winHandleObj.newBrowserWindow();
	}
	
	@Test(priority =2)
	public void messageWindow() throws Throwable {
		
		PO_MessageWindow msgWinObj = new PO_MessageWindow(driver);
		
		msgWinObj.message_Window();
	}
	
	@Test(priority =3)
	public void AlertWindow() throws Throwable {
		
		PO_Alert alertObj = new PO_Alert(driver);
		
	    alertObj.alert_Window();
	}
	
	@Test(priority =1)
	public void WebTable() throws Throwable {
		
		PO_WebTable tableObj = new PO_WebTable(driver);
		
	  tableObj.web_Table();
		
		}*/
	@Test(priority =1)
	public void frame() throws Throwable {
		
		PO_Frames frameObj = new PO_Frames(driver);
		
	  frameObj.frames();
		
		}
	
	
	}


