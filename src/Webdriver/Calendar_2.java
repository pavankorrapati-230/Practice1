package Webdriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_2 {
	public static void main(String args[]) throws ParseException{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\version-104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Calendar calendar=Calendar.getInstance();
		
		String date="05-Aug-2022";
		SimpleDateFormat targetDate=new SimpleDateFormat("dd-MMM-yyyy");
		try {
			targetDate.setLenient(true);
			Date ActualDate=targetDate.parse(date);            
			System.out.println(ActualDate);
			calendar.setTime(ActualDate);
			
			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth=calendar.get(Calendar.MONDAY);
			int targetYear=calendar.get(calendar.YEAR);
			driver.findElement(By.id("second_date_picker")).click();
			//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()=31]")).click();
			//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
		    //driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
			/*driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()="+targetDay+"]")).click();
			System.out.println("Date 05-09-2022 was selected");
			*/
			//driver.findElement(By.id("first_date_picker")).click();
			driver.findElement(By.xpath("/html/body /div[3]/table/tbody/tr[2]/td[5]/a")).click();
			System.out.println("Here the date was selected");
		} 
		
		catch (ParseException e) {
		System.out.println("Invalid Date");
		}
	}

}

