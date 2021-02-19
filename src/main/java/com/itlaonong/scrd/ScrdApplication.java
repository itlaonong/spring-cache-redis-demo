package com.itlaonong.scrd;

import com.itlaonong.scrd.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableCaching
@RestController
@SpringBootApplication
public class ScrdApplication {
    @Autowired
    private RedisService redisService;

    public static void main(String[] args) {
        SpringApplication.run(ScrdApplication.class, args);
    }

    @RequestMapping("/redis/test")
    public Map<String, Object> test(String code) {
        code = redisService.test(code);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        return result;
    }
}
