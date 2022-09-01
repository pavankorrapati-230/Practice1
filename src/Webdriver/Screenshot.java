package Webdriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.netty.handler.codec.base64.Base64;


public class Screenshot {
	public static void main(String args[]) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//FILE
		/*File sourceFile=driver.getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\Software\\run_software\\ScreenShots\\image1.jpg");
		Files.copy(sourceFile,destFile);*/
		
		//BYTE[]
		/*byte[] bytearray=driver.getScreenshotAs(OutputType.BYTES);
		File desFile=new File("E:\\Software\\run_software\\ScreenShots\\image2.jpg");
		FileOutputStream fos=new FileOutputStream(desFile);
		fos.write(bytearray);
		System.out.println("Screenshot OK");*/
		
		/*String sourceFile=driver.getScreenshotAs(OutputType.BASE64);
		byte[] bytearray=Base64.decode()    //Unable to write the full method as "Base64.getDecode().decode(sourceFile);"
		File destFile=new File("E:\\Software\\run_software\\ScreenShots\\image3.jpg");
		FileOutputStream fos=new FileOutputStream(destFile);
        fos.write(sourceFile);	*/	
	}

}
