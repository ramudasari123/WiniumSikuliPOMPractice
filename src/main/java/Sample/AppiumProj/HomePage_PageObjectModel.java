package Sample.AppiumProj;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

public class HomePage_PageObjectModel {
	
	By CloseLoginBtn = By.xpath("//*[contains(@id,'btn_skip')]");
	By LoginLink = By.xpath("//*[contains(@id,'btn_mlogin')]");
	By MobileNumber = By.xpath(".//*[contains(@id,'mobileNo')]");
	By PassWord = By.xpath(".//*[contains(@id,'et_password')]");
	By SignIn = By.xpath(".//*[contains(@id,'btn_mlogin')]");
	By SearchBox = By.xpath("//*[contains(@id,'search_widget_textbox')]");
	By SignupBtnFirst = By.id(".//*[@id='btn_msignup']");
	By UserName = By.xpath(".//*[contains(@id,'username')]");
	
	public By getCloseLoginBtn() {
		return CloseLoginBtn;
	}
	public By getLoginLink() {
		return LoginLink;
	}
	public By getMobileNumber() {
		return MobileNumber;
	}
	public By getPassWord() {
		return PassWord;
	}
	public By getSignIn() {
		return SignIn;
	}
	public By getSignupBtnFirst() {
		return SignupBtnFirst;
	}
	public By getSearchBox() {
		return SearchBox;
	}
}
