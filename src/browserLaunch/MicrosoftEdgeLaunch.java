package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MicrosoftEdgeLaunch {

		public static void main(String args[])
		{
			System.setProperty("webdriver.edge.driver", "drivers\\MicrosoftWebDriver.exe");
			
			WebDriver ieDriver=new EdgeDriver();
			ieDriver.manage().window().maximize();
			ieDriver.get("https://www.google.com");
		}
}
