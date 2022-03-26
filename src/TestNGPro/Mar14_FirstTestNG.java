package TestNGPro;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mar14_FirstTestNG {
  @Test(priority = -1)
  public void f() {
	  System.out.println("function f");
  }
  
  @Test(priority = 2)
  public void hello() {
	  System.out.println("function hello  f");
  }
  @Test(priority = -3)
  public void hi() {
	  System.out.println("function hi f");
  }
  @Test(priority = 0)
  public void by() {
	  System.out.println("function by f");
  }
  @BeforeMethod
  public void bef() {
	  System.out.println("function exe before ");
  }
  @AfterMethod
  public void aft() {
	  System.out.println("function exe aftter");
  }
  
}
