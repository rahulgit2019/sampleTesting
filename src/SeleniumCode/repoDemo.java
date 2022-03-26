package SeleniumCode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class repoDemo {
	public static void main(String[] args) throws IOException {
	//FileInputStream fio=new FileInputStream("E:\\bin\\SeleniumDecBatch\\repository.properties");
	FileInputStream fio=new FileInputStream(System.getProperty("user.dir")+"\\repository.properties");
	Properties prop=new Properties();
	prop.load(fio);
	String dpath=prop.getProperty("path");
	//System.out.println(dpath);
	System.setProperty("webdriver.chrome.driver", dpath);
	WebDriver driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	String searchWord=prop.getProperty("searchWord");
	driver.findElement(By.xpath(prop.getProperty("searchbox"))).click();
	}

}
