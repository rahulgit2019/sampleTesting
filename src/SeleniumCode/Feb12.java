package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\ST\\\\webDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    /*driver.findElement(By.partialLinkText("Create New Account")).click();
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kadam");
	    driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("kadam.rahul49@gmail.com");
	    driver.findElement(By.xpath("aria-label=\"New password\"")).sendKeys("kadam@1234");
	    driver.findElement(By.xpath("//input[@radio=\"value=\"2\"\"]")).click();*/
	    
	        
	    
	    	    
	    
	    
        driver.findElement(By.id("email")).sendKeys("kadam.rahul49@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123345");
        driver.findElement(By.name("login")).click();
	    //driver.findElement(By.xpath("//input[@name=\"email\"]//following::a[4]")).click();//email to create page
        //driver.findElement(By.xpath("//input[@name=\"pass\"]//following::button")).click();//password to login
        driver.findElement(By.xpath("//input[@name=\"pass\"]//following::a[1]")).click();
        
	}

}
