package SkyLogin;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	ChromeDriver driver;
	@BeforeTest
	
	public void Signin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PVD03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sky.com/");
		
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("username")).sendKeys("p.vins1989@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Continue")).click();
		
		driver.findElement(By.xpath(".//*[@id='app-component']/div/main/div/div[3]/button/span")).click();
		
		driver.findElement(By.name("your-name")).sendKeys("poornimav");
		driver.findElement(By.id("password-field")).sendKeys("Applepie1234");
		driver.findElement(By.className("Buttonstyles__ButtonLabel-sc-1baq2ha-1 styledElement-sc-501xix-1 cLluLE")).click();
		
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
			}
		
	@AfterTest
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Login obj =  new Login();
		obj.Signin();
		 
		
		
	}
	

}

			
		
