package testpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindow=driver.getWindowHandle();		

		driver.findElement(By.xpath("//button[@id=\"newTabsBtn\"]")).click();
		Set<String> multipletabs=driver.getWindowHandles();
		
		Iterator<String> itr=multipletabs.iterator();
			
		while (itr.hasNext()) {
			String childtab=itr.next();
			if(!parentWindow.equals(childtab))
			{
				driver.switchTo().window(childtab);
			}			
			
			driver.switchTo().window(parentWindow);
		}
		
	}

}
