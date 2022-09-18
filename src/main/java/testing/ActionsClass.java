package testing;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\New folder\\SS Drivres\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
Actions act=new Actions(driver);

act.sendKeys(args);
//		
//		act.keyDown(Keys.SHIFT).build().perform();
//		act.sendKeys("Cricbuzz").build().perform();
		

	}

}
