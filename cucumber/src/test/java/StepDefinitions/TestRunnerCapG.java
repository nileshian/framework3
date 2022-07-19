package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/capgemini.feature",glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty","html:reports/html"}//create folder name reports
)
public class TestRunnerCapG {

}
