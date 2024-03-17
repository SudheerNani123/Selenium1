package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS_on_Whole_page {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.nike.com/in/");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\vasam\\OneDrive\\Desktop\\bug screen shot\\img1.png");
		Thread.sleep(2000);
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		driver.close();
	}
}
