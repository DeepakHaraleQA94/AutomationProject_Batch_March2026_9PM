package SeleniumBasic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {

	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/Account/Login");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	
		String obj = driver.getCurrentUrl();
		System.out.println(obj);
		
	
		String title = driver.getTitle();
	    	System.out.println(title);
		
		
		
		
		driver.close();
	}
}
