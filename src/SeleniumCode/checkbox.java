package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.demoqa.com/automation-practice-form");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//label[text()='Sports']")).click();
	    driver.findElement(By.xpath("//label[text()='Reading']")).click();
	    driver.findElement(By.xpath("//label[text()='Music']")).click();


	}

}
