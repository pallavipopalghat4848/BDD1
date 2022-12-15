package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeatureFiles/.feature"},
		glue = {"StepDefination"},
		dryRun = false,
		monochrome = true,
		plugin = 
	{
			"json:target/abc.json",
			"html:target/abcd.html",
			"pretty:target/abcde.txt",
			"pretty:target/abcdef.pdf",
	}
		)

public class TestRunner1{
}
	
	
	
	

