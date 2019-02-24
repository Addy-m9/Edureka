package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	
	ChromeDriver driver= new ChromeDriver(); 
	
	
public void invokeBrowser()
	
	{
		
	
		driver.manage().window().maximize();
		// when op-en browser sometimes full screen and some times half so we maximize
		
		driver.manage().deleteAllCookies(); //bypasses cookies but doesnot delete physical files
		driver.get("http://demo.guru99.com/V4/"); 
	}
	
		
	public void login(String userId, String password)
	
	{
		
		WebElement userIdBox=driver.findElement(By.name("uid")); // return type is a web element
		userIdBox.sendKeys(userId); // to set the calue uid in the userid box
		
		
		driver.findElement(By.name("password")).sendKeys(password);//method chaining
		
		driver.findElement(By.name("btnLogin")).click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
