package Webdriver_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version\\version-104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/select-menu");
		
		//Single DropDown
		
//		Select st=new Select(driver.findElement(By.id("oldSelectMenu")));
//		st.selectByVisibleText("Indigo");
//		st.selectByValue("5");
//		st.selectByIndex(5);
		
		//Multi-Select DropDown
//		Select st2=new Select(driver.findElement(By.id("cars")));
//				if(st2.isMultiple()) {
//			System.out.println("It is Multi-select");
//			st2.selectByVisibleText("Volvo");
//			st2.selectByValue("opel");
//			st2.selectByVisibleText("Audi");
//			Thread.sleep(3000);
//			st2.deselectAll();
//		}
//		else {
//			System.out.println("It is not Multi-select");
//		}
		
		//get all Options
		Select st3=new Select(driver.findElement(By.id("cars")));
		st3.selectByVisibleText("Saab");
		st3.selectByVisibleText("Audi");
		List<WebElement> option=st3.getAllSelectedOptions();
		for (WebElement options : option) {
			System.out.println(options.getText());
		}
		
				
}
}
