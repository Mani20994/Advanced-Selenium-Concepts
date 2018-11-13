package crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserDemo {
	WebDriver driver=null;
	
@Parameters("browserName")
	@Test(priority=1)
	public void setup(@Optional("browserName")String browserName) {
		System.out.println("Browser name is: "+browserName);
		System.out.println("Thread id:" +Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver= new ChromeDriver();
			 
}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver=new FirefoxDriver();
}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
}
}
@Test(priority=2)
	public void test1() throws InterruptedException {
		driver.get("http://facebook.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123anam");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.ENTER);
		
}
@Test(priority=3)
	public void teardown() {
		driver.close();
		System.out.println("test completed succesfully");
	}
	}

