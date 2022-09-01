package Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class TC002 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		//Verify title
		//Actual Result compare
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");	
		}
		else  {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		//VERIFY TITLE
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("Title matched");
		}
			else {
				System.out.println("Title not matched");
				System.out.println(driver.getTitle());
			}
		   Thread.sleep(5000);
 			driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
 			driver.close();
	
 			
		}
	}

 