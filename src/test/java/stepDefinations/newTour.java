package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.newtourSignupPage;
import pageObjects.userCreation;
import resources.TestBase;


public class newTour extends TestBase  {
	//public WebDriver driver;
	//WebDriver driver;
	newtourSignupPage nsp;
	userCreation usercreat;
	
	 @Given("^Navigate to homepage of newtoursdemoautURl and Click on the register link$")
	    public void navigate_to_homepage_of_newtoursdemoauturl_and_click_on_the_register_link() throws Throwable {
		// new newtourSignupPage().naviagtTomercuryTourURL();
		// new newtourSignupPage(driver).linkclick();
		 nsp=new newtourSignupPage();
 		 nsp.naviagtTomercuryTourURL();
		 nsp.linkclick();
	    }

	  @When("^Enter contact info \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_contact_info(String FirstName, String LastName, String Phone, String Email) throws Throwable {
	    	//new newtourSignupPage(driver).contactInfo(FirstName,LastName,Phone,Email);
	      nsp.contactInfo(FirstName,LastName,Phone,Email);
	    }
	    

	  @And("^Enter Mailing info \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_mailing_info(String address1,String address2, String city, String state, String postalcode, String country) throws Throwable {
	       //new newtourSignupPage(driver).mailingInfo(address1,address2,city,state,postalcode,country);
		  nsp.mailingInfo(address1,address2,city,state,postalcode,country);
	    }


	  @And("^Enter UserInfo \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void enter_userinfo(String username, String password, String confirmpassword) throws Throwable {
	    	//new newtourSignupPage(driver).userInfo(username,password,confirmpassword);
		 nsp.userInfo(username,password,confirmpassword);
	    }

	    @And("^Click on submit$")
	    public void click_on_submit() throws Throwable {
	    	//new newtourSignupPage(driver).clickSubmitButton();
	    	usercreat=nsp.clickSubmitButton();
	        
	    }
	    @Then("^User created\"([^\"]*)\"$")
	    public void user_created(String username) throws Throwable {
	      //  new newtourSignupPage().verfiytheUserCreation(username);
	        usercreat.verfiytheUserCreation(username);
	        
	    }
	  

}
