package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("PavanKorrapati230");
		driver.findElement(By.id("pass")).sendKeys("PavanKorrapati230");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		System.out.println("LogIn action performed");
		System.out.println(driver.getTitle());
		
		
	}

}
