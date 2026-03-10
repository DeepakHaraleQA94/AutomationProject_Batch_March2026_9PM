package SeleniumBasic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
//		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
//		driver.findElement(By.xpath(" //input[@placeholder='Email or Mobile No']")).sendKeys("training@jalaacademy.com");
	driver.findElement(By.xpath(" //input[contains(@placeholder,'Email ')]")).sendKeys("training@jalaacademy.com");	
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		
		 WebElement get_Text = driver.findElement(By.xpath("  //p[contains(text(),'JALA Academy offers Job')]"));
		   System.out.println( get_Text.getText());
		
		
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.xpath(" //button[text()='Sign In']")).click();
		
		 Thread.sleep(3000);
//		String homeTitle = driver.getTitle();
//		System.out.println("homeTitle is : "+homeTitle);
//		
//		if(homeTitle.equals("Magnus")) {
//			System.out.println("Title matched");
//		}else {
//			System.out.println("title is not matching");
//		}
//		
	}
}
