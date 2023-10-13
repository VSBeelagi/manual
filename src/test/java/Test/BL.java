package Test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BL {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	List<WebElement> listlinks = driver.findElements(By.xpath("//a"));
	
	System.out.println(listlinks.size());
	
	ArrayList<String> links = new ArrayList<String>();
	
	for (int i = 0; i < listlinks.size(); i++) 
	{
		String eachlink = listlinks.get(i).getAttribute("href");
		
		URL url = null;
		int statusCode = 0;
		try
		{
		url = new URL(eachlink);
		
		HttpURLConnection httpurlconn = (HttpURLConnection) url.openConnection();
	
		statusCode = httpurlconn.getResponseCode();
	
	if(statusCode>=400)
	{
		links.add(eachlink+"------>"+statusCode);
	}
		}
		catch (Exception e) {
			links.add(eachlink+"------>"+statusCode);
		}
	
	}
	
	System.out.println(links);
		
	}
	
	

}













