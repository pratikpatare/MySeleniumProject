package testpractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bseindia.com/eqstreamer/StreamerMarketwatch.html?flag=1");
		List <WebElement> list=driver.findElements(By.xpath("//div[@id='header']/table/thead/tr/th"));
		
		System.out.println("Number of elements:"+list.size());
		
		for (int i = 1; i <= list.size(); i++) {
		System.out.println(driver.findElement(By.xpath("//div[@id='header']/table/thead/tr/th["+i+"]")).getText());	
			
		}
	
	/*
		Iterator <WebElement> itr=list.iterator();
		int i=1;
		while (itr.hasNext()) {
			itr.next();
		System.out.println(driver.findElement(By.xpath("//div[@id='header']/table/thead/tr/th["+i+"]")).getText());
		i++;
		}
	*/		
		driver.close();
	}
}
