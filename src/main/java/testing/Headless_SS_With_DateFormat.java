package testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Headless_SS_With_DateFormat {

public static void main(String[] args) throws IOException {
		
		SimpleDateFormat date=new SimpleDateFormat("ddMMyyyy_hhmmss");
		
		String a=date.format(new Date());
		
		System.setProperty("webdriver.edge.driver", "D:\\Automation Testing\\New folder\\New folder (2)\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeOptions obj1=new EdgeOptions();
		
		obj1.addArguments("--headless");
		
		WebDriver driver=new EdgeDriver(obj1);
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f,new File ("C:\\Users\\avina\\Desktop\\SS\\"+a+"aviii.png"));
		
		System.out.println("Ho Gya Bhai ,Going Good...!!!");
		
	}

}
