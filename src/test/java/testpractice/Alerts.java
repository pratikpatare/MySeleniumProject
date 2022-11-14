package testpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		driver.findElement(By.xpath("//a[text()='Selenium Practice']")).click();
		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		
		
		/*
		 * driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		 *  Alert alert=driver.switchTo().alert();
		 *  alert.accept();			//or dismiss();
		 */	
	/*
	 * driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	 * Alert alert=driver.switchTo().alert(); System.out.println(alert.getText());
	 * alert.accept(); 
	 */
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert alert=driver.switchTo().alert();	
		System.out.println(alert.getText());
		alert.sendKeys("pratik");
		alert.accept();
	}

}
