package com.it.service;

import com.it.dao.IT1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T1Service {

    @Autowired
    private IT1Dao t1Dao;

    public String t1(){
        String str = t1Dao.selectUser();
        return str;
    }
}
