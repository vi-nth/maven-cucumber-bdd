package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/nopCommerce/features", 
		//dryRun = true,
		glue = "nopCommerce.stepDefinitions", 
		monochrome = true, 
		plugin = {"pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_nopcommerce.json" },
		snippets = SnippetType.CAMELCASE,
		tags = {"@register_login"})

public class NopCommerceRunner {

}
