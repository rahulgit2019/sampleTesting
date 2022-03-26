package SeleniumCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb8_FirstSelenium {

	public static void main(String[] args) {
		//String path="E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", path);
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println("Title is "+title);
        System.out.println("current url"+driver.getCurrentUrl());
        //driver.close();
        //driver.quit();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.gmail.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();        
	}
}