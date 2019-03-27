package Demo;

import org.testng.annotations.Test;

public class Demo1 {

	@Test(groups="Regression", priority=1)
	public void testCaseOne()
	{
	System.out.println("class 1-------group regression1..test1");
	}
	@Test(groups="Smoke Test", priority=0)
	public void testCaseThree(){
	System.out.println("class 1-------group smoke1...test2");
	}
	@Test(groups="Regression", priority=2)
	public void testCaseFour(String st1, String st2){
	System.out.println("class 1-------group regression2......test3");
	 String data = String.format("{'clientName':'%s','amount':'%s'}", st1, st2);
	 
	}
}
