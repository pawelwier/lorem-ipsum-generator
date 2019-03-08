package com.example.loremipsum;

public class LoremWordCreateText implements LoremCreateText {

    LoremContent lc1 = new LoremContent();

    private String[] loremArrWords = lc1.loremFull.split(" ");

    public String getLoremText(int x) {
        String showText = "";
        if (x > 1228) {
            return "Maksymalna ilość słów: 1228";
        } else {
            for (int i = 0; i < x; i++) {
                showText += loremArrWords[i] + " ";
            }
            return showText;
        }
    }

}
