package com.Mobile_Test.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
             //   "com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin"
        },
        features = "src/test/java/resource",
        glue = "com/Mobile_Test/StepDefinition",
        dryRun = false,
        tags = "@test"
)
public class CukesRunner {

}
