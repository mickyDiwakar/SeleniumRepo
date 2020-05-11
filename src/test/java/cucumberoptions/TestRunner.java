package cucumberoptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

//import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//import cucumber.api.CucumberOptions;

//import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.Scenario;

//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class) //comment this now it is integrate wid testng
@CucumberOptions(
		features="src/test/java/features", 
		glue= "stepDefinations", 
		dryRun=false, //check the definiton is define or not if not it will will display the method in console when it is set to true
		strict=true,//check defintion
		monochrome=true,// shwo error in readable format 
		
		plugin= {"pretty","html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/cucumberTestReport.json","rerun:target/rerun.txt"},
		tags= {"@CRM,@automationpractice"}  //{"@sokeetest","@regTEst"}== means run tc conatins both tag
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
		
	
	//{"@sokeetest","@regTEst"}== means run tc conatins both tag
	//{"@sokeetest,@regTEst"}== means run tc conatins either of the tag
	//{"~@sokeetest","@regTEst"}  ==meanss exculde somketest
	
	
	
	/*
	 * private TestNGCucumberRunner testNGcucumberRuner;
	 * 
	 * @BeforeClass(alwaysRun=true) public void setUpClass() {
	 * testNGcucumberRuner=new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @Test(dataProvider="features") public void feature(PickleEventWrapper
	 * eventWrapper,CucumberFeatureWrapper cucumberFeature) throws Throwable {
	 * testNGcucumberRuner.runScenario(eventWrapper.getPickleEvent()); }
	 * 
	 * @DataProvider public Object[][] features(){ return
	 * testNGcucumberRuner.provideScenarios(); }
	 * 
	 * @AfterClass(alwaysRun=true) public void teardownClass() {
	 * testNGcucumberRuner.finish(); }
	 */
	 
	
	
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	 
	 
	  
	  
	 
}	
	
// inhert this class to work testng and cumber integration
