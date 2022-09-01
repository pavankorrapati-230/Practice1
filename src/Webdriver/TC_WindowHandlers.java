package Webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandlers {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version\\version-104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("C:\\webdrivers\\chromedriver\\Files\\multiplewindows.html");
		Thread.sleep(3000);
		//List<WebElement> strings=driver.findElements(By.id("btn1"));
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		ArrayList<String>windsinfo=new ArrayList<String>(driver.getWindowHandles());
		for (String string : windsinfo) {
			System.out.println(string);
		}
		//System.out.println(windsinfo.get(0));
		//driver.switchTo().window(windsinfo.get(0));
		
		//driver.quit();
	}
}
