package TestNGPro;

import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Mar20_Listener implements ITestListener {
	WebDriver driver=null;
	
	@BeforeTest 
	public void init() {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		
	}
	
  @Test(dataProvider = "dp")
  public void search(String s) {
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys(s);
		driver.findElement(By.xpath("//*[@name='q']")).submit();
		Assert.assertTrue(driver.getTitle().contains(s));//Assert.assertFalse
		System.out.println("I am Hard assert here");
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "selenium" },
      new Object[] { "java" },
      new Object[] { "jio" },
    };
  }
  @Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	ITestListener.super.onStart(context);
	Reporter.log("Started"+context.getName());
}
}
