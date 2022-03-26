package TestNGPro;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Mar19_Assert2 {
	@Test(dataProvider = "dp")
	public void hard(Integer n,Integer m,Integer o) {
		Integer add=n+m;
		Assert.assertEquals(add, o);
		System.out.println("just after Hard assert here");

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, 1, 5 },
			new Object[] { 2, 4, 6 },
			new Object[] { 2, 7, 5 },
			new Object[] { 2, 9, 11 },
		};
	}

	@Test(dataProvider = "dp")
	public void soft(Integer n,Integer m,Integer o) {
		Integer add=n+m;
		SoftAssert as=new SoftAssert();
		as.assertEquals(add, o);
		System.out.println("just after Soft assert here");
	}
}
