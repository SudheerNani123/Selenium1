package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class faceook {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.tagName("textarea")).click(); 
		Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("12345");
       // driver.findElement(By.id("pass")).sendKeys("abc@123");
        
        Navigation nav = driver.navigate();
        driver.get("https://www.facebook.com/");
        nav.forward();
        nav.back();
	    nav.refresh();    
		driver.close();
	}
}
