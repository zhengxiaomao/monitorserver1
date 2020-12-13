package com.example.monitorserver.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Cpu<T> {

    T time;
    T ip;
    T contextSwitches;
    T interrupts;
    T idle;
    T steal;
    T irq;
    T softirq;
    T iowait;
    T sys;
    T user;
    T nice;


}
