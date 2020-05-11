package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import pageObjects.Homepage1;
import resources.TestBase;

public class homepage extends TestBase {
	//public WebDriver driver;
	 @Then("^Click on column refered by column$")
	    public void click_on_column_refered_by_column(DataTable dt) throws Throwable {
		 Homepage1 homepage= new Homepage1(driver);
		 homepage.linkclickonTable(dt);
	    }

}
