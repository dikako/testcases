package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.loginobject;
import rctiplus.logoutobject;

public class mylist {
	WebDriver driver;
	public mylist(WebDriver driver) {
		this.driver = driver;
	}
	public void Verifmylist() {
		String url_program = "https://rctiplus.com/programs/532/indonesian-idol-x";
		String url_user = "https://rctiplus.com/users";
		String list_program = "Indonesian Idol X";
		driver.get("https://rctiplus.com/login");
		
		//Add My List dari Kondisi sudah Login 
		loginobject page_login = new loginobject(driver);
		page_login.login_object();
		driver.get(url_program);
		WebElement add_list = driver.findElement(By.xpath("//span[text()='Add to My List']"));
		add_list.click();
		System.out.println("Program Add List : " + url_program);
		driver.get(url_user);
		WebElement view_list = driver.findElement(By.xpath("//img[@class='svg-col-etc']"));
		view_list.click();
		assert driver.findElement(By.xpath("//h7[text()='Indonesian Idol X']")).getText().contains(list_program);
		driver.get(url_program);
		WebElement unlist = driver.findElement(By.xpath("//span[text()='My List']"));
		unlist.click();
		
		//Ad My List dari Kondisi belum Login
		driver.get(url_user);
		logoutobject page_logout = new logoutobject(driver);
		page_logout.logout_object();
		driver.get(url_program);
		WebElement add_lists = driver.findElement(By.xpath("//span[text()='Add to My List']"));
		add_lists.click();
		page_login.login_object();
		driver.get(url_program);
		WebElement add_listss = driver.findElement(By.xpath("//span[text()='Add to My List']"));
		add_listss.click();
		driver.get(url_user);
		WebElement view_lists = driver.findElement(By.xpath("//img[@class='svg-col-etc']"));
		view_lists.click();
		assert driver.findElement(By.xpath("//h7[text()='Indonesian Idol X']")).getText().contains(list_program);
		driver.get(url_program);
		WebElement unlists = driver.findElement(By.xpath("//span[text()='My List']"));
		unlists.click();
		
		
	}
}
