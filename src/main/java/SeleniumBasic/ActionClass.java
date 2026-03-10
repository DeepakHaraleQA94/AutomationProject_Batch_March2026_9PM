package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
		WebElement doubleClick1 = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick1).perform();
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.id("draggable"));
		 WebElement des = driver.findElement(By.id("droppable"));
		 action.clickAndHold(src).perform();
		 action.release(des).perform();
		 action.contextClick().perform();
		 
	
	
	}
}
