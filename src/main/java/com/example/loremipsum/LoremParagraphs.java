package com.example.loremipsum;

public class LoremParagraphs implements LoremElements {

    LoremContent lc1 = new LoremContent();


    private String[] loremArrParagraphs = lc1.loremFull.split("\n");

    public String getLoremElements(int x) {
        String showText = "";
        if (x > 12) {
            return "Maksymalna ilość paragrafów: 12";
        } else {
            for (int i = 0; i < x; i++) {
                showText += loremArrParagraphs[i] + " ";
            }
            return showText;
        }
    }
}
