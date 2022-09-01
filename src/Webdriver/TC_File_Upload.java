package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_File_Upload {
		public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		System.out.println("entered ointo frames and clicked on ADD ");
		Thread.sleep(3000);
		driver.findElement(By.id("txtEmpLastName")).sendKeys("Chinthalli");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Korrapati");
		
		WebElement fileInput=driver.findElement(By.xpath("//*[@id='photofile'][@type='file']"));
		//fileInput.sendKeys("E:\\XKIQ3090.JPG");
		fileInput.sendKeys("E:\\pavan\\XKIQ3090.JPG");
		Thread.sleep(3000);
		System.out.println("File uploaded");
		driver.findElement(By.xpath("//input[@type='button'][@id='btnEdit']")).click();
		System.out.println("uploaded");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		System.out.println("Entered into frames1");
		driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
		Select st=new Select(driver.findElement(By.id("cmbNation")));
		st.selectByVisibleText("Select Nationality");
		List<WebElement>nation=st.getOptions();
		 
		
		
		//driver.close();
	}
}
//PavanKumar_TestEngineer_Fresher.pdf
//E:\Software\Resume@Manual