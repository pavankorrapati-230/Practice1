package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	WebElement ele1=driver.findElement(By.id("email"));
	WebElement ele2=driver.findElement(By.id("pass"));
	Actions ac=new Actions(driver);
	ac.moveToElement(ele1).sendKeys("pavankorraati@230");
	ac.keyDown(Keys.CONTROL).sendKeys("a");
	ac.sendKeys("c");
	
	ac.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
	ac.perform();
}
}
