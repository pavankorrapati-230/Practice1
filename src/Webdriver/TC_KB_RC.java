package Webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_KB_RC {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("txtUserName")).sendKeys("admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin");
	    
	    //KEY_BOARD ...1.TAB   2.ENTER
	    Robot r = new Robot(); 
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
	    System.out.println("TAB");
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("ENTER");
	    Thread.sleep(3000);
	    System.out.println("Login completed");
	    
	    driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
	    System.out.println("Logout completed");
	    driver.close();
	}

}
