package Demo;

import org.testng.annotations.Test;

public class Demo1 {

	@Test(groups="Regression", priority=1)
	public void testCaseOne()
	{
	System.out.println("class 1-------group regression1");
	}
	@Test(groups="Smoke Test")
	public void testCaseThree(){
	System.out.println("class 1-------group smoke1");
	}
	@Test(groups="Regression", priority=2)
	public void testCaseFour(){
	System.out.println("class 1-------group regression2");
	}
}
