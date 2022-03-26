package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\\\ST\\\\webDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("kadam.rahul49@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123345");
        driver.findElement(By.name("login")).click();
	    
	    
	}

}
