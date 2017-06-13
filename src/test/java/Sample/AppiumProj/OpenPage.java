package Sample.AppiumProj;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.cloud.sql.jdbc.Driver;

public class OpenPage {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	static AndroidDriver driver;
	HomePage_PageFactoryModel homepage = new HomePage_PageFactoryModel();

	@BeforeSuite
	public static void startAppiumServer(){
		Process p;
		
//			  service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//			    .usingPort(4723)
//			    .usingDriverExecutable(new File(
//			      "C:\\Users\\nisha.mistry\\Desktop\\SampleAppium\\SampleAppium\\server\\node.exe"))
//			    .withAppiumJS(new File(
//			      "C:\\Users\\nisha.mistry\\Desktop\\SampleAppium\\SampleAppium\\server\\main.js")));
//
//			  service.start();
	}
	
	@BeforeClass
	public static void setUp() throws Exception {
		File app = new File("D:/appiumAPK/Flipkart_5.6_APKTrunk.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0");
		// capabilities.setCapability("browserName", "Browser");
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity",
				"com.flipkart.android.SplashActivity");
		// capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}

	@Test
	public void register() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		CommonUtils.pause(20);
		// CommonUtils.waitforElementtoVisible(homepage.getLoginLink(), driver);
		// driver.findElement(By.xpath("//*[contains(@resource-id,'btn_mlogin')]")).click();
		// new HomePage_PageFactoryModel().getLoginLink().click();
		homepage.getLoginLink().click();
		// homepage.getMobileNumber().sendKeys("8147740413");
		driver.findElement(By.xpath(".//*[contains(@resource-id,'mobileNo')]"))
				.sendKeys("8147740413");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// homepage.getPassWord().sendKeys("Ramu123@123");
		driver.findElement(
				By.xpath(".//*[contains(@resource-id,'et_password')]"))
				.sendKeys("Ramu123@123");
		// homepage.getSignIn().click();
		driver.findElement(
				By.xpath(".//*[contains(@resource-id,'btn_mlogin')]")).click();
		// homepage.getCloseLoginBtn().click();
		CommonUtils.pause(5);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		homepage.getSearchBox().isDisplayed();
		int width = driver.manage().window().getSize().getWidth();
		System.out.println("width issssssssss " + width);
		int height = driver.manage().window().getSize().getHeight();
		System.out.println("height issssssss" + height);
		// driver.swipe(startx, starty, endx, endy, duration);
	}

	@AfterClass
	public void close() {
		System.out.println("completeddddddd");
		driver.quit();
	}
}
