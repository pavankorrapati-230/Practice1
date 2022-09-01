package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	String parentHandle=driver.getWindowHandle();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
	System.out.println("Button was clicked in parent window");
	Set<String> windowHandles=driver.getWindowHandles();
	for (String handle : windowHandles) {
		System.out.println(handle);
		
	}
	


}	
}
