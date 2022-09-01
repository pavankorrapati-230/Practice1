package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login button click action done");
	
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(a.getText());
	Thread.sleep(3000);
	a.accept();
	Thread.sleep(3000);
	System.out.println("Alert action done"); 
	
	//driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login after Alert done");
	driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
