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



}


 