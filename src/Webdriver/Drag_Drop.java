package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String args[]) {
	 System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://demoqa.com/droppable/");
	 WebElement from=driver.findElement(By.id("draggable"));
	 WebElement to=driver.findElement(By.id("droppable"));
	 Actions ac=new Actions(driver);
	 ac.dragAndDrop(from, to).perform();
	
}
}
