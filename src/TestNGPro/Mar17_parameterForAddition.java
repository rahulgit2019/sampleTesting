package TestNGPro;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Mar17_parameterForAddition {
  @Test
  @Parameters({"num1","num2"})
  public void f(int n1,int n2) {
	  System.out.println("addition="+(n1+n2));
  }
}
