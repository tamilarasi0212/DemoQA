package PageObject_Widgets;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
public WebDriver driver;
	
	@Test
	public void toolTip() throws InterruptedException, Exception {
		
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("http://newtours.demoaut.com/");
	 driver.manage().window().maximize();
	 
	 Thread.sleep(5000);
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 System.out.println(links.size());
	 
	 for(int i=0;i<links.size();i++)
	 {
		 WebElement element = links.get(i);
		 String url = element.getAttribute("href");
		 
		 URL linkUrl = new URL(url);
		 
		 HttpURLConnection httpconn = (HttpURLConnection) linkUrl.openConnection();
		 
		 Thread.sleep(3000);
		 
		 httpconn.connect();
		 
		 int rescode = httpconn.getResponseCode();
		 
		 if(rescode>=400)
		 {
			 System.out.println(linkUrl + "-" + "is broken link");
		 }
		 else
		 {
			 System.out.println(linkUrl + "-" + "is valid link");
		 }
	 }
	 
	 
	
 driver.quit();
}
}