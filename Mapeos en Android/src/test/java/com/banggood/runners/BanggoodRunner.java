package com.banggood.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\banggood.feature",
        glue = "com.banggood.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BanggoodRunner {
}
