package stepDefination;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featureFile/Signup.feature",
glue="stepDefination",

monochrome=true,
tags="@single or @multiple",

plugin= {"html:src/test/resources/src/target/reports3.html"}
		
		)

public class TestRunner {


}




