import org.junit.runner.RunWith;

import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", 
        monochrome = true, 
        snippets = SnippetType.CAMELCASE,
        dryRun = false, 
        strict = true

		)
public class Runner {

}
