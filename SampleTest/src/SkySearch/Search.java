package SkySearch;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;


public class Search {
	
	ChromeDriver driver;
	
	public void SearchTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PVD03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();   
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sky.com/");
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("search-toggle__icon")).click();
		
		driver.findElement(By.xpath(".//*[@id='masthead-navigation']/div/div[1]/div[2]/div/div/div/div/div/div/div/input")).click();
		driver.wait(10);
		driver.findElement(By.cssSelector("[aria-label='Search']")).click();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL); 
		
		
				
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Search obj = new Search();
		obj.SearchTest();
		
		
	}

}
