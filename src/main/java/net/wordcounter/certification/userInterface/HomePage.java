package net.wordcounter.certification.userInterface;


import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static  final Target TXT_AREA = Target.the("text area").locatedBy("//*[@id='box']");
    public static final Target WORD_COUNT = Target.the("word count").locatedBy("//*[@id='word_count']");
    public static final Target CHARACTER_COUNT = Target.the("character_count").locatedBy("//*[@id='character_count']");
    public static final Target DENSITYX1 = Target.the("keyword Density x1").locatedBy("//div[@id='kwd-accordion-data']//a[1]//span[@class='badge']");
    public static final Target WORD_DENSITYX1 = Target.the("word of keyword Density x1").locatedBy("//div[@id='kwd-accordion-data']//a[1]//span[@class='word']");
    public static final Target DENSITYX2 = Target.the("keyword Density x2").locatedBy("//div[@id='kwd-accordion-data']//a[2]//span[@class='badge']");
    public static final Target WORD_DENSITYX2 = Target.the("word of keyword Density x2").locatedBy("//div[@id='kwd-accordion-data']//a[2]//span[@class='word']");
    public static final Target DENSITYX3 = Target.the("keyword Density x3").locatedBy("//div[@id='kwd-accordion-data']//a[3]//span[@class='badge']");
    public static final Target WORD_DENSITYX3 = Target.the("word of keyword Density x3").locatedBy("//div[@id='kwd-accordion-data']//a[3]//span[@class='word']");
}
