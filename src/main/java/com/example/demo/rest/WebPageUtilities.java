package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller for simple services that can be invoked from the web page.
 */
@RestController
@RequestMapping("/Test")
public class WebPageUtilities {

    final String ADD = "+";
    final String SUBTRACT = "-";
    final String MULTIPLY = "*";
    final String DIVIDE = "/";

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName", defaultValue="World") String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value="x", defaultValue="0") int x,
                           @RequestParam(value="y", defaultValue = "0") int y,
                            @RequestParam(value="operator", defaultValue = "ADD") String operator){
        int result = 0;

        switch(operator){
            case ADD:
                result = x + y;
                break;
            case SUBTRACT:
                result = x - y;
                break;
            case MULTIPLY:
                result = x * y;
                break;
            case DIVIDE:
                if(y == 0)
                    return "You can't divide by zero!";
                result = x / y;
                break;
        }

        return String.format("%d %s %d = %d", x, operator, y, result);
    }

    @GetMapping("/wordCounter")
    public String wordCounter(@RequestParam(value="sentence", defaultValue="") String sentence){
        String[] words = sentence.split(" ");
        String feedback = words.length > 1 ? "%d words" : "%d word";
        return String.format(feedback, words.length);
    }

}
