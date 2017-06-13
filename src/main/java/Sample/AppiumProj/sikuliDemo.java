package Sample.AppiumProj;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class sikuliDemo {
	static WebDriver driver;

	public void launching() throws IOException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		// driver.navigate().refresh();
		WebElement logo1 = driver.findElement(By
				.cssSelector("[alt='Flipkart']"));
		File file1 = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		BufferedImage img1 = ImageIO.read(file1);
		Point p = logo1.getLocation();
		Dimension d = logo1.getSize();
		BufferedImage subImg1 = img1.getSubimage(p.x, p.y, d.width, d.height);
		// ImageIO.write(subImg, "png", file);
		driver.findElement(
				By.xpath("//a[contains(text(),'24x7 Customer Care')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement logo2 = wait.until(ExpectedConditions.visibilityOf(wait
				.until(ExpectedConditions.presenceOfElementLocated(By
						.cssSelector(".logo-img.retina-img")))));
		File file2 = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		BufferedImage img2 = ImageIO.read(file2);
		Point p2 = logo2.getLocation();
		Dimension d2 = logo2.getSize();
		BufferedImage subImg2 = img2.getSubimage(p2.x, p2.y, d2.width,
				d2.height);
		ImageIO.write(subImg2, "png", file2);
		Screen s = new Screen();
		try {
			s.find(file2.getAbsolutePath());
			s.click(file2.getAbsolutePath());
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Finder find = new Finder(subImg1);
		// find.find(file2.getAbsolutePath());
		// System.out.println("Found :> " + find.hasNext());

		driver.close();
		driver.quit();
	}
	public void sikuliclick(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
		// driver.navigate().refresh();
		Screen s = new Screen();
		try {
			s.find("D:\\autoit\\next1.png");
			s.click();
			// s.click("Forgot password");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Finder find = new Finder(subImg1);
		// find.find(file2.getAbsolutePath());
		// System.out.println("Found :> " + find.hasNext());

		driver.close();
		driver.quit();
	}
	 public static boolean compareImage(File imageFile1, File imageFile2, float threshold) throws IOException {
		  BufferedImage image1 = ImageIO.read(imageFile1);
		  BufferedImage image2 = ImageIO.read(imageFile2);
		  DataBuffer buffer1 = image1.getData().getDataBuffer();
		  DataBuffer buffer2 = image2.getData().getDataBuffer();
		  int letGo = (int) (buffer1.getSize() - buffer1.getSize() * threshold / 100);
		  System.out.println("size1 :>" + buffer1.getSize());
		  System.out.println("size2 :>" + buffer2.getSize());
		  System.out.println("LetGo :> " + letGo);
		  boolean match = true;
		  if (buffer1.getSize() != buffer2.getSize()) {
		   System.out.println("Size of both Images are different still finding for a match ");
		  }
		  for (int i = 0; i < Math.min(buffer1.getSize(), buffer2.getSize()); i++) {
		   if (buffer1.getElem(i) != buffer2.getElem(i) && --letGo <= 0) {
		    match = false;
		    break;
		   }
		  }
		  System.out.println("Match :>" + match);
		  return match;
		 }

	public static void main(String[] args) throws IOException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
		// driver.navigate().refresh();
		Screen s = new Screen();
		try {
			s.find("D:\\autoit\\next1.png");
			s.click();
			// s.click("Forgot password");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Finder find = new Finder(subImg1);
		// find.find(file2.getAbsolutePath());
		// System.out.println("Found :> " + find.hasNext());

		driver.close();
		driver.quit();

	}

}
