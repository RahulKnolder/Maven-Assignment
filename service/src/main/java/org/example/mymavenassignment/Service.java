package org.example.mymavenassignment;


import org.springframework.stereotype.Component;

@Component
public class Service {

    public String getStatement ()
    {
        return "Hello, I am Service class.";
    }
}