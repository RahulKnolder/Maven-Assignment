package org.example.mymavenassignment.webApp_controller;

import org.example.mymavenassignment.webApp_services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {

    @Autowired
    private MessageService messageService;

    @GetMapping("webapp")
    public String getMessage() {
        return messageService.getMessage();
    }
}
