import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Tables {
public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//URL
			driver.get("https://www.cricbuzz.com/live-cricket-scores/21208/pak-vs-nz-1st-test-pakistan-v-new-zealand-in-uae-2018");
	//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a
	//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/a
			////*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a
			Thread.sleep(4000);
		
		
		String BeforeXpath="//*[@id=\"matchCenter\"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[";
		String AfterXpath="]/div[1]/a";
		for(int i=1; i<=2;i++) {
			String name= driver.findElement(By.xpath(BeforeXpath +i +AfterXpath)).getText();
			Thread.sleep(4000);
			System.out.println(name);
			//if(name.contains("Kane Williamson")) {
				//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a
				//driver.findElement(By.xpath("//*[@id=\"matchCenter\"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[" + i + "]/div[1]/a")).click();
				
			}
			
		}
}
