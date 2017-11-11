package varun.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;
import varun.springframework.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String  hello() {

        return greetingService.sayGreeting();
    }
}
