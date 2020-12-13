package com.example.monitorserver.controller;

import com.example.monitorserver.service.query;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("query")
public class QueryNet {

    @Resource
    query query;

    @RequestMapping(value = "/{ip}/metrics/net/{startTime}/{endTime}",method = RequestMethod.GET)
    @ResponseBody
    public Map queryMem(@PathVariable String ip, @PathVariable String startTime, @PathVariable String endTime){

        return query.queryNet(ip,startTime,endTime);

    }

}
