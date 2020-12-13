package com.example.monitorserver.dao;

import com.example.monitorserver.entity.Mem;
import com.example.monitorserver.entity.Net;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface NetDao {


    public void insert(Net net);

    @Select("select * from mem where  time>=#{startTime} and time<#{endTime}")
    public List<Net> select(String ip, String startTime, String endTime);

}
