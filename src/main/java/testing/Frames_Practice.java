package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing\\New folder\\SS Drivres\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		
		
	driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("(//a[1])[1]")).click();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
		
	driver.findElement(By.xpath("(//input[1])[2]")).sendKeys("Avinash");
		
//		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		
//driver.switchTo().frame(2);
//		
//		driver.findElement(By.linkText("org.openqa.selenium")).click();
	}

}
