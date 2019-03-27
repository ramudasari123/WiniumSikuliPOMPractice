package Sample.AppiumProj;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Assert;

public class CalculatorWinium {

	 public static void testCalc() throws MalformedURLException {
	  DesktopOptions options = new DesktopOptions();
	  options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	  WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999/"), options);
	  driver.findElementByXPath("//*[@ControlType='ControlType.MenuItem'][@Name='View']").click();
	  driver.findElementByXPath("//*[@ControlType='ControlType.MenuItem'][@Name='Programmer']").click();
	  driver.findElementByXPath("//*[@ControlType='ControlType.RadioButton'][@Name='Dec']").click();
	  driver.findElementByXPath("//*[@ControlType='ControlType.Button'][@Name='2']").click();
	  driver.findElementByXPath("//*[@ControlType='ControlType.Button'][@Name='5']").click();
	  driver.findElementByXPath("//*[@ControlType='ControlType.RadioButton'][@Name='Hex']").click();
	  Assert.assertTrue(driver.findElementByXPath("(//*[@ControlType='ControlType.Text'])[3]").getAttribute("Name")
	    .equals("19"));
	 }
	
	public static void main(String[] args) throws MalformedURLException {
		CalculatorWinium calc = new CalculatorWinium();
		calc.testCalc();

	}

}
