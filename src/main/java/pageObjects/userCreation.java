package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.TestBase;

public class userCreation extends TestBase {
	@FindBy(xpath="//a/font/b")
	WebElement messageForMemebrcraetion;
	
	public userCreation() {
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 public void verfiytheUserCreation(String UserName){
		 
		 try {
			 
			 WaitVisibilityOf(messageForMemebrcraetion, 8000);
			String str=messageForMemebrcraetion.getText();
			 if (str.contains(UserName)) {
				 Assert.assertTrue(true);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertFalse(true);
		}
	 }
}
