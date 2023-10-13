package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pjt1 {

	public static void main(String[] args) {
		
		String MonthAndYear = "October 2023";
		int date = 28;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		String Actual = "//div[.='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextArrow = "//span[@aria-label='Next Month']";
		
		for(;;)
		
			try {
			driver.findElement(By.xpath(Actual)).click();
			break;
			}
		
			catch (Exception e) {
				driver.findElement(By.xpath(nextArrow)).click();
			}
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
	}

}
