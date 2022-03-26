package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class March2_spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://spicejet.com");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]")).click();
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]//following::input[1]")).sendKeys("DEL");
		driver.findElement(By.xpath("//*[@data-testid=\"round-trip-radio-button\"]//following::input[2]")).sendKeys("CHE");
		//driver.findElement(By.xpath("//*[text()=\"Departure Date\"")).click();
		WebElement ele=driver.findElement(By.xpath("//*[text()=\"10\"]"));//date select
	    act.doubleClick(ele).build().perform();
	    
	    
	    driver.findElement(By.xpath("//*[text()=\"Return Date\"]//following::div[1]")).click();//return date selection
	    ele= driver.findElement(By.xpath("//*[text()=\"16\"]"));
	    act.doubleClick(ele).build().perform();
		
	    driver.findElement(By.xpath("//*[text()=\"Passengers\"]//following::div[1]")).click();
	    driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
	    driver.findElement(By.xpath("//*[@data-testid=\"Children-testID-plus-one-cta\"]")).click();
	    driver.findElement(By.xpath("//*[@data-testid=\"Infant-testID-plus-one-cta\"]")).click();
	    driver.findElement(By.xpath("//*[@data-testid=\"home-page-travellers-done-cta\"]")).click();
	    
	    driver.findElement(By.xpath("//*[text()=\"Currency\"]//following::div[1]")).click();
	    driver.findElement(By.xpath("//*[text()=\"USD\"]")).click();
	    driver.findElement(By.xpath("//*[@data-testid=\"home-page-flight-cta\"]")).click();
	    
		
		//For Flight status
	    //driver.findElement(By.xpath("//*[text()=\"flight status\"]")).click();
	    //driver.findElement(By.xpath("//*[text()=\"Flight No.(optional)\"]//following::div[2]")).click();
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
