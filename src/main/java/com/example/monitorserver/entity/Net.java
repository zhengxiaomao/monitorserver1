package com.example.monitorserver.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Data
public class Net<T> {



    T id;
    T sentPackets;
    T receivePackets;
    T receiveBytes;
    T sentBytes;
    T receivePacketsErrors;
    T sentPacketsErrors;
    T macAddr;
    T netCardName;
    T ip;
    T time;

}
