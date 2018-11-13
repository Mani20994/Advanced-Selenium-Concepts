import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Iframes {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("http://www.dezlearn.com/testingpage/");
	
	//switch to 1st window
	driver.switchTo().frame("contact-iframe");
	Thread.sleep(5000);
	
	//to locate to menu bar
	driver.findElement(By.className("mob-icon-menu")).click();
	Thread.sleep(5000);
	
	//select the items from menu bar(Selenium)
	driver.findElement(By.xpath(".//*[@id='mobmenuleft']/li[2]/a")).click();
	Thread.sleep(5000);
	
	//switch to parent window
	driver.switchTo().parentFrame();
	Thread.sleep(5000);
	
	//to switch another window
	driver.switchTo().frame("do-it-iframe");
	
	//To add search element in box
	driver.findElement(By.xpath(".//*[@id='main']/section/div/form/label/input")).sendKeys("W3 School.com");
	driver.findElement(By.xpath(".//*[@id='main']/section/div/form/input")).click();
	Thread.sleep(4000);
	
	//to  switch to parent window
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[@id='popup']")).click();
	Thread.sleep(4000);
	driver.quit();
	
	}
}
