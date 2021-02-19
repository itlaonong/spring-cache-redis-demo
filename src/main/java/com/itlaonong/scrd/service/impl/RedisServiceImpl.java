package com.itlaonong.scrd.service.impl;

import com.itlaonong.scrd.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RedisServiceImpl implements RedisService {
    @Cacheable(cacheNames = "product")
    public String test(String code) {
        log.info("test code = {}",code);
        return code;
    }
}
