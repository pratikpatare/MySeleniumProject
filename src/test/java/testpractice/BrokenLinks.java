package testpractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links:"+links.size());
		
		for (int i=0; i<links.size(); i++) {
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			verifyLinks(url);
		}
		driver.quit();
	}
	public static void verifyLinks(String linkUrl) {
		int brokenlinks=0;
		try {
			URL url=new URL(linkUrl);
			
			HttpURLConnection hc=(HttpURLConnection)url.openConnection();
			hc.connect();
			
			if (hc.getResponseCode()>=400) {
				System.out.println(linkUrl+"-"+hc.getResponseMessage()+" is broken link");
				brokenlinks++;
			} else {
				System.out.println(linkUrl+"-"+hc.getResponseMessage()+" is valid link");
			}
			
		} catch (Exception e) {

		}
		System.out.println("Number of Broken links:"+brokenlinks);
	}
}