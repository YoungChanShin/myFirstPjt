package org.example.myFirstPjt.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index2Controller {
    @GetMapping("/")
    public String index(){

        return "index";
    }
}
