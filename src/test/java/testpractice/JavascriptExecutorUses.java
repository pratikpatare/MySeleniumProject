package testpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorUses {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,500)");
		
//		JavascriptExecutor jse=(JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].click()", element);
		
	}

}
