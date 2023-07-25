package com.softwaretestingboard.magento.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/resources/featurefile/MenTest.feature",
        glue = "com/softwaretestingboard/magento",
        tags= "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)

public class MenRegressionRunner
{
}
