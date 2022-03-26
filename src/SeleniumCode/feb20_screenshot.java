package SeleniumCode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb20_screenshot {

		public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   
	    driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Hello");
		Thread.sleep(1000);
		TakesScreenshot screen=(TakesScreenshot) driver;
		File SourceFile=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File(System.getProperty("user.dir")+"\\s2.png"));
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    /*driver.get("https://www.facebook.com");
	   driver.findElement(By.partialLinkText("Create New Account")).click();
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("rahul");
	    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kadam");
	    driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("kadam.rahul49@gmail.com");
	    driver.findElement(By.xpath("aria-label=\"New password\"")).sendKeys("kadam@1234");
	    driver.findElement(By.xpath("//input[@radio=\"value=\"2\"\"]")).click();*/
	   //long millis=System.currentTimeMillis();
	   //String fname="\\"+millis+".png";
	    //Thread.sleep(5000);
	    //TakesScreenshot scr=(TakesScreenshot) driver;
	    //File SrcFile=scr.getScreenshotAs(OutputType.FILE);
	    //FileUtils.copyFile(SrcFile,new File(System.getProperty("user.dir")+"\\s2.png"));
	    
	    
	   //millis=System.currentTimeMillis();
	    //fname="\\"+millis+".png";

	}

}
