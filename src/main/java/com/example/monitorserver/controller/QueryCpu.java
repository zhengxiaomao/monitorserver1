package com.example.monitorserver.controller;

import com.example.monitorserver.service.query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/query/")
public class QueryCpu {

    @Resource
    query query;

}
