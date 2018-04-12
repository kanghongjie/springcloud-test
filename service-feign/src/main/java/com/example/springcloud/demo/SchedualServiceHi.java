package com.example.springcloud.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @ClassName: SchedualServiceHi
 * @Description: TODO(feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务)
 * @author khj
 * @date 2018年4月11日
 */
// 断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值
@FeignClient(value = "service-supplier", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
  @RequestMapping(value = "/hi", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
