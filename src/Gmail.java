import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver_win32\\chromedriver.exe");

		  WebDriver driver= new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		  //Navigate to Stackoverflow as it has Google Authorization
	      driver.get("https://stackoverflow.com/users/login");
	      
	      driver.manage().window().maximize();
	      
	      //Click on 'Log in with Google'
	      driver.findElement(By.xpath("//button[contains(@class,'bc-black-10')]")).click();
	      
	      //Provide your Google Email and Password
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ENTER YOUR EMAIL");
	      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ENTER YOUR PASSWORD");
	      driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	      
	      Thread.sleep(2000);
	     
	      //Redirect to Google Mail
	      driver.navigate().to("https://mail.google.com/");
	      
	      //Click on Compose
	      driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
	      
	      Thread.sleep(2000);
	      
	      //Click to add an attachment
	      driver.findElement(By.xpath("//div[contains(@class,'aMZ')]")).click();
	      
	}

}
