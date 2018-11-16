import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTables {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	 //tr=row,td=column,capurting the paths,for handle web table rows
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	//*[@id="customers"]/tbody/tr[4]/td[1]
	//*[@id="customers"]/tbody/tr[5]/td[1]
	//*[@id="customers"]/tbody/tr[6]/td[1]
	//*[@id="customers"]/tbody/tr[7]/td[1]
	
	//Get the count of number of rows
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	int rowCount=rows.size();
	System.out.println("Total rows in web table:" +rowCount);
	
	//Breaking the xpths into two parts
	String beforeXpath="//*[@id='customers']/tbody/tr[";
	String afterXpath="]/td[1]";
	
	//Providing the loop for varying row numbers,actual row starts from 2 and ends at 7
	for(int i=2; i<=rowCount; i++) {
	String  actualXpath = beforeXpath+i+afterXpath;
	
	//Creating the webelement 
	 WebElement element=driver.findElement(By.xpath(actualXpath));
	 System.out.println(element.getText());
	
	//company information about Island Trading is available or not
	    if(element.getText().equals("Island Trading")){
		System.out.println("company name: "+ element.getText()+ "is found" + "at  position:" + (i-1));
		//to break the loop
		break;
	}
}
	//For segregation purpose
	System.out.println("********");
	
   //For Contact Information
	//*[@id="customers"]/tbody/tr[2]/td[2]
	String afterXpathContact="]/td[2]";
	for(int i=2; i<=rowCount; i++) {
		String  actualXpath = beforeXpath+i+afterXpathContact;
		 WebElement element=driver.findElement(By.xpath(actualXpath));
		 System.out.println(element.getText());
	}

	System.out.println("******");
	
	//For Country Information
	String afterXpathCountry="]/td[3]";
	for(int i=2; i<=rowCount; i++) {
		String  actualXpath = beforeXpath+i+afterXpathCountry;
		 WebElement element=driver.findElement(By.xpath(actualXpath));
		 System.out.println(element.getText());
	}
	
	System.out.println("******");
	//Handle web table columns
	//xpath for company
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//xapth for contact
	//*[@id="customers"]/tbody/tr[1]/th[2]
	//xpath for country
	//*[@id="customers"]/tbody/tr[1]/th[3]
	
	String colBeforeXpath="//*[@id='customers']/tbody/tr[1]/th[";
	String colAfterXpath="]";
	
	//to get total number count for columns
	List<WebElement> cols =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
	int colCount=cols.size();
	System.out.println("Total number of columns are :" +colCount);
	
	System.out.println("Columns values are:");
	for(int i=1; i<=colCount; i++) {
		 WebElement element=driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
		 String colText=element.getText();
		 System.out.println(colText);
	}
}

public static void main11(String[] args)  {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//URL
	driver.get("https://www.freecrm.com/");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("naveenk");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
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
	
	
		
		
	
	public static void main1(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://www.cricbuzz.com/live-cricket-scores/21208/pak-vs-nz-1st-test-pakistan-v-new-zealand-in-uae-2018");
//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a
//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/a
	
	
	String BeforeXpath1="//*[@id=\"matchCenter\"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[";
	String AfterXpath1="]/div[1]/a";
	for(int i=1; i<=2;i++) {
		String name= driver.findElement(By.xpath(BeforeXpath1 +i +AfterXpath1)).getText();
		System.out.println(name);
		if(name.contains("Kane Williamson")) {
			//*[@id="matchCenter"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a
			driver.findElement(By.xpath("//*[@id=\"matchCenter\"]/div[3]/div[2]/div[1]/div[2]/div[1]/div[" +i+ "]/div[1]/a")).click();
			
		}
		
	}

}
}

 