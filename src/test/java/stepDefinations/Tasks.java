package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.tasks;
import resources.TestBase;

public class Tasks extends TestBase  {
	//public WebDriver driver;
	   String taskno;
	@Then("^Mouse hover Tasks and click New Task$")
    public void mouse_hover_something_and_click_something() throws Throwable {
		new tasks(driver).newTaskSelection();
    }

    @And("^Enter the details$")
    public void enter_the_details(DataTable dt) throws Throwable {
       taskno= new tasks(driver).getTaskno();
       new tasks(driver).enterTaskDeatils(dt);
       new tasks(driver).clickOnLookUpbtn();
       new tasks(driver).ComapnyLookupSearch();
      
      
    }

    @And("^click On Save button$")
    public void click_on_something_button() throws Throwable {
    	new tasks(driver).btnsave();
    }

    @And("^check Task created$")
    public void check_task_created() throws Throwable {
    	new tasks(driver).checkTaskcreation();
    }
}
