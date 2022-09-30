package com.advantageonlineshopping.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.advantageonlineshopping.features/register.feature",
        glue = "com.advantageonlineshopping.StepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterRunner {
}
