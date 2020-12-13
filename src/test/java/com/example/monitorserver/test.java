package com.example.monitorserver;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class test {

    @Test
    public void show(){
        Map map = new HashMap();
        map.put("s",2);
        map.put("ff",3);
        map.put("ffe",4);
        System.out.println(map.size());
    }
}
