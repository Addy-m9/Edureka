package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
	
	public void newCustomer()
	{
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Saurabh");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("06/21/1989");
		driver.findElement(By.name("addr")).sendKeys("Hyderabad");
		driver.findElement(By.name("city")).sendKeys("abids");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("pinno")).sendKeys("329044");
		driver.findElement(By.name("telephoneno")).sendKeys("5594050828");
		
		// email id always unique cant get from database so generating random email
		
		String emailId="ad"+System.currentTimeMillis()+"@gmail.com";
		System.out.println("Email Id"+emailId);
		
		
		driver.findElement(By.name("emailid")).sendKeys(emailId);

		driver.findElement(By.name("password")).sendKeys("gsdfdf"); // send keys always sends string type and receives

		driver.findElement(By.name("sub")).click();
		
		
		
		
		// absolute Xpath for female console input html/body/table/tbody/tr/td/table/tbody/tr[5]/td/input[2]
	// Relative Xpath******* //input[@value='f']
	
	}
	
	
	public String getCustomerID()
	{
	return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	
	// 
	}
	
	public int getCustomerIDInteger()

	{
String cusd= driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	
	int customerId=Integer.parseInt(cusd); //to vonvert the string to int
	
	return customerId;
	} 




public void addAccount(String myId)
{
	driver.findElement(By.linkText("New Account")).click();
	driver.findElement(By.name("cusid")).sendKeys(myId);
	
	WebElement dropdown=driver.findElement(By.name("selaccount"));
	Select selAccount = new Select(dropdown);
	selAccount.selectByVisibleText("Current");
	System.out.println(selAccount.isMultiple());
	driver.findElement(By.name("inideposit")).sendKeys("50000");
	driver.findElement(By.name("button2")).click();
	
}

}