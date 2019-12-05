package com.exxon_mobil.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/java/com/exxon_mobil/features/", 
        glue = "com.exxon_mobil.stepdefinitions",
		dryRun = false, 
		monochrome = true, 
		plugin = {"html:target/site/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json" },
		strict = false) 
        //tags = {~@SmokeTest", "~@RegressionTEst", "~End2End"} 

public class TestRunner {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());

	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)

	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();

	}

}
