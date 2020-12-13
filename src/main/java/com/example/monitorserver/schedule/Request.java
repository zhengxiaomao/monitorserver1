package com.example.monitorserver.schedule;

import com.example.monitorserver.service.grab;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Request {

    @Autowired
    grab grab;

    @Async
    public  void run(String ip,int port){
        grab.request(ip,port);
    }

}
