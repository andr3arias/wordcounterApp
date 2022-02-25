package net.wordcounter.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/charactersCounter.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "net.wordcounter.certification.stepsdefinitions"
)

public class CharactersCounterRunner {
}
