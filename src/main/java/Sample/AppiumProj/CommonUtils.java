package Sample.AppiumProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	public static void waitforElementtoVisible(WebElement element,
			WebDriver driver, long... timeout) {
		WebDriverWait wait = null;
		if (timeout.length > 0) {
			wait = new WebDriverWait(driver, timeout[0]);

		} else {
			wait = new WebDriverWait(driver, 30);
		}
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
//	public static void WaitForElement(){
//		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));
//	}
	
	public static void pause(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		}
	}
}
