package Webdriver;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Trail_DropDown {
	public static void main(String args[]) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into Frames");
	    Select st=new Select(driver.findElement(By.xpath("//select[@id=\"loc_code\"]")));
	    
	    List<WebElement>dropdown=st.getOptions();
	   // System.out.println(dropdown);
	    for (WebElement ele:dropdown) {
	    	System.out.println(ele.getText());
	    	
	    }
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    System.out.println("------------");
	    
	    for (WebElement link:links) {
	    	System.out.println(link.getAttribute("href"));
	    
		}}}
