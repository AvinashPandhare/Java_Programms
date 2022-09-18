package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamic_Table_Date_Picker_practice {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\Desktop\\chromedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
			
		
		while(true)
		{
			String a=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			if (a.equals("July 2022"))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
			}
		}
		
		driver.findElement(By.xpath("//td[text()='22']")).click();
		
	}
}
