package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mar1_action2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("https://facebook.com");
		Actions act=new Actions(driver);
		//.moveToElement(driver.findElement(By.xpath("//*[text()=\"Privacy\"]"))).build().perform();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement ele=driver.findElement(By.xpath("//a[text()=\" BANK \"]"));
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		act.dragAndDrop(ele, ele2).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),\"Debit Mov\")]"))).build().perform();
		WebElement ele3=driver.findElement(By.xpath("//*[@id=\"fourth\"][2]"));
		act.dragAndDrop(ele3, ele2).build().perform();
		
		
		

	}

}
