package SeleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://magnus.jalatechnologies.com/");
	driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

	driver.findElement(By.id("Password")).sendKeys("jobprogram");
	driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("More")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Popups")).click();
	Thread.sleep(2000);
	
//	driver.findElement(By.id("btn-six")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='Close']")).click();
//	driver.findElement(By.id("promptBtn")).click();
//	Thread.sleep(2000);
//	Alert alt = driver.switchTo().alert();
//	Thread.sleep(2000);
//	alt.sendKeys("hello");
//	Thread.sleep(2000);
//	alt.accept();
	
	
	driver.findElement(By.id("btn-one")).click();
	String mainId = driver.getWindowHandle();
    System.out.println("main window id is :" + mainId);	
	
        Set<String> listWinId= driver.getWindowHandles();
        System.out.println("main window id is :" + listWinId);
        
          Iterator<String> itr = listWinId.iterator();
          String main = itr.next();
          System.out.println("main id "+main);
            String child = itr.next();
            System.out.println("child id "+child);
	driver.switchTo().window(child);
	driver.manage().window().maximize();
	driver.switchTo().window(main);
	
	
	driver.findElement(By.id("promptBtn")).click();
	Thread.sleep(2000);
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
	alt.sendKeys("hello");
	Thread.sleep(2000);
	alt.accept();
	
	
	}
}
