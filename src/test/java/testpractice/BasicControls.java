package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("def");
		
		driver.findElement(By.xpath("//input[@id='femalerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lmn");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pqr");
		
		driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
		
	}

}