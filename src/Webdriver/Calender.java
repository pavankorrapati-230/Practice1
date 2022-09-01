package Webdriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\version-104\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.hyrtutorials.com/p/frames-practice.html");*/
		/*String targetDate="30-feb-2022";
		SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		Date formattedTargetDate=targetDateFormat.parse(targetDate);
		System.out.println(formattedTargetDate);*/
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		driver.findElement(By.id("second_date_picker"));
		Calendar calendar=Calendar.getInstance();
		
		String targetDate="33-August-2022";
		SimpleDateFormat target=new SimpleDateFormat("dd-MMM-yyyy");
		Date formatOfDate = null;
		try {
			target.setLenient(false);  //boolean function FALSE-invalid, TRUE-date will print automatically
			formatOfDate = target.parse(targetDate);
			calendar.setTime(formatOfDate);
			//System.out.println(formatOfDate);
			
			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth=calendar.get(Calendar.MONTH);
			int targetYear=calendar.get(Calendar.YEAR);
			driver.findElement(By.id("second_date_picker")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
		System.out.println("Invalid date");
		}
		
		
}
}
