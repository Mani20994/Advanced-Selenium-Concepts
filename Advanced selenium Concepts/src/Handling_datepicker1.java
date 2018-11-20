import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_datepicker1 {
static WebDriver driver;
public  static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.tripadvisor.in/Flights-o297628-From_Bangalore-Cheap_Discount_Airfares.html");
     driver.manage().window().maximize();
     Thread.sleep(3000);
     driver.findElement(By.xpath(".//*[@id='taplc_flights_search_form_0']/div/div[2]/div/div/span/div[1]/div[2]/div[1]/div/div[1]/input[2]")).click();
     driver.findElement(By.xpath(".//*[@id='taplc_flights_search_form_0']/div/div[2]/div/div/span/div[1]/div[2]/div[1]/div/div[1]/input[2]")).sendKeys("Bengaluru");
     driver.findElement(By.xpath(".//*[@id='taplc_flights_search_form_0']/div/div[2]/div/div/span/div[1]/div[2]/div[1]/div/div[2]/input[2]")).sendKeys("Delhi");
     driver.findElement(By.xpath(".//*[@id='roundtrip_picker']/div[1]/div/div[2]")).click();
     
     String date="2-January 2019";
     String splitter[]=date.split("-");
     String month_year=splitter[1];
     String day=splitter[0];
     System.out.println(month_year);
     System.out.println(day);
     
     
     
     
     
     
     
     
     
     
     
}
}