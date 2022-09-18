package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Static_Table_Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\New folder\\New folder (2)\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver ();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://chimesradio.com/parenting-blogs/states-and-capitals-of-india/");
		
		//List<WebElement> wb=driver.findElements(By.xpath("//tr"));
		
		List<WebElement> wb=driver.findElements(By.tagName("td"));
		
		System.out.println(wb.size());
		
		for(WebElement a:wb)
		{
			System.out.println(a.getText());
		}
		
		driver.close();

	}

}
