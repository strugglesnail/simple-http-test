package org.example.controller;


import org.example.mapper.TestUrlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestUrlMapper testUrlMapper;


    @GetMapping("/url")
    public Object test() {
        Map<String, Object> test =  testUrlMapper.test(new HashMap<>());
        return test;
    }


}
