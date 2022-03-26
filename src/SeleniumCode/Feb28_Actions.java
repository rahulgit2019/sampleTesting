package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Feb28_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		/*driver.get("https://google.com");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		//act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//input[@name=\"q\"]//following::input[3]")).click();*/
		
		driver.get("https://facebook.com");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		act.keyDown(ele,Keys.SHIFT).sendKeys("rahul").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		
		
				
		
		
		
		
		
		
		
		
	}

}
