package com.clovercloud.repository;

import com.clovercloud.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Integer> {

//    Log addLog(Log log);
//    Log getLog(int id);
//    List<Log> getAllLogs();
//    void updateLog(Log log);
//    List<Log> findAllLogsByEmployeeId(Integer id);

}
