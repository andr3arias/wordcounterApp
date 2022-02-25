package net.wordcounter.certification.stepsdefinitions;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.wordcounter.certification.questions.TheCharactersCounted;
import net.wordcounter.certification.userInterface.HomePage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CharactersStepsDefinitions {
    @When("^the user writes the sentence$")
    public void theUserWritesTheSentence(String arg1) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(arg1).into(HomePage.TXT_AREA));
    }


    @Then("^the user verifies that the number of characters were (.*)$")
    public void theUserVerifiesThatTheNumberOfCharactersWere(String countedCharacters) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheCharactersCounted.were()
        , Matchers.is(Matchers.equalTo(countedCharacters))));

    }

}
