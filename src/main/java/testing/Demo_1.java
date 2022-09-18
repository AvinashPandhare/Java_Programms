package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
				
		driver.navigate().to("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//button")).click();
		
		String a=driver.findElement(By.xpath("//button")).getText();
		
		String b=driver.findElement(By.xpath("//button")).getAttribute("class");
		
		System.out.println(a);
		//Log In
		
		System.out.println(b);
		//_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy
		
	}

}
