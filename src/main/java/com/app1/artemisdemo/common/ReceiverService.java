package com.app1.artemisdemo.common;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverService {

   
    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message){
       System.out.println("!!!!!!!Received Message!!!!!!!!!!!!!"+message);
    }
}