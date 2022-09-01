package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_MouseOver {
	   //DT  VAR   VV
	  static String url="http://127.0.0.1/orangehrm-2.6/login.php";
	  static String un="admin";
	  static String pw="admin";
	public static void main(String args[]) throws InterruptedException {
		//TestSteps
		
	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(url);
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Application Login successfully");
	Thread.sleep(3000);
	
	//MOUSE OVER
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	//MOUSE CLICK ACTION
	driver.findElement(By.linkText("Add Employee")).click();
	System.out.println("Mouse Over comppleted");
	Thread.sleep(3000);
	/*driver.findElement(By.name("txtEmpLastName")).sendKeys("Kumar");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Pavan");
	System.out.println("Name given");
	driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	Thread.sleep(3000);*/
	/*ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"leave\"]/a/span"))).perform();
	ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"leave\"]/ul/li[1]/a/span"))).perform();
	ac.moveToElement(driver.findElement(By.linkText("Employee Leave Summary"))).perform();
	driver.findElement(By.xpath("//*[@id=\"leave\"]/ul/li[1]/ul/li/a/span")).click();
	System.out.println("Performance done");*/
	
	/*driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
	System.out.println("Application Logout");
	*/
	
	
	}

}
