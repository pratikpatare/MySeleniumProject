package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebDriverWait wait=new WebDriverWait(driver, 10, 100);
		String parentWindow=driver.getWindowHandle();
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("scroll(0,700)");

		driver.switchTo().frame("frm1");
	
	
	
	
	
	
	}

}
