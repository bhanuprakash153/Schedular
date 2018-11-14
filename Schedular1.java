package com.example.Zschedulars.SimpleSchedulars;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController

public class Schedular1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Schedular1.class);

    private static final DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("HH:mm:ss");

/*
    @Scheduled(fixedRate = 2000)
    public void schedulefixedRate() throws InterruptedException {

        LOGGER.info("excution task:" + dateTime.format(LocalDateTime.now()));
        TimeUnit.SECONDS.sleep(5);


    }*/


    // @RequestMapping("/rest")
    // @Scheduled(cron = "*/10 * * * * *")
    // public void rest() {

    //   LOGGER.info("result:" + dateTime.format(LocalDateTime.now()));

    // }

    /*@RequestMapping("/abc")
    @Scheduled(cron = "0 39 21 * * MON", zone = "Asia/Calcutta")
    public void abc() {

        LOGGER.info("result for exact time" + dateTime.format(LocalDateTime.now()));
    }*/


    @RequestMapping("/time")
    @Scheduled(cron = "0 40-46 15 * * ?", zone = "Asia/Calcutta")
    public void time() {

        System.out.println("execution time started :" + dateTime.format(LocalDateTime.now()));

    }



}
