package com.daedalus.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/HelloWorld.feature"},
        glue = "com.daedalus.stepsDef",
        plugin = {"pretty", "json:target/cucumber.json"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}