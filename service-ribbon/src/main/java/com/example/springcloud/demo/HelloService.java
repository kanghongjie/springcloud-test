package com.example.springcloud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName: HelloService
 * @Description: TODO(负载均衡)
 * @author khj
 * @date 2018年4月11日
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-SUPPLIER/hi?name="+name,String.class);
    }

}
