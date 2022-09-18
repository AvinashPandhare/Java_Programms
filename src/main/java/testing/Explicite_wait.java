package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicite_wait {

	public static void main(String[] args) {
		
		System.setProperty("","");
		
		WebDriver driver=new ChromeDriver();
		WebElement WB = null;
	//	WebDriverWait wait=new WebDriverWait(driver,30);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(WB));
		wait.until(ExpectedConditions.visibilityOf(WB));
		

	}

}
