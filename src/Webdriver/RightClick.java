package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions ac=new Actions(driver);
		
		Thread.sleep(3000);
		ac.contextClick(driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"))).perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[2]")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		System.out.println("Alert action done");
	}

}
