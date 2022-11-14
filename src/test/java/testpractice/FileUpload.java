package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\user\\Desktop\\Test.txt");
		
		
	}

}
