package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	    System.out.println(driver.getTitle());
	   driver.findElement(By.name("txtUserName")).sendKeys("admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	   driver.findElement(By.name("Submit")).click();
	   System.out.println("Login action performed");
	   
	   driver.switchTo().frame("rightMenu"); 
	   Select st=new Select(driver.findElement(By.id("loc_code")));
	  
	  // st.selectByVisibleText("Emp. ID");
	   //st.selectByIndex(1);
	   st.selectByValue("0");
	   System.out.println("Employee id was selected");
	   driver.findElement(By.name("loc_name")).sendKeys("0008");
	   driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
	   driver.findElement(By.name("chkLocID[]")).click();
	   driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
	   System.out.println("Candidate was deleted");
	   
	   
	   driver.switchTo().defaultContent();
	   System.out.println("Over");
	   
	}

}
