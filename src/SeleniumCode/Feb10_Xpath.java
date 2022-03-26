package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb10_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\ST\\\\webDrivers\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kadam.rahul49@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();*/
	    driver.get("https://www.google.com");
	    driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Testing");
	    driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys(Keys.ENTER);
	    String result=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
	    System.out.println(result);
	    //driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/setprefs?sig=0_uSenMfeuzYti1Q9MTQuplEyYpEI%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwi7mcOD5vn1AhWJO5QKHV8uDX0Q2ZgBCBE\"]")).click();
		//driver.findElement(By.xpath("//a[@class=\"gb_d\"]")).sendKeys(Keys.ENTER);//click
		/*driver.get("https://www.naukri.com");
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"mTxt\"]")).click();
		driver.findElement(By.xpath("//*[@title=\"All Jobs\"]")).click();*/
		
		
	}

}
