import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
			driver.get("http://facebook.com");
			
			/*	driver.findElement(By.id("email")).sendKeys("9557811113");
				driver.findElement(By.name("pass")).sendKeys("1234");
			//driver.findElement(By.linkText("Forgotten account?")).click();
			driver.findElement(By.id("loginbutton")).click();
				//driver.findElement(By.xpath("//*[@id='loginbutton']")).click(); */
				
		
			//Using CSS & XPATH
			
			/* driver.findElement(By.cssSelector("#email")).sendKeys("9557811113");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
			
			driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
			*/
			
			// Customised Xpath
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@name=\'pass\']")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@value=\'Log In\']")).click();
			
	}

}
