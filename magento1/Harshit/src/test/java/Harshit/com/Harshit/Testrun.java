package Harshit.com.Harshit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resource", glue="stepdefinations")
public class Testrun {
	
}
