package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
	
		
		Select seldropDown=new Select(dropDown);
		
		Thread.sleep(3000);
		
		seldropDown.selectByIndex(2);
		WebElement Option1=seldropDown.getFirstSelectedOption();
		
		String a=Option1.getText();
		
		System.out.println(a);
		
		System.out.println("-----------------------------------------------------");
		
		 List <WebElement> optionsAvailable=seldropDown.getOptions();
		 
		 for(WebElement xyz:optionsAvailable)
		 {
			 System.out.println(xyz.getText());
			 System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		 }
		
		driver.close();
	}

}
