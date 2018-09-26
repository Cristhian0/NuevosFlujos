package co.com.Nequi.PedirPlata.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(features = "src/test/resources/features/PedirPlata.feature", tags = "@tag1" ,glue = {
		"co.com.Nequi.PedirPlata.stepDefinitions" }, snippets = SnippetType.CAMELCASE)
@RunWith(CucumberWithSerenity.class)
public class PedirPlataRunner {

}
