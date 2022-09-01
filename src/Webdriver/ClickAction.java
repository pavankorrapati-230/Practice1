package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("Orange")) {
			System.out.println("Title was right");
		}
		else
		{
			
		    System.out.println("The title was wrong");
			System.out.println(driver.getTitle());
		}
				//Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login action done");
		//Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"benefits\"]/a/span")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"benefits\"]/ul/li[2]/a/span")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"benefits\"]/ul/li[2]/ul/li[1]/a/span")))
		.click()
		.perform();
		System.out.println("MouseHover action performed");
		ac
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/ul/li[1]/a/span")))
		.click()
		.perform();
		System.out.println("MouseHover action performed again");
		//Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/div[2]/input[1]")).click();
		System.out.println("Edit button clicked");
		driver.findElement(By.id("txtCompanyName")).sendKeys("Pavan_Korrapati");
		ac.doubleClick(driver.findElement(By.id("txtCompanyName"))).perform();
		System.out.println("Double click performed");
		
				
				
	}

	
	}


