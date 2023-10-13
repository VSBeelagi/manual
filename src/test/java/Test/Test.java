package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws Throwable {
		
		String MY = "August 2023";
		int date= 31;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//		Actions act = new Actions(driver);
//		act.moveByOffset(50, 50);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='container']/a[@class='close']")).click();
//		
////		driver.findElement(By.xpath("//span[.='Departure']")).click();

	
		
		driver.get("https://www.ksrtc.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.findElement(By.name("txtJourneyDate")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[.='"+date+"']")).click();
	}

	
	
	//span[.='August 2023']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='31']
}
