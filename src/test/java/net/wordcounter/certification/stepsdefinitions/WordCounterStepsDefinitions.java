package net.wordcounter.certification.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import net.wordcounter.certification.questions.TheWordsCounted;
import net.wordcounter.certification.userInterface.HomePage;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class WordCounterStepsDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Andrea");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is in the application$")
    public void theUserIsInTheApplication() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://wordcounter.net/"));

    }

    @When("^the user writes the sentence (.*)")
    public void theUserWritesTheSentence(String sentence) {
     theActorInTheSpotlight().attemptsTo(Enter.theValue(sentence).into(HomePage.TXT_AREA));
    }


    @Then("^the user verifies that the number of words were (.*)$")
    public void theUserVerifiesThatTheNumberOfWordsWere(String countedWords) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                TheWordsCounted.were(), Matchers.is(Matchers.equalTo(countedWords))
        ));

    }




}
