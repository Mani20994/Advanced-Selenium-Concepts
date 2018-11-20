import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_ByJS {
static WebDriver driver;
public  static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
      Thread.sleep(3000);
	  driver.get("https://www.phptravels.net/");
     
	  WebElement date=driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']"));
	  String dateVal="25-12-2018";
	  selectDateByJS(driver,date,dateVal);
}
	  
public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
}

     
     
     
     
     
     
     
     
}
