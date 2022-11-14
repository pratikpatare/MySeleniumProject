package testpractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloading {

	public static void main(String[] args) {

// download in project's Downloads's folder --> for word file		
		
	String location=System.getProperty("user.dir")+"\\Downloads\\";
	
	HashMap preferences=new HashMap();
	preferences.put("download.default_directory", location);
	
//  preferences.put("plugins.always_open_pdf_externally", true);	for pdf file
	
	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("prefs", preferences);
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	driver.findElement(By.xpath("")).click();
	
//	driver.findElement(By.xpath("")).click();	direct click on download button
//  it goes in browsers default laoction -->  c:downloads	
	
	}

}
