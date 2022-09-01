package Webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Break {
   public static void main(String args[]) throws IOException  {
	   System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
	   WebDriver ramco=new ChromeDriver();
	   ramco.manage().window().maximize();
	
		ramco.get("https://www.facebook.com/");
		/*List<WebElement> links=ramco.findElements(By.tagName("a"));
	   int size= links.size();
	   System.out.println(size);
	   for (int i=0;i<size;i++) {
		WebElement element=links.get(i);
		String url=element.getAttribute("href");
		     URL link=new URL(url);
		     HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
		     httpcon.connect();
		    int rescode= httpcon.getResponseCode();
		    if(rescode>400) {
		    	System.out.println("Link no.:"+i+url+".....Is broken link");
		    }
		    else {
		    	System.out.println("Link no.:"+i+url+"...Is working properly");
		    }
   }*/
		
		List<WebElement>links=ramco.findElements(By.tagName("a"));		
	    int link=links.size();
	    System.out.println(link);
	    for(int i=0;i<link;i++) {
	    	WebElement element=links.get(i);
	    	String url=element.getAttribute("href");
	    	URL pagelink=new URL(url);
	    	HttpURLConnection httpcon=(HttpURLConnection) pagelink.openConnection();
	    	httpcon.connect();
	    	int rescode=httpcon.getResponseCode();
	    	if(rescode>400) {
	    		System.out.println("Link no: "+i+" is "+url+"_____BROKEN");
	    	}
	    	else {
	    		System.out.println("Link no: "+i+" is "+url+"______OK");
	    	}
	    }
   
   
   
   }
}
