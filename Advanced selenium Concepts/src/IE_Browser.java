
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IE_Browser {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Anam");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");
		driver.findElement(By.xpath(".//*[@id='day']")).click();
		driver.findElement(By.xpath(".//*[@id='day']/option[13]")).click();
		driver.findElement(By.xpath(".//*[@id='month']")).click();
		driver.findElement(By.xpath(".//*[@id='month']/option[7]")).click();
		driver.findElement(By.xpath(".//*[@id='year']")).click();
		driver.findElement(By.xpath(".//*[@id='year']/option[29]")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_z']/span[1]/label")).click();
		
	    }
}