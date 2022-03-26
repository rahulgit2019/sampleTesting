package TestNGPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mar15_Facebook {
	WebDriver driver=null;
  @Test
  public void init() {
	 WebDriver driver=null;
	 System.setProperty("webdriver.chrome.driver", "E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com");
	 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kadam@gmail.com");
	 driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
	 driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	  
	  
  }
 /* @Test(dependsOnMethods = "init")
  public void display() {
        String str=driver.findElement(By.xpath("//a[@class=\"_9kpn\"]")).getText();
        System.out.println("resultssss="+str);*/
  }
}
