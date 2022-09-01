package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_2 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm2");
		System.out.println("Entered into frames");
		driver.findElement(By.id("firstName")).sendKeys("Pavan");
		System.out.println("Click action done on HOME");
		driver.switchTo().defaultContent();
		System.out.println("Exit from frames");
		Thread.sleep(3000);
		driver.close();
		
	}

}
