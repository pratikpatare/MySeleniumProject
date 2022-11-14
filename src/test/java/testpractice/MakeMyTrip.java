package testpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		Actions act=new Actions(driver);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		String from="//input[@id='fromCity']";
		driver.findElement(By.xpath(from)).sendKeys("Mumbai");
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']")).click();	
		
	//	String to="//input[@id='toCity']";
	//	driver.findElement(By.xpath(to)).sendKeys("New Delhi");
	//	driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		
		
	}

}
