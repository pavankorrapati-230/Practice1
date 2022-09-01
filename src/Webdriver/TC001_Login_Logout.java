package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//To access object identificatio
import org.openqa.selenium.By;

public class TC001_Login_Logout {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\firefoxdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
  // WebDriver driver1= new FirefoxDriver();
    WebDriver driver= new ChromeDriver() ;
    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
   // driver1.navigate().to("http://183.82.103.245/nareshit/login.php");
    
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    
    Thread.sleep(3000);
    driver.close();
}
}