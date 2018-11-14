package com.example.Zschedulars.SimpleSchedulars;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {


    @RequestMapping("/exam")
    @Scheduled(cron = " */10 * * * * *")
    public void exam() {
        String message = "bhanu";
        System.out.println("\n" + "received::" + message);


    }
}
