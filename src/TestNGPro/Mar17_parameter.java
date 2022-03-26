package TestNGPro;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class Mar17_parameter {
   WebDriver driver=null;
	@Test
	@Parameters({"browser","cpath","mpath"})
  public void f(String br,String chromepath,String mozilapath) {
		if (br.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
	}
	else {
		System.setProperty("webdriver.gecko.driver", mozilapath);
		driver=new FirefoxDriver();	
	}
}
	 

@Test(dependsOnMethods = {"f"})
@Parameters({"site"})
public void f2(String site) {
	driver.get(site);
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	driver.findElement(By.xpath("//*[@name='q']")).submit();
}
}


