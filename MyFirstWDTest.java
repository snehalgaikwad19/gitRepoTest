package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFirstWDTest {

	public static void main(String[] args) {
		WebDriver webDriver;
		//provide relative path for below system property ()
		/*System.setProperty("webdriver.gecko.driver", "test\\resources\\geckodriver.exe");
		webDriver=new FirefoxDriver();*/

		System.setProperty("webdriver.ie.driver", "test\\resources\\IEDriverServer.exe");
		webDriver=new InternetExplorerDriver();
		
		webDriver.get("http://selenium-examples.nichethyself.com/");

		/*//first way
		WebElement element1=webDriver.findElement(By.id("loginname"));
		element1.sendKeys("stc123");*/
		
		//second way
		webDriver.findElement(By.id("loginname")).sendKeys("stc123");
		webDriver.findElement(By.id("loginpassword")).sendKeys("12345");
		webDriver.findElement(By.id("loginbutton")).click();
		
		String expectedTitleAfterLogin="My account";
		String actualTitleAfterLogin=webDriver.getTitle();
		
		if(actualTitleAfterLogin.equals(expectedTitleAfterLogin))
			System.out.println("Login Test Passed");
		else
			System.out.println("Login Test Passed");
		
		//close the browser automatically after all test are executed
		webDriver.quit();
		
	}

}
