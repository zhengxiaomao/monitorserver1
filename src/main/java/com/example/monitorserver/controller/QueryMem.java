package com.example.monitorserver.controller;

import com.example.monitorserver.service.query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("query")
public class QueryMem {

    @Resource
    query query;


    @RequestMapping(value = "/{ip}/metrics/mem/{startTime}/{endTime}",method = RequestMethod.GET)
    @ResponseBody
    public HashMap queryMem(@PathVariable String ip,@PathVariable String startTime,@PathVariable String endTime){

        return query.queryMem(ip,startTime,endTime);

    }
}
