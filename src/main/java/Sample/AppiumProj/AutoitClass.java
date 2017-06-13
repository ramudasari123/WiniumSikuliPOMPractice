package Sample.AppiumProj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoitClass {
	WebDriver driver;

	public void upload() throws InterruptedException, IOException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signin/v2/identifier?hl=en&sacu=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.navigate().refresh();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(
				"ramu814.d@gmail.com");
		driver.findElement(
				By.xpath(".//*[@id='identifierNext']//span[contains(text(),'Next')]"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("[type='password']")));
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys(
				"9885680644");
		driver.findElement(
				By.xpath(".//*[@id='passwordNext']//span[contains(text(),'Next')]"))
				.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("[class='gb_b gb_4b']")));
		driver.findElement(By.cssSelector("[class='gb_b gb_4b']")).click();
		driver.findElement(
				By.xpath(".//*[@id='gb23']/span[contains(text(),'Gmail')]"))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(".//*[@id=':h1']//div[contains(@class,'z0')]/div")));
		driver.findElement(
				By.xpath(".//*[@id=':h1']//div[contains(@class,'z0')]/div"))
				.click();
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By
						.cssSelector(".a1.aaA.aMZ"))).click();
		// driver.findElement(By.cssSelector("[class='a1 aaA aMZ']")).click();
		Runtime.getRuntime().exec("D:\\autoit\\Fileupload.exe");
	}

	public static void main(String[] args) throws IOException,
			InterruptedException {
		AutoitClass file = new AutoitClass();
		file.upload();
	}
}