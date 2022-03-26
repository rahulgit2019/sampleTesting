package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb22_alerts {

	public static void main(String[] args) throws InterruptedException {
		Alert alt;
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		alt=driver.switchTo().alert();
		System.out.println("Text="+alt.getText());
		alt.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(7000);
		alt=driver.switchTo().alert();
		System.out.println("confirmation alert Text="+alt.getText());
		alt.accept();
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(7000);
		alt=driver.switchTo().alert();
		System.out.println(" confirm Text="+alt.getText());
		alt.accept();
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(3000);
		alt=driver.switchTo().alert();
		Thread.sleep(3000);
		alt.sendKeys("rahul");
		alt.accept();
		
		
		
	}

}
