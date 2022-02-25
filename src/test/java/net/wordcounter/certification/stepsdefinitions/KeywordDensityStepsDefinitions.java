package net.wordcounter.certification.stepsdefinitions;

import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.wordcounter.certification.questions.TheDensity;
import net.wordcounter.certification.questions.TheWordWithDensity;
import org.hamcrest.Matchers;

import java.util.Locale;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class KeywordDensityStepsDefinitions {

    @Then("^the user verifies the word with density x1(.*)$")
    public void theUserVerifiesTheTheWordWithDensityX1(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheWordWithDensity.x1Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
      );
    }

    @Then("^the user verifies the density x1(.*)$")
    public void theUserVerifiesTheDensityX1(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheDensity.x1Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
        );
    }

    @Then("^the user verifies the word with density x2(.*)$")
    public void theUserVerifiesTheTheWordWithDensityX2(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheWordWithDensity.x2Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
        );
    }

    @Then("^the user verifies the density x2(.*)$")
    public void theUserVerifiesTheDensityX2(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheDensity.x2Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
        );
    }

    @Then("^the user verifies the word with density x3(.*)$")
    public void theUserVerifiesTheTheWordWithDensityX3(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheWordWithDensity.x3Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
        );
    }

    @Then("^the user verifies the density x3(.*)$")
    public void theUserVerifiesTheDensityX3(String density) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (TheDensity.x3Was(), Matchers.is(Matchers.equalTo(density.trim().toLowerCase(Locale.ROOT))))
        );
    }
}
