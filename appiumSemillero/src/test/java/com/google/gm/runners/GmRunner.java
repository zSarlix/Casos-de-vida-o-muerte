package com.google.gm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Gm.feature",
        glue = "com.google.gm.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GmRunner {
}
