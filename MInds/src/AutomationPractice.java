
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class AutomationPractice {

   public static void main(String[] args) throws InterruptedException {
	           //Initiating the browser and URL
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//URL
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				
				//Register
				driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ra123@gmail.com");
				driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("1qaz!QAZ");
				driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
				
				// select T-Shirt
				driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")).click();
			    driver.findElement(By.xpath(".//*[@id='layered_id_feature_11']")).click();
			    Thread.sleep(5000);
			    
			    //Mouse hover
			    Actions action = new Actions(driver);
			   action.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"))).build().perform();
				Thread.sleep(3000);
			     driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")).click();
			    Thread.sleep(5000);
			    
			    // Proceed to checkout
			    driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
			    driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath(".//*[@id='cgv']")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath(".//*[@type='submit']")).click();
			    Thread.sleep(5000);
			    
			    //scroll up
			    JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(2500,-2500)");
				System.out.println("scrolled up");
				Thread.sleep(5000);
				
				//Mouse hover
		           Actions action1 = new Actions(driver);
				   action1.moveToElement(driver.findElement(By.xpath(".//*[@id='page']/div[2]"))).build().perform();
				   Thread.sleep(3000);
				   driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a")).click();
				   Thread.sleep(5000);
				    driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
				    Thread.sleep(5000);
		            driver.findElement(By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a")).click();
				    driver.close();
				   	}
	}
			
			
				
