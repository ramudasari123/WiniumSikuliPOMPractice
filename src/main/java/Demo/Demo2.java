package Demo;

import org.testng.annotations.Test;

public class Demo2 {

	String message = ".com";
	@Test(groups = { "functest", "checkintest" })
	   
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	   }
	@Test(groups={"functest","Regression"})
	public void testCaseTwo(){
	System.out.println("class 2-------group regression 1");
	}
	   @Test(groups ={"checkintest"})
	   
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	   }

	   @Test(groups ={"functest"})
	   
	   public void testingExitMessage() {
	      System.out.println("Inside testExitMessage()");
	   }  
}
