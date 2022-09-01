package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Print_Links_Google {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\version-102\\chromedriver_win32\\chromedriver.exe");
		WebDriver ramco=new ChromeDriver();
		ramco.manage().window().maximize();
		/*ramco.navigate().to("https://www.google.com/");
		List<WebElement> alltags=ramco.findElements(By.tagName("a"));
		System.out.println("All links are here: "+alltags.size());
		for(int i=0;i<alltags.size();i++) {
			
		System.out.println("Link :"+i+" is: "+alltags.get(i).getAttribute("href"));	
		
		
		
		}*/
		
		/*ramco.navigate().to("https://www.facebook.com/login/");
		List<WebElement> links=ramco.findElements(By.tagName("a"));
		System.out.println("All links are: "+links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println("Link "+i+" is"+links.get(i).getAttribute("href"));
			System.out.println("Link "+i+" is"+links.get(i).getText());
		}*/
		
		//ramco.navigate().to("https://www.hyrtutorials.com/");
		/*List<WebElement> gmail=ramco.findElements(By.tagName("a"));
		System.out.println("links here are: "+gmail.size());
		for(int i=0;i<gmail.size();i++) {
			System.out.println("The link: "+i+gmail.get(i).getAttribute(" href"));
			System.out.println("The link: "+i+gmail.get(i).getText());
			
			
		}*/
		/*Select sc=new Select(ramco.findElement((By.id("course"))));
		List<WebElement> drop=sc.getOptions();
		System.out.println("The drop downs are: "+drop.size());
		for(int i=0;i<drop.size();i++) {
			System.out.println(drop.get(i).getText());
			
		}
		
		Select sc1=new Select(ramco.findElement(By.id("ide")));
		List<WebElement>drop1=sc1.getOptions();
		System.out.println(drop1.size());
		for(int j=0;j<drop1.size();j++) {
			System.out.println(drop.get(j).getText());
		}*/
		
		//Actions ac=new Actions(ramco);
	//ac.moveToElement(ramco.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/ul/li[4]/a"))).perform();
   /* List<WebElement>Manu=ramco.findElements(By.tagName("a")); 
    System.out.println(Manu.size());
    for(int k=0;k<Manu.size();k++) {
    	System.out.println("Link"+k+"is"+Manu.get(k).getAttribute("href"));
    	System.out.println("Link"+k+"is"+Manu.get(k).getText());
		
    }*/
		
	}
				
	}
	


