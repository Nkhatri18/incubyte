import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegEXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.rediff.com/");
	
		 driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		 
		driver.findElement(By.cssSelector("#login1")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[contains(@name,'passw')]")).sendKeys("12345");
		
		driver.findElement(By.cssSelector("input[name*='proceed']")).click(); 
 
	}

}
