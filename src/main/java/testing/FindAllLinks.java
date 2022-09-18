package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avina\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://timesofindia.indiatimes.com/");
		
		List<WebElement> wb=driver.findElements(By.tagName("a"));
		System.out.println(wb.size());
		
		for(WebElement wa:wb)
		{
			String linkURL=wa.getText();
			URL url=new URL(linkURL);
			HttpURLConnection httpConnection=(HttpURLConnection)url.openConnection();
			httpConnection.connect();
			int a=httpConnection.getResponseCode();
			
		}

	}

}
