import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://login.salesforce.com/?locale=in");
		 /*
		driver.findElement(By.id("username")).sendKeys("9557811113");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		*/
		driver.findElement(By.cssSelector("input[type=\'email\']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name=\'pw\']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[value=\'Log In\']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id=\'error\']")).getText());
		
		
		
	}
}
