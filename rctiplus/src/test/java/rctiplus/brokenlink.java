package rctiplus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class brokenlink {
	WebDriver driver;
	public brokenlink (WebDriver driver) {
		this.driver = driver;
	}
	
	public void testBrokenlink() throws MalformedURLException, IOException {
		//list of the link and images : 500
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of full Active Link & Images : " + linkList.size());
		
		List<WebElement> activeLink = new ArrayList<WebElement>();
		
		//iterate linkList : exclude all link/images - doesnt have any href attribute
		for (int i = 0; i < linkList.size(); i++) {
			//System.out.println(linkList.get(i).getAttribute("href"));
			if (linkList.get(i).getAttribute("href") != null ) {
				activeLink.add(linkList.get(i)); //&& (!linkList.get(i).getAttribute("href").contains("javascript"))
			}
		}
		
		//get size of active link list :
		System.out.println("Size of Active Link & Images : " + activeLink.size());
		
		//cek href url, with httpconnection api :
		for (int j = 0; j < activeLink.size(); j++) {
		HttpURLConnection connection = (HttpURLConnection) new URL (activeLink.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String respons = connection.getResponseMessage(); //ok 200 not found 404 internal error 500 bad req 400
		connection.disconnect();
		System.out.println(activeLink.get(j).getAttribute("href") + " : " + respons);
		
		}
	}
}
