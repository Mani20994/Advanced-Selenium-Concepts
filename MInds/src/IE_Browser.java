
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IE_Browser {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    }
}