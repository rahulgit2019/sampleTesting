package SeleniumCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb25_ExcelRepository {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\ST\\webDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		FileInputStream fin=new FileInputStream("E:\\ST\\SeleniumInput.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(fin);
	    XSSFSheet mysheet=wb.getSheet("Sheet1");
	    int rowcount=mysheet.getLastRowNum()-mysheet.getFirstRowNum();
	    for (int i=0;i<=rowcount;i++) {
	    	XSSFRow currRow=mysheet.getRow(i);
	    	String val=currRow.getCell(0).getStringCellValue();
	    	driver.findElement(By.xpath("//*[@name='q']")).sendKeys(val);
	    	driver.findElement(By.xpath("//*[@name='q']")).submit();
	    	String res=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
	    	driver.get("https://www.google.com");
	    	driver.findElement(By.xpath("//*[@name='q']")).clear();
	    	
	    	System.out.println(val+"    "+res);
	     	
	    }
	    driver.close();	
	
	}

}
