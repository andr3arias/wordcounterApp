package net.wordcounter.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.wordcounter.certification.userInterface.HomePage;

public class TheWordsCounted implements Question <String>{


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.WORD_COUNT).viewedBy(actor).asString();
    }

    public static TheWordsCounted were(){
        return new TheWordsCounted();
    }
}
