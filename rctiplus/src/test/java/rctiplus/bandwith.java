package rctiplus;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class bandwith {
	WebDriver driver;
	public bandwith(WebDriver driver) {
		this.driver = driver;
	}
	
	public class TestClass {
		   //data provider for the connection's download and upload throughput    
		   @DataProvider(name = "test1")
		    public Object[][] networkConditions() {
		        return new Object[][] {
		            { 5000 , 5000 },
		            { 10000, 7000 },
		            { 15000, 9000 },
		            { 20000, 10000 },
		            { 23000, 11000 },
		            { 30000, 15000 },
		            { 40000, 20000 },
		            { 50000, 20000 },
		            { 75000, 20000 },
		            { 100000, 20000 },
		            { 0, 0 },
		        };
		    }
		    
		    @Test(dataProvider = "networkConditions")
		    public void test(int downloadThroughput, int uploadThroughput)
		throws IOException {
		        System.setProperty("webdriver.chrome.driver",
		"c:/selenium/chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
		        
		        if (downloadThroughput > 0 && uploadThroughput > 0) {
		            CommandExecutor executor = driver.getCommandExecutor();
		                   
		            Map map = new HashMap();
		            map.put("offline", false);
		            map.put("latency", 5);
		                
		            map.put("download_throughput", downloadThroughput);
		            map.put("upload_throughput", uploadThroughput);
		            Response response = executor.execute(
		new Command(driver.getSessionId(), 
		"setNetworkConditions", 
		 ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));
		        }
		            
		        driver.get("http://google.com");
		        
		        driver.quit();
		    }
}
}
