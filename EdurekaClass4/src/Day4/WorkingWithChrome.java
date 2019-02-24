package Day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	// Decide the browser to work on
	// Initialize the browser

	
	ChromeDriver driver= new ChromeDriver(); 
	
	public void invokeBrowser()
	
	{
		
		
		// exe of chrome provided by chrome download it 
		
		//System.setProperty("webdriver.chrome.driver","//Applications//chromedriver//chromedriver.exe");
		// only for windows O.S , in mac /usr/local/bin set the chrome driver.exe file here
		//updating the value of the varibale webdriver.chrome.driver because it is nessary to communicate with the chrome driver
		
		//in windows it path will be \ backward slash  so change to forward */
		
		driver.manage().window().maximize();
		// when op-en browser sometimes full screen and some times half so we maximize
		
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com"); 
	}
	
		
		//public void navigateCommands(){ // we can use either of them 
		
public String getTitle()
	
	{
	return driver.getTitle();
	
	}
		
		
public void NavigateCommands()
	
	{
		
		driver.navigate().to("http://qatechhub.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

public void closeBrowser()

{
		driver.close();
		//}driver.close(); // closes current active window
		//driver.quit(); closes all the open windows
		
		
}
}

	

	
	
	
	
	
		

	
	
	
	


