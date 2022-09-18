package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config_Test {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\Desktop\\chromedriver.exe");
		
		
		
		Properties prop=new Properties();
		
		String a="D:\\Automation Testing\\Eclips\\Automation_Start_1\\src\\main\\java\\testing\\config_1.properties";
		
		FileInputStream FIS=new FileInputStream(a);
		
		prop.load(FIS);
		
		prop.setProperty("username", "Admin_123");
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
//		
//		
//		
//		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
//		
//		driver.findElement(By.id("btnLogin")).click();
//		
				

	}

}
