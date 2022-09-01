package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
public class TC_Frames {

	public static void main(String args[]) throws InterruptedException  {
		
		//TEST STEPS
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed successfully");
		
		//ADD BUTTON
		     //1.entering into FRAMES
		driver.switchTo().frame("rightMenu");
		System.out.println("Entered into frames");
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		//driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		System.out.println("Add button action done");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Korrapati");
	    driver.findElement(By.name("txtEmpFirstName")).sendKeys("Pavan");
	   driver.findElement(By.id("btnEdit")).click();
	   
	          //exit from FRAMES
	   driver.switchTo().defaultContent();
	   System.out.println("Exit from frames");
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
	   System.out.println("Logout completed");
	   Thread.sleep(3000);
	   //driver.close();
		
	}
}
