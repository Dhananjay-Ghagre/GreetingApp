package com.Greet.Greeting.App.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting() {
        return "Hello World";
    }

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        }
        return "Hello World";
    }
}
