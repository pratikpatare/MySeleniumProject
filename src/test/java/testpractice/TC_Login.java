package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
				
		driver.close();
	}	
}