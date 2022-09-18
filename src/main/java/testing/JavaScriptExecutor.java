package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\New folder\\New folder (2)\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1.To Open an URL
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://in.search.yahoo.com/?fr2=inr'");
		
		//2.Feed Text i.e. Send Keys
		WebElement inputBox=driver.findElement(By.xpath("//input[@class='sbq']"));
		js.executeScript("arguments[0].value='Cricbuzz'", inputBox);
		
		//3. & //4.Border for element and click 
		WebElement searchButton=driver.findElement(By.xpath("//button[@class='sbb']"));
		js.executeScript("arguments[0].style.border='5px solid red'", searchButton);
		js.executeScript("arguments[0].click();", searchButton);
		
		//5.Refresh page with JS
		js.executeScript("history.go(0);");
		
		//6.Get Title and Url and print in Console
//		String URL=js.executeScript("return document.URL;").toString();
//		String Title=js.executeScript("return docuemnt.title;").toString();
		
//		System.out.println(URL);
//		System.out.println(Title);
		
		//7.Scroll Down
		js.executeScript("window.scrollBy(0,500)");
		
		//8.Scroll Down to an specific 
		WebElement yahooLink=driver.findElement(By.xpath("//*[@id=\"ft\"]/ul/li[1]/span/a/img"));
		js.executeScript("arguments[0].scrollIntoView(true);", yahooLink);
		
		
		//8.Scroll Down Page End
		js.executeScript("window.scrollTo(0,document.Body.scrollHeight)");
		
		
	
		
		
				
	}

}
