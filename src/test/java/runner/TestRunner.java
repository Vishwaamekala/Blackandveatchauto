package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
        features = {"./src/test/resources/features"},
        glue = {"com/wipro/qa/stepDefinitions"},
		tags = {"@TestCase44745"},
		//tags = {"@assigndisciplines"},
    //    plugin = {"json:target/cucumber.json"})
      // plugin = {"com.cucumber.listener.ExtentCucumberFormatter"})
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

	/*  E:\Pra105791\AutomationSelenium\Blackandveatchauto\src\test\resources\features
@RunWith(Cucumber.class)
@CucumberOptions(
		// features = {"src/test/resources/features/06_AssignDisciplineTeamDPS.feature"},
		features = {"C:\\Users\\Rat105478\\Desktop\\BVLaminarAutomationWithReport_Latest20\\BVLaminarAutomationWithReport\\src\\test\\resources\\features\\01_projectInformationPLI.feature"},
       glue = {"com/wipro/qa/stepDefinitions"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"})
*/
public class TestRunner {
	
	
	
}
