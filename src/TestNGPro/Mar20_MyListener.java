package TestNGPro;

import javax.naming.Context;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Mar20_MyListener implements ITestListener{

@Override
public void onFinish(ITestContext context) {
	ITestListener.super.onFinish(context);
	System.out.println("completed");
    Reporter.log("Test completed");
	}

@Override
public void onTestFailure(ITestResult result) {
	ITestListener.super.onTestFailure(result);
Reporter.log("Test Failed");
	}
	
@Override
public void onTestStart(ITestResult result) {
	ITestListener.super.onTestFailure(result);
Reporter.log("Test started");
System.out.println("hello");
	}

}
