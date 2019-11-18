package controllers;

import Sevice.DictionaryIpm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryServlet {
    @Autowired
    DictionaryIpm dictionary;

    @GetMapping("/dictionary")
    public String displayDictionary() {
        return "displayDictionary";
    }

    @GetMapping("/translate")
    public String translate(@RequestParam String eng, Model model) {
        String result = dictionary.translate(eng);
        model.addAttribute("eng", eng);
        model.addAttribute("viet", result);
        return "displayDictionary";
    }
}
