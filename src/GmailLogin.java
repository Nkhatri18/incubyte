import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailLogin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	      /* ChromeOptions options = new ChromeOptions();
	          options.addArguments("start-maximized");
	          options.setExperimentalOption("useAutomationExtension", false);
	          options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	          WebDriver driver =  new ChromeDriver(options); */
		
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	        WebDriver driver =  new ChromeDriver(options); 
	
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("https://accounts.google.com/login/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
      
      driver.manage().window().maximize();
      
      
      
     
      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kcring9@gmail.com");
    
      
      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
      
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Noyelling@1058");
      
      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
      
      
      
	}

}
