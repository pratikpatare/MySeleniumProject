package testpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Page Title:"+driver.getTitle());
		
		WebElement logo=driver.findElement(By.xpath("//div[@id='nav-logo']"));	
		System.out.println("Location"+logo.getLocation());
		System.out.println("Size"+logo.getSize());
		
		Actions act=new Actions(driver);
//		act.moveToElement(logo).click().perform();					//click
	
		WebElement actbtn=driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		act.moveToElement(logo).moveToElement(actbtn).perform();	//hovering
		
//		act.moveToElement(logo).doubleClick().perform();		// double click
		
		act.contextClick(logo).perform();					// right click
		
/*	first locate source webelement n store it in source variable then
 *  locate target webelement n store it in target variable
		act.dragAndDrop(source, target).perform();		
*/		
	}

}
