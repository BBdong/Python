package com.it.service;

import com.it.dao.T1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class T1Service {

    @Autowired
    private T1Dao t1Dao;

    public String t1(){
        String str = t1Dao.select();
        return str;
    }
}
