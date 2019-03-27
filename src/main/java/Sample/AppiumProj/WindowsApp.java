package Sample.AppiumProj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WindowsApp {

	static WiniumDriver driver;

	// public static void main(String[] args) throws MalformedURLException {
	//
	// DesktopOptions dp = new DesktopOptions();
	// dp.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
	//
	// driver = new WiniumDriver(new URL("http://localhost:9999"), dp);
	//
	// driver.findElementByClassName("Edit").sendKeys(
	// "Hi I'm Ramu ........Bro", Keys.ENTER);
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// driver.close();
	// }
	public static void main(String[] args) throws MalformedURLException,
			InterruptedException, AWTException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files (x86)\\Skype\\Phone\\Skype.exe");
		WiniumDriver driver = new WiniumDriver(
				new URL("http://localhost:9999/"), options);
		// driver.manage().window().maximize();
		System.out.println("Driver Instantiated");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement eleRecent = driver.findElementByXPath("//*[@Name='RECENT']");
		// Robot robot = new Robot();
		String bounds = eleRecent.getAttribute("BoundingRectangle");
		String[] arrBounds = bounds.split(",");
		int[] arr = new int[arrBounds.length];
		for (int i = 0; i < arrBounds.length; i++) {
			arr[i] = Integer.parseInt(arrBounds[i]);
		}
		Actions actions = new Actions(driver);
		// actions.moveToElement(eleRecent, -(int) (arr[2] * .8), 0).click()
		// .perform();
		actions.moveToElement(eleRecent, (int) (arr[1] * .2), arr[3] / 2)
				.click().perform();
		System.out.println("bounds " + arr[0] + "," + arr[1] + "," + arr[2]
				+ "," + arr[3]);
		System.out.println("moving to " + arr[0] + "," + arr[1] + arr[3] / 2);
		// robot.mouseMove(arr[0], (arr[1] + arr[3] / 2));
		// Thread.sleep(3000);
		// robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		// robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		List<WebElement> listContacts = wait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By
						.xpath("//*[@Name='Recent messages']//*[contains(@LocalizedControlType,'list item')]")));
		System.out.println("Contact size :> " + listContacts.size());
		for (WebElement contact : listContacts) {
			System.out.println("name :> " + contact.getAttribute("Name"));
			if (contact.getAttribute("Name").contains("KARTHIK volansys")) {
				contact.click();
				WebElement ele = driver.findElement(By
						.xpath("//*[@ClassName='TChatEntryControl']"));
				Actions ac = new Actions(driver);
				ac.click(ele).perform();
				
			}
		}
	}
}
