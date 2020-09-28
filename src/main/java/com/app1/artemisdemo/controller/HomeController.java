package com.app1.artemisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app1.artemisdemo.common.DispatcherService;

@RestController
public class HomeController {

    @Autowired
    DispatcherService dispatcherService;

    @PostMapping(value = "/send")
    public ResponseEntity<String> send(@RequestBody String message){
        dispatcherService.sendMessage(message);
        return new ResponseEntity<>("Message sent: " + message, HttpStatus.OK);
    }
    
    @GetMapping(value = "/ui")
    public String ui(){
        dispatcherService.sendMessage("Hello Artemis!!!");
        return "Hello Artemis!!!";
    }
}