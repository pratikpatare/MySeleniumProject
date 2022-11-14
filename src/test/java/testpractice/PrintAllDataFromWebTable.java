package testpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllDataFromWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bseindia.com/eqstreamer/StreamerMarketwatch.html?flag=1");
		
		List<WebElement> allHeader=driver.findElements(By.xpath("//div[@id='header']//table[@border='1']//thead//tr//th"));
		System.out.println(allHeader.size());
		for (WebElement header : allHeader) {
			System.out.println(header.getText());
		}

	
	driver.close();
	}

}
