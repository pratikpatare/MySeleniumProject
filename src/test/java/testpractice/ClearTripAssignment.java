package testpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTripAssignment {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	
	Actions act=new Actions(driver);
	act.click().perform();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	JavascriptExecutor jse=(JavascriptExecutor) driver;
//	jse.executeScript("arguments[0].click()", trip);
	
	WebElement flights=driver.findElement(By.xpath("//div[text()='Flights']"));
	flights.click();

	WebElement trip=driver.findElement(By.xpath("//div[@class='flex flex-middle']//span[text()='Round trip']"));
	trip.click();
	
	WebElement detail=driver.findElement(By.xpath("//span[text()='2 Adults, 1 Child, Economy']"));
	detail.click();
	
	WebElement from=driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]"));
	from.click();
	WebElement mum=driver.findElement(By.xpath("//ul[@class='airportList'][2]"));
	mum.click();
	
	WebElement to=driver.findElement(By.xpath("//input[@placeholder=\"Where to?\"]"));
	to.click();
	WebElement del=driver.findElement(By.xpath("//ul[@class='airportList'][3]"));
	del.click();
	
	WebElement godate=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']//div[text()='Tue, Nov 1']"));
	godate.click();
	WebElement rtndate=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']//div[text()='Thu, Dec 1']"));
	rtndate.click();
	WebElement search=driver.findElement(By.xpath("//span[text()='Search flights']"));
	search.click();
	
	}
}