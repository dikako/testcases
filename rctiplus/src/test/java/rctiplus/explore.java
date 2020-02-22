package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class explore {
	WebDriver driver;
	public explore (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cek_explore() {
		WebElement explore = driver.findElement(By.xpath("//span[text()='EXPLORE']"));
		explore.click();
		String url = driver.getCurrentUrl();
		System.out.println("Explore Url : " + url);
		
		//Click For You
		WebElement foryou = driver.findElement(By.xpath("//h5[text()='For You']"));
		foryou.click();
		WebElement text_foryou = driver.findElement(By.xpath("//h4[text()='Recommendation For You']"));
		assert text_foryou.getText().contains("Recommendation For You");
		String url_foryou = driver.getCurrentUrl();
		System.out.println("Url : " + url_foryou);
//		explore page = new explore(driver);
//		page.open();
		
//		//Click Series
//		WebElement series = driver.findElement(By.xpath("//h5[contains(text(),'Series')]"));
//		series.click();
//		WebElement text_series = driver.findElement(By.xpath("//h4[contains(text(),'Series')]"));
//		assert text_series.getText().contains("Series");
//		String url_text_series = driver.getCurrentUrl();
//		System.out.println("Url : " + url_text_series);
		
		//Click Romatis
//		WebElement romantis = driver.findElement(By.xpath("//h5[contains(text(),'Romantis')]"));
//		romantis.click();
//		WebElement text_romatis = driver.findElement(By.xpath("//h4[contains(text(),'Romantis')]"));
//		assert text_romatis.getText().contains("omantis");
//		String url_romantis = driver.getCurrentUrl();
//		System.out.println("Url : " + url_romantis);
		
		//Click Sport
		WebElement sport = driver.findElement(By.xpath("//h5[text()='Sport']"));
		sport.click();
		WebElement text_sport = driver.findElement(By.xpath("//h4[contains(text(),'Sport')]"));
		assert text_sport.getText().contains("Sport");
		String url_sport = driver.getCurrentUrl();
		System.out.println("Url : " + url_sport);
		
		//Click Fantasi
//		WebElement fantasy = driver.findElement(By.xpath("//h5[contains(text(),'Fantasi')]"));
//		fantasy.click();
//		WebElement text_fantasy = driver.findElement(By.xpath("//h4[contains(text(),'Fantasi')]"));
//		assert text_fantasy.getText().contains("Fantasi");
//		String url_fantasy = driver.getCurrentUrl();
//		System.out.println("Url : " + url_fantasy);
		
		//Click Laga
//		WebElement laga = driver.findElement(By.xpath("//h5[contains(text(),'Laga')]"));
//		laga.click();
//		WebElement text_laga = driver.findElement(By.xpath("//h4[contains(text(),'Laga')]"));
//		assert text_laga.getText().contains("Laga");
//		String url_laga = driver.getCurrentUrl();
//		System.out.println("Url : " + url_laga);
		
		//Click FTV
		WebElement ftv = driver.findElement(By.xpath("//h5[contains(text(),'FTV')]"));
		ftv.click();
		WebElement text_ftv = driver.findElement(By.xpath("//h4[contains(text(),'FTV')]"));
		assert text_ftv.getText().contains("FTV");
		String url_ftv = driver.getCurrentUrl();
		System.out.println("Url : " + url_ftv);
		
		//Click Horor
		WebElement horor = driver.findElement(By.xpath("//h5[contains(text(),'Horor')]"));
		horor.click();
		WebElement text_horor = driver.findElement(By.xpath("//h4[contains(text(),'Horor')]"));
		assert text_horor.getText().contains("Horor");
		String url_horor = driver.getCurrentUrl();
		System.out.println("Url : " + url_horor);
		
//		//Click Komedi
//		WebElement komedi = driver.findElement(By.xpath("//h5[contains(text(),'Komedi')]"));
//		komedi.click();
//		WebElement text_komedi = driver.findElement(By.xpath("//h4[contains(text(),'Komedi')]"));
//		assert text_komedi.getText().contains("Komedi");
//		String url_komedi = driver.getCurrentUrl();
//		System.out.println("Url : " + url_komedi);
		
		//Click Children
		WebElement children = driver.findElement(By.xpath("//h5[text()='Children']"));
		children.click();
		WebElement text_children = driver.findElement(By.xpath("//h4[contains(text(),'Children')]"));
		assert text_children.getText().contains("Children");
		String url_children = driver.getCurrentUrl();
		System.out.println("Url : " + url_children);
		
		//Click Misteri
		WebElement misteri = driver.findElement(By.xpath("//h5[text()='Misteri']"));
		misteri.click();
		WebElement text_misteri = driver.findElement(By.xpath("//h4[contains(text(),'Misteri')]"));
		assert text_misteri.getText().contains("Misteri");
		String url_misteri = driver.getCurrentUrl();
		System.out.println("Url : " + url_misteri);
		
		//Click Talent Show
		WebElement talent_show = driver.findElement(By.xpath("//h5[text()='Talent Show']"));
		talent_show.click();
		WebElement text_talent_show = driver.findElement(By.xpath("//h4[contains(text(),'Talent Show')]"));
		assert text_talent_show.getText().contains("Talent Show");
		String url_talent_show = driver.getCurrentUrl();
		System.out.println("Url : " + url_talent_show);
		
		//Click Entertainment 
		WebElement entertainment = driver.findElement(By.xpath("//h5[text()='Entertainment']"));
		entertainment.click();
		WebElement text_entertainment = driver.findElement(By.xpath("//h4[contains(text(),'Entertainment')]"));
		assert text_entertainment.getText().contains("Entertainment");
		String url_entertainment = driver.getCurrentUrl();
		System.out.println("Url : " + url_entertainment);
		
		//Click Drama
		WebElement drama = driver.findElement(By.xpath("//h5[text()='Drama']"));
		drama.click();
		WebElement text_drama = driver.findElement(By.xpath("//h4[contains(text(),'Drama')]"));
		assert text_drama.getText().contains("Drama");
		String url_drama = driver.getCurrentUrl();
		System.out.println("Url : " + url_drama);
		
		//Click Comedy
		WebElement comedy = driver.findElement(By.xpath("//h5[text()='Comedy']"));
		comedy.click();
		WebElement text_comedy = driver.findElement(By.xpath("//h4[contains(text(),'Comedy')]"));
		assert text_comedy.getText().contains("Comedy");
		String url_comedy = driver.getCurrentUrl();
		System.out.println("Url : " + url_comedy);
		
		//Click Sitcom
		WebElement sitcom = driver.findElement(By.xpath("//h5[text()='Sitcom']"));
		sitcom.click();
		WebElement text_sitcom = driver.findElement(By.xpath("//h4[contains(text(),'Sitcom')]"));
		assert text_sitcom.getText().contains("Sitcom");
		String url_sitcom = driver.getCurrentUrl();
		System.out.println("Url : " + url_sitcom);
		
		//Click Talent Search
		WebElement talent_search = driver.findElement(By.xpath("//h5[text()='Talent Search']"));
		talent_search.click();
		WebElement text_talent_search = driver.findElement(By.xpath("//h4[contains(text(),'Talent Search')]"));
		assert text_talent_search.getText().contains("Talent Search");
		String url_talent_search = driver.getCurrentUrl();
		System.out.println("Url : " + url_talent_search);
		
		//Click Musik
		WebElement musik = driver.findElement(By.xpath("//h5[text()='Variety/Musik']"));
		musik.click();
		WebElement text_musik = driver.findElement(By.xpath("//h4[contains(text(),'Variety/Musik')]"));
		assert text_musik.getText().contains("Variety/Musik");
		String url_musik = driver.getCurrentUrl();
		System.out.println("Url : " + url_musik);
		
		//Click Event
		WebElement event = driver.findElement(By.xpath("//h5[text()='Special Event']"));
		event.click();
		WebElement text_event = driver.findElement(By.xpath("//h4[contains(text(),'Special Event')]"));
		assert text_event.getText().contains("Special Event");
		String url_event = driver.getCurrentUrl();
		System.out.println("Url : " + url_event);
		
		//Click Game Show
		WebElement game = driver.findElement(By.xpath("//h5[text()='Game Show']"));
		game.click();
		WebElement text_game = driver.findElement(By.xpath("//h4[contains(text(),'Game Show')]"));
		assert text_game.getText().contains("Game Show");
		String url_game = driver.getCurrentUrl();
		System.out.println("Url : " + url_game);
	}
	
//	public void open() {
//		WebElement opn = driver.findElement(By.tagName("img"));
//		opn.click();
//		String xpath_title = "//div[contains(@class, 'title')]/h4";
//		WebElement title_content = driver.findElement(By.xpath(xpath_title));
//		String title_text = title_content.getText();
//		System.out.println("Content Title : " + title_text);
//	}
}
