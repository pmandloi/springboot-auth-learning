package com.practice.auth.resource;

import com.practice.auth.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @PostMapping("/save")
    public String save(@RequestParam String key, @RequestParam String value) {
        redisService.saveData(key, value);
        return "Saved " + key + " -> " + value;
    }

    @GetMapping("/get")
    public String get(@RequestParam String key) {
        String value = redisService.getData(key);
        return value != null ? "Value: " + value : "No value found for key: " + key;
    }
}

