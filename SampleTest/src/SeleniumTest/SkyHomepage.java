package SeleniumTest;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;


public class SkyHomepage {
	
ChromeDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PVD03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.sky.com/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies =driver.manage().getCookies();
		/* System.out.println("Size of cookies:" +cookies.size()); // gives size of cookies */		
			
		System.out.println("Size of cookies:" +cookies.size());
		
		       
		for(Cookie cookie:cookies) //get and print cookie
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		} 
		
		driver.manage().deleteCookieNamed("smct_session");
		driver.manage().deleteCookieNamed("RT");
		driver.manage().deleteCookieNamed("LPSID-66659534");
		driver.manage().deleteCookieNamed("LPVID");
		
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies:" +cookies.size());
		
		for(Cookie cookie:cookies) //get and print cookie
		{
			driver.manage().deleteCookieNamed("smct_session");
			System.out.println(cookie.getName()+":"+cookie.getValue());
		} 
		
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().getCookieNamed("session-id-time")); 
		
		Thread.sleep(6000);
		
		driver.findElement(By.linkText("Deals")).click();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL); 
		
		
			}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SkyHomepage obj =  new SkyHomepage();
		obj.launchBrowser();
		 
		
		
		
		
	
	
	
	
	}

}
