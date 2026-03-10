package SeleniumBasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenShotClass {
public static	WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File des = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium__Jala_Jenkins_Jan_2026\\screenshot\\"+random+".png");
FileHandler.copy(src, des);
driver.close();
	}
}
