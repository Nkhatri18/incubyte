import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentsiblingtraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nisha Khatri\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://login.salesforce.com/?locale=in");
		 
		 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("12345");
		 driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		 
		 driver.findElement(By.xpath(".//*[text()='Use Custom Domain']")).click();
		 
		 //traverse to a child When the parent is dynamic
		// driver.findElement(By.xpath("//a[@id='mydomainLink']/parent::div")).getAttribute("class");
		
		 //traverse to a parent through a child
	    //  System.out.println(driver.findElement(By.xpath("//a[@id='forgot_password_link']/following-sibling::a[1]")).getAttribute("id"));
		 
	      //To identify the element using text
		 
	      
	      
		 	}

}
