package com.osa.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/com/osa/features"},
		glue = {"com.osa.steps"},
		tags = {"@regression"},
		plugin = {"json:target/cucumber-reports/Cucumber.json","pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber","html:target/pretty-cucumber"}
		)
class RunStage extends AbstractTestNGCucumberTests{


}
