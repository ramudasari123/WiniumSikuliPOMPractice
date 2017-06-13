package Sample.AppiumProj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactoryModel {

	@FindBy(xpath = "//*[contains(@resource-id,'btn_skip')]")
	WebElement CloseLoginBtn;

	@FindBy(xpath = "//*[contains(@resource-id,'btn_mlogin')]")
	WebElement LoginLink;

	@FindBy(xpath = ".//*[contains(@resource-id,'mobileNo')]")
	WebElement MobileNumber;

	@FindBy(xpath = ".//*[contains(@resource-id,'et_password')]")
	WebElement PassWord;

	@FindBy(xpath = ".//*[contains(@resource-id,'btn_mlogin')]")
	WebElement SignIn;

	@FindBy(xpath = "//*[contains(@resource-id,'search_widget_textbox')]")
	WebElement SearchBox;

	public HomePage_PageFactoryModel() {
		PageFactory.initElements(OpenPage.driver, this);
	}

	public WebElement getCloseLoginBtn() {
		return CloseLoginBtn;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getPassWord() {
		return PassWord;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

}
