package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create")).click();
		
		  WebElement list = driver.findElement(By.id("CountryId"));
//		Select select = new Select(country);
//		select.selectByVisibleText("India");
//		Thread.sleep(2000);
//		select.selectByIndex(7);
//		Thread.sleep(2000);
//		select.selectByValue("8");
	    List<WebElement> options = list.findElements(By.tagName("option"));
	     int listSize = options.size();
	     System.out.println(listSize);
	     
//	     for(int i=0; i<listSize; i++) {
//	    	 options.toString()
//	    	   String listOptions = options.get(i).toString();
//	    	   System.out.println(listOptions);
//	    	   Thread.sleep(1000);
//	    	   
//	     }
	     
	     for(  WebElement list1:options) {
	    	 System.out.println(list1.getText());
	    	 Thread.sleep(1000);
	    	 if(list1.equals("China")) {
	    		 list1.click();
	    	 }
	     }
	
		 
		 

		
		
		
		
		
		
		
		
		
	}
	
}
