package cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="@target/rerun.txt",
		glue= "stepDefinations", 
		dryRun=false, //check the definiton is define or not if not it will will display the method in console when it is set to true
		strict=true,//check defintion
		monochrome=true,// shwo error in readable format
		plugin= {"pretty","html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/cucumberTestReport.json"},
		tags= {"@CRM"}    //{"@sokeetest","@regTEst"}== means run tc conatins both tag
		)
public class runnerFailedScenario extends AbstractTestNGCucumberTests {
		

}
