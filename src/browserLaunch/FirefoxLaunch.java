package browserLaunch;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		WebDriver fDriver=new FirefoxDriver();
		fDriver.manage().window().maximize();
		fDriver.get("https://www.google.com");
		Dimension s1=fDriver.manage().window().getSize();
		
		System.out.println(s1);
		
		fDriver.manage().window().setSize(new Dimension(1200,500));
	}

}
