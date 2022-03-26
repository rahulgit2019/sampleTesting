package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice9FEB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\ST\\\\webDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//System.out.println("title is"+driver.getTitle());
        //System.out.println("URL is="+driver.getCurrentUrl());
        //driver.manage().window().maximize();
        //driver.navigate().to("https://facebook.com");
        //driver.navigate().back();
        //driver.navigate().forward();     
        //driver.close();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kadam.rahul49@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234567");
		driver.findElement(By.xpath("button[@name=\"login\"]")).click();
		
		
		
		
		
		
		
	}

}
