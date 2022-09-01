package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Trail_For {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into frames");
		
		
			
		for(int i=1;i<=10;i=i+2) {
			//driver.findElement(By.xpath("(//input[@type=\"checkbox\"])["+i+"]")).click();
			driver.findElement(By.xpath("//tbody/tr["+i+"]/td/input")).click();
			
				System.out.println(i);	
		
			//i++;
		}
		driver.switchTo().defaultContent();
		System.out.println("Releived from Frames");
		driver.close();
	}
}
