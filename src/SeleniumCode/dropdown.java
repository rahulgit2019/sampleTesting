package SeleniumCode;

import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.partialLinkText("Create New Account")).click();
	    //driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kadam");
	    driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("9545116416");
	    driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("12345678");
	    
	    
	    Select day=new Select(driver.findElement(By.xpath("//select[@id=\"day\"]")));
	    day.selectByValue("15");
	    //day.deselectByVisibleText("15");
	    Thread.sleep(1000);
	    Select month=new Select(driver.findElement(By.xpath("//select[@id=\"month\"]")));
	    month.selectByValue("8");
	       //month.selectByIndex(8);
	   // month.selectByVisibleText("Aug");
	    Select year=new Select(driver.findElement(By.xpath("//select[@id=\"year\"]")));
	    year.selectByValue("1947");
	    //year.selectByVisibleText("1947");
	    
	    driver.findElement(By.xpath("//input[@value=\"2\"]")).click();//Male
	    driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();//sign up
	    
	    
	    
	    
	    
	    
	    

	}

}
