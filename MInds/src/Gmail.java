
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(".//*[@type='email']")).sendKeys("xyzminds@gmail.com");
		driver.findElement(By.xpath(".//*[@value='Next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Minds123");
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Keys.ENTER");
		
		
				
				
				
	}
}