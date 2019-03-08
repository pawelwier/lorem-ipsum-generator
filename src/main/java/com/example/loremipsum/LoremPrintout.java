package com.example.loremipsum;

public class LoremPrintout {

    private LoremCreateText lw = new LoremWordCreateText();
    private LoremCreateText ls = new LoremSentenceCreateText();
    private LoremCreateText lp = new LoremParagraphCreateText();

    public String getPrintout(Integer howMany, String inputType) {
        if (howMany == null) {
            howMany = 0;
        }
        String loremWordsPrintout = "";

        LoremCreateText le = inputType.equals("words") ? lw : (inputType.equals("sentences") ? ls : lp);

        loremWordsPrintout = le.getLoremText(howMany);

        return loremWordsPrintout;
    }

}
