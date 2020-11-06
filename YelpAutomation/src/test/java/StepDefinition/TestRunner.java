package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features",
		glue= {"StepDefinition"},
		monochrome= true,
		plugin={"pretty","json:target/JSONReport/Yelpreport.json"
				}
		)
public class TestRunner {

}
