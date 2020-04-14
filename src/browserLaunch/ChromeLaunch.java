package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe" );
		
		WebDriver cDriver=new ChromeDriver();
		cDriver.manage().window().maximize();
		cDriver.get("https://www.google.com");
	}

}
