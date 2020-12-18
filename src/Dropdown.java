import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
//import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		
	/*	//For static dropdown
		driver.findElement(By.name("passenger")).click();
		
		for(int i=1;i<4;i++)		
		{
		driver.findElement(By.xpath("//*[contains(@class,'pax-plus')]")).click();
		}
		
		driver.findElement(By.xpath("//*[contains(@class,'btn-primary')]")).click();
				
				
	   /* Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    s.selectByValue("2");
	     s.selectByIndex(4);
	    // s.selectByVisibleText("6 Adults"); 	 
      */
	  
		//For dynamic dropdown
		
		driver.findElement(By.xpath("//input[contains(@class, 'src-city')]")).click();
		
		driver.findElement(By.xpath("//div[@value='Delhi, India']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class, 'dest-city')]")).click();
		
	driver.findElement(By.xpath("//div[@value='Mumbai, India']")).click();
		
		
	}
}
