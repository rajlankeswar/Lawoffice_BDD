package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Azure_Test_Project\\BDD_FM_KUDOS\\src\\main\\java\\features",
		glue={"step_definitions"}, //the path of the step definition files
		format = {"pretty","html:test-output/", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting 
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags  = {"@CreatePost"}
		
		// Examples: 	tags = {"@SmokeTest" , "@RegressionTest", "@End2End"}
		
		// GIT Explanation for training
		
		)


public class Test_Runner {

}