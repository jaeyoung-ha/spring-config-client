package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class StaticConfigService {

    @Value("${who.am.i}")
    private String identity;

    @GetMapping("/test")
    public String test() {
        return identity;
    }

    @GetMapping("/hjy")
    public void test111() {
        System.out.println("HJY Test");
    }
}
