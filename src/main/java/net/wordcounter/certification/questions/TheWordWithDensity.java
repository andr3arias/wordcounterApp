package net.wordcounter.certification.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.wordcounter.certification.userInterface.HomePage;

public class TheWordWithDensity{

        public static Question<String> x1Was() {
        return actor -> Text.of(HomePage.WORD_DENSITYX1).viewedBy(actor).asString();
    }

        public static Question<String> x2Was() {
        return actor -> Text.of(HomePage.WORD_DENSITYX2).viewedBy(actor).asString();
    }

        public static Question<String> x3Was() {
        return actor -> Text.of(HomePage.WORD_DENSITYX3).viewedBy(actor).asString();
    }
    }