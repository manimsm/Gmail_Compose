package test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, features = "src\\test\\resources\\Features\\Compose_Mail.feature", 
glue = "org.stepdef", monochrome = true)
public class TestRunner {

}
