package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IframeClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.linkText("Practice")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		
		
		
	
	}

}
