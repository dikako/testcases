package rctiplus;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class duplicated {
	WebDriver driver;
	public duplicated (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cek_duplicated() {
		  List<String> freshcontents, duplicatecontents;  
		     freshcontents = new ArrayList();  
		     duplicatecontents = new ArrayList();  
		     List<WebElement> urllist;  
		     try {    
		       driver.get("https://rctiplus.com/");    
		       urllist = driver.findElements(By.tagName("a"));  
		       for (WebElement url : urllist) {  
		         // check duplicate content  
		         if (url.getAttribute("href").trim().matches("([^\\s]+(\\-[0-9])$)")) {  
		           //store duplicate contents into duplicatecontents List variable  
		           duplicatecontents.add(url.getText().trim() + "  " + url.getAttribute("href").trim());  
		         } else {  
		           //store Fresh content into freshcontents List variable  
		           freshcontents.add(url.getText().trim() + "  " + url.getAttribute("href").trim());  
		         }  
		       }  
		       driver.quit();  
		     } catch (NoSuchElementException e) {  
		       e.printStackTrace();  
		     }
		     System.out.println("Number of duplicate contents =: " + duplicatecontents.size());  
		     for (String duplicate : duplicatecontents) {  
		       System.out.println(duplicate);  
		     }
		     System.out.println("Number of Fresh contents =: " + freshcontents.size());  
		     for (String fresh : freshcontents) {  
		       System.out.println(fresh);  
		     }  
		   } 
	}
