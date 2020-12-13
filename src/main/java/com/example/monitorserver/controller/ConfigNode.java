package com.example.monitorserver.controller;


import com.example.monitorserver.service.config;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add/")
public class ConfigNode {



    @RequestMapping(value = "/{ip}/{port}",method = RequestMethod.GET)
    @ResponseBody
    public String addNode(@PathVariable String ip,@PathVariable int port){
        config.hm.put(ip,port);
        return "添加成功";
    }

}
