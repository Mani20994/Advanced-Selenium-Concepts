import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table1 {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	

	//URL
	driver.get("https://www.freecrm.com/");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("naveenk");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().frame("mainpanel");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
	String BeforeXpath="//*[@id=\"vContactsForm\"]/table/tbody/tr[";
	String AfterXpath="]/td[2]";
	for(int i=4; i<=7;i++) {
		String name= driver.findElement(By.xpath(BeforeXpath +i +AfterXpath)).getText();
		System.out.println(name);
		if(name.contains("test2 test2")) {
			//*[@id="vContactsForm"]/table/tbody/tr[6]/td[1]/input
			driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[" +i+"]/td[1]/input" )).click();
				
		}
		}
}
}