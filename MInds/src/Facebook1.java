import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook1 {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(7000);
		//Using CSS selectors
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("123anam");
		driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys(Keys.ENTER);
		
		}
}
