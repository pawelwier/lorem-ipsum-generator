package com.example.loremipsum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoremPrintoutController {

    private LoremPrintout lpout = new LoremPrintout();

    @GetMapping("/printout")
    public String getPrintout(
            @RequestParam Integer howMany,
            @RequestParam String inputType,
            ModelMap map) {

        String inputTypePolish = (inputType.equals("words")) ? "słowa" : (inputType.equals("paragraphs") ? "paragrafy" : "zdania");

        map.put("howMany", lpout.getPrintout(howMany, inputType));
        map.put("howManyInt", howMany);
        map.put("inputDisplayNumber", inputTypePolish);

        return "printout";

    }
}
