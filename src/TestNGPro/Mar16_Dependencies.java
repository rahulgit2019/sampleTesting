package TestNGPro;

import org.testng.annotations.Test;

public class Mar16_Dependencies {
	int x=100,y=200;
	
  @Test(groups = {"basicArith"})
  public void add() {
	  System.out.println("addition"+(x+y));
  }
  @Test(groups = {"basicArith"})
  public void sub() {
	  System.out.println("SUB="+(x-y));
  }
  
  @Test(groups = {"basicArith"})
  public void div() {
	  System.out.println("DIV="+(x/y));
  }
  
  @Test(groups = {"basicArith","Areawale"})
  public void mul() {
	  System.out.println("MUL="+(x*y));
  }
  
  @Test(groups = {"Areawale"})
  public void SqrArea() {
	  System.out.println("SQAREA="+(x*x));
 }
  
  @Test(groups = {"Areawale"})
  public void Rectarea() {
	  System.out.println("RECTAREA="+(x*y)); 
  }
}