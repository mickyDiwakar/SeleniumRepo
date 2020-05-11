package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import resources.TestBase;

public class newtourSignupPage extends TestBase {
	//newtoursdemoautURl
	
	//public WebDriver driver;
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement linkRegister;
	@FindBy(name="firstName")
	WebElement txtFirstName;
	@FindBy(name="lastName")
	WebElement txtlastName;
	@FindBy(name="phone")
	WebElement txtphone;
	@FindBy(id="userName")
	WebElement txtemail;
	@FindBy(name="address1")
	WebElement txtaddress1;
	@FindBy(name="address2")
	WebElement txtaddress2;
	@FindBy(name="city")
	WebElement txtcity;
	@FindBy(name="state")
	WebElement txtstate;
	@FindBy(name="postalCode")
	WebElement txtpostalCode;
	@FindBy(name="country")
	WebElement selcountry;
	@FindBy(name="email")
	WebElement txtUserName;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(name="confirmPassword")
	WebElement txtconfirmPassword;
	@FindBy(name="register")
	WebElement btnSubmit;
	

	 public newtourSignupPage() {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 public void naviagtTomercuryTourURL() {
		driver.get(p.getProperty("newtoursdemoautURl"));
		 WaitVisibilityOf(linkRegister, 8000);
	 }
	 public void linkclick() {
		 linkRegister.click();
		WaitVisibilityOf(txtFirstName, 8000);
	 }
	 public void contactInfo(String FN,String LN,String PH,String Email) {
		 txtFirstName.sendKeys(FN);
		 txtlastName.sendKeys(LN);
		 txtphone.sendKeys(PH);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='"+Email+"';", txtemail);
	 }
	 public void mailingInfo(String ads1, String ads2,String city,String state,String post,String country) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 //syntax js.executeScript("arguments[0].value='value1';", args)
		 //js.exceuteScript("window.scrollBy(0,600)");
		 js.executeScript("arguments[0].value='"+ads1+"';", txtaddress1);
		 js.executeScript("arguments[0].value='"+ads2+"'", txtaddress2);
		 txtcity.sendKeys(city);
		 txtstate.sendKeys(state);
		 txtpostalCode.sendKeys(post);
		 Select s=new Select(selcountry);
		 s.selectByVisibleText(country.toUpperCase());
	 }
	 public int userInfo(String UserName,String Password,String ConfirmPassword) {
		 int val=1;
		 txtUserName.sendKeys(UserName);
		 txtPassword.sendKeys(Password);
		 txtconfirmPassword.sendKeys(ConfirmPassword);
		 return val;
	 }
	 public userCreation clickSubmitButton() {
		 btnSubmit.click();
		return new userCreation() ;
	 }
 
}
