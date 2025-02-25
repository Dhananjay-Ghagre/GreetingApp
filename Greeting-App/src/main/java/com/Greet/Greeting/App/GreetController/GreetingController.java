package com.Greet.Greeting.App.GreetController;

import com.Greet.Greeting.App.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")

public class GreetingController {

    @GetMapping
    public String getGreeting(){
        return "{\"message\": \"Hello World\"}";
    }

    @PostMapping
    public String postGreeting(){
        return "{\"message\": \"Greeting Received\"}";
    }

    @PutMapping
    public String putGreeting(){
        return "{\"message\": \"Greeting Updated\"}";
    }

    @DeleteMapping
    public String deleteGreeting(){
        return "{\"message\": \"Greeting Deleted\"}";
    }

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/service")
    public String getGreetingService()
    {
        return greetingService.greeting();
    }

}
