import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_DatePicker {
	WebDriver driver;
	String month="November 2018";
     String date="21";
 
@Test
     public  void enterText() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("https://www.phptravels.net/");
	driver.findElement(By.xpath("//*[@id='dpd1']/div/input")).click();
	WebElement mon=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]"));
	while(true) {
	if(mon.getText().equals(month)) {
		break;
	}
		else {
			driver.findElement(By.xpath("/html/body/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
			Thread.sleep(3000);
		}
	driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr[4]//td[4]")).click();
	}
	}
	}

	
	