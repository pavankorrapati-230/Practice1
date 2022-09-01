package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TypeDropDown {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.hyrtutorials.com/#");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		ac
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/a")))
		.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/ul/li[4]/ul/li[8]/a")))
		.click()
		.perform();
		
		
		/*ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/a"))).perform();
		//ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[8]/a")));
		Select sc=new Select(driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[8]/a")));
		sc.selectByVisibleText("Dropdown");
	    */
		System.out.println("Selected");
		
	
		Select sc=new Select(driver.findElement(By.id("course")));
		sc.selectByValue("js");
		System.out.println("DropDown selected");
		
		
	}
	

}
