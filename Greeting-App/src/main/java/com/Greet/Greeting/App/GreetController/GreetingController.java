package com.Greet.Greeting.App.GreetController;

import com.Greet.Greeting.App.Model.Greeting;
import com.Greet.Greeting.App.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Autowired
    private GreetingService GreetingService;

    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName) {
        return "{\"message\": \"" + greetingService.getGreetingMessage(firstName, lastName) + "\"}";
    }

    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody String message) {
        return greetingService.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }


}
