package com.example.loremipsum;

public class LoremSentences implements LoremElements {

    LoremContent lc1 = new LoremContent();

    private String[] loremArrSentences = lc1.loremFull.split("\\. ");

    public String getLoremElements(int x) {
        String showText = "";
        if (x > 134) {
            return "Maksymalna ilość zdań: 134";
        } else {
            for (int i = 0; i < x; i++) {
                showText += loremArrSentences[i] + ". ";
            }
            return showText;
        }
    }

}
