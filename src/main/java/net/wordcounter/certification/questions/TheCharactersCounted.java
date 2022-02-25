package net.wordcounter.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.wordcounter.certification.userInterface.HomePage;

public class TheCharactersCounted implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.CHARACTER_COUNT).viewedBy(actor).asString();
    }

    public static TheCharactersCounted were(){
        return new TheCharactersCounted();
    }
}
