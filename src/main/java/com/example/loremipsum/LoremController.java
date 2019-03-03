package com.example.loremipsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoremController {

    LoremElements lw = new LoremWords();
    LoremElements ls = new LoremSentences();
    LoremElements lp = new LoremParagraphs();


    @GetMapping("/main")
    public String getMain() {

        return "main";
    }


    @GetMapping("/printout")
    public String getPrintout(
            @RequestParam Integer howmany,
            @RequestParam String inputtype,
            ModelMap map) {

        if (howmany == null) {
            howmany = 0;
        }
            String loremWordsPrintout = "";

            LoremElements le = inputtype.equals("słowa") ? lw : (inputtype.equals("zdania") ? ls : lp);

            loremWordsPrintout = le.getLoremElements(howmany);

            map.put("howMany", loremWordsPrintout);
            map.put("howManyInt", howmany);
            map.put("inputDisplayNumber", inputtype);

            return "printout";

        }
    }