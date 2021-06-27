package com.clover.edgeservice.controller;

import com.clover.edgeservice.model.Log;
import com.clover.edgeservice.util.feign.CloverCrudServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    CloverCrudServiceClient logFeignClient;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Log createLog(@RequestBody Log log)  {
        System.out.println("Used this edge service to create a log.");
        return logFeignClient.makeANewLogInTheCrudService(log);
    }

    @GetMapping("/log")
    @ResponseStatus(HttpStatus.OK)
    public List<Log> getAllLogs(){
        System.out.println("Used this edge service to get all logs.");
        return logFeignClient.getAllLogsInTheCrudService();
    }

    @GetMapping(value="/{logId}")
    @ResponseStatus(HttpStatus.OK)
    public Log getOneLog(@PathVariable Integer logId) {
        System.out.println("Used this edge service to get one log by id");
        return logFeignClient.getAllLogsInTheCrudService().get(logId);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateLog(@RequestBody Log log) {
        System.out.println("Used this edge service to update log by id.");
        updateLog(log);
    }


}