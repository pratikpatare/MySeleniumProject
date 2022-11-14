package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		Actions act=new Actions(driver);
		act.click().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 15, 5);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	
		
		String flights="//div[text()='Flights']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(flights)));
		act.click().perform();
		
		WebElement trip=driver.findElement(By.xpath("//button[@class=\"flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer c-neutral-900\"][1]"));
		trip.click();
		
		WebElement roundtrip=driver.findElement(By.xpath("//span[text()='Round trip']"));
		roundtrip.click();

		String details="//button[@class=\"flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 c-pointer c-neutral-900\"]//span";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(details)));
		act.click().perform();
//		jse.executeScript("arguments[0].click()", details);
		 
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
	
	}

}
