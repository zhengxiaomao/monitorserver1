package com.example.monitorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableAsync
public class MonitorserverApplication {

//    @PostConstruct
//    void started(){
//        TimeZone.setDefault(TimeZone.getTimeZone("CST"));
//    }
    public static void main(String[] args) {
        SpringApplication.run(MonitorserverApplication.class, args);
    }

}
