package com.example.loremipsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoremController {

    LoremContent lc = new LoremContent();


    @GetMapping("/main")
    public String getMain() {

        return "main";
    }


    @GetMapping("/printout")
    public String getPrintout(
            @RequestParam Integer howmany,
            @RequestParam String inputtype,
            ModelMap map) {

        if (howmany==null) {
            howmany = 0;
        }

        String loremWordsPrintout="";

        if (inputtype.equals("słowa")) {
            loremWordsPrintout = lc.getLoremWords(howmany);
        }
        else if (inputtype.equals("zdania")) {
            loremWordsPrintout = lc.getLoremSentences(howmany);
        }
        else if (inputtype.equals("paragrafy")) {
            loremWordsPrintout = lc.getLoremParagraphs(howmany);
        }

        map.put("howMany", loremWordsPrintout);
        map.put("howManyInt", howmany);
        map.put("inputDisplayNumber", inputtype);

        return "printout";
    }
}
