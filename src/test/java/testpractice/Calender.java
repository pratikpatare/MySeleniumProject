package testpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
// In real-time, create generic method		
		
		driver.findElement(By.xpath("//input[@id=\"first_date_picker\"]")).click();
		List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		
		for (WebElement element : alldates) {
			
			String date=element.getText();
			
			if (date.equalsIgnoreCase("27")) {
				element.click();
				break;
			} 
		}		
	}
}
