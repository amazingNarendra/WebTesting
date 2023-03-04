package scratch.webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest
{
	
	@Test
	public void login() 
	{
		String password="Narendra399@";
	    System.setProperty("webdriver.chorme.driver", "\\Drivers\\chomeDriver\\chromedriver.exe");	
		WebDriver d=new ChromeDriver();
	
//		d.manage().window().maximize();
		d.get("https://www.amazon.com/");
		d.findElement(By.cssSelector("a[onclick='window.location.reload()']")).click();
		d.findElement(By.cssSelector("span[class='nav-line-2 ']")).click();
		d.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("narendrareddy9642@gmail.com");
	    d.findElement(By.id("continue")).click();
		d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
		d.findElement(By.className("a-button-input")).click();
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("new shirts");
		d.findElement(By.id("nav-search-submit-button")).click();
		
		d.close();
	}
	
}
