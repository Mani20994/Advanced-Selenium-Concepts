import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class htmlunit_test {

	    public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://facebook.com");
	
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anam123khan@gmail.com");
		System.out.println("email entered");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123anam");
		System.out.println("password enterd");
		
		
	    }
}