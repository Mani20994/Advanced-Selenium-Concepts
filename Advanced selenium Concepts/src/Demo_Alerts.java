
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Alerts {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		Thread.sleep(5000);
		//Click
		driver.findElement(By.xpath(".//*[@type='button']")).click();
		Thread.sleep(5000);
		
		//To handle alerts
		Alert alt=driver.switchTo().alert();
		alt.accept();
		driver.quit();
		
	}
}