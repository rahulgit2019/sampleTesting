package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Feb23_Javasvript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.location='https://www.google.com/'");
		js.executeScript("window.location=arguments[0]","https://www.google.com/","https://www.gmail.com/");
		System.out.println(js.executeScript("return document.title").toString());
		System.out.println(js.executeScript("return document.URL").toString());
		System.out.println(js.executeScript("return document.domain").toString());


		WebElement ele=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		js.executeScript("arguments[0].value=arguments[1];",ele,"selenium class in pune");//value its like sendkeys();
		
		js.executeScript("alert('search value placed');");
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
		
		
		WebElement el2=driver.findElement(By.xpath("//input[@name=\"q\"]//following::input[3]"));
		js.executeScript("arguments[0].click();",el2);
		
		
		/*js.executeScript("window.location=arguments[0]","https://www.facebook.com");
		WebElement el3=driver.findElement(By.xpath("//input[@name=\"email\"]"));
		js.executeScript("arguments[0].value=arguments[1];",el3,"kadam.rahul49@gmail.com");
		WebElement el4=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		js.executeScript("arguments[0].value=arguments[1];",el4,"123456");
		WebElement el5=driver.findElement(By.xpath("//*[@name=\"pass\"]//following::button[1]"));
		//WebElement el5=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		js.executeScript("arguments[0].click();",el5);*/
		
		
		/*js.executeScript("window.scrollBy(0,800)");
		WebElement el3=driver.findElement(By.xpath("//*[@aria-label=\"Page 2\"]"));
		js.executeScript("arguments[0].scrollIntoView();",el3);*/
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       






	}

}
