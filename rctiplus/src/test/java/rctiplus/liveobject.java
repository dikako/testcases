package rctiplus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class liveobject {
	WebDriver driver;
	public liveobject (WebDriver driver) {
		this.driver = driver;
	}

	public void live_object () throws InterruptedException {
		String url_live = driver.getCurrentUrl();
		System.out.println("Url : " + url_live);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//Click on play button
		Thread.sleep(2000);
		//Pause
		jse.executeScript("jwplayer().pause()");
		Thread.sleep(2000);
		//Play
		jse.executeScript("jwplayer().play();");
		Thread.sleep(2000);
		// Set Volume
		Thread.sleep(2000);
		jse.executeScript("jwplayer().setVolume(50);");
		Thread.sleep(2000);
		//Mute Player
		jse.executeScript("jwplayer().setMute(true);");
		Thread.sleep(2000);
		//UnMute Player
		jse.executeScript("jwplayer().setMute(false);");
		Thread.sleep(2000);
		//Stop the player
		jse.executeScript("jwplayer().setVolume(50);");
		Thread.sleep(2000);
		jse.executeScript("jwplayer().stop()");
		Thread.sleep(5000);
		jse.executeScript("jwplayer().play();");
		Thread.sleep(5000);
		//Pause
		jse.executeScript("jwplayer().pause()");
		Thread.sleep(2000);
		//Fullscreen
		jse.executeScript("jwplayer().on('fullscreen')");
		Thread.sleep(5000);
		String ceklv;
		ceklv = driver.findElement(By.cssSelector("div[class='title']")).getText();
		System.out.println("Title : " + ceklv);
	}
}
