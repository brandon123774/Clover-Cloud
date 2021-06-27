package com.clovercloud.controller;

import com.clovercloud.model.Log;
import com.clovercloud.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/log")

public class LogController {

    @Autowired
    LogRepository logRepo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Log createLog(@RequestBody Log log)  {
        return logRepo.save(log);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Log> getAllLogs() {
        return logRepo.findAll();
    }

    @GetMapping(value="/{logId}")
    @ResponseStatus(HttpStatus.OK)
    public Log getOneLog(@PathVariable Integer logId) {
        return logRepo.getById(logId);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateLog(@RequestBody Log log) {
        logRepo.save(log);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteProject(@PathVariable Integer id){
        logRepo.deleteById(id);
    }

}
