package com.wusiq.serviceconsumer.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider")
public interface UserRemote {

    @GetMapping("/cloud-service-provider/{userId}/userName")
    String getUserName(@PathVariable Integer userId);

    @GetMapping("/cloud-service-provider/time")
    String getTime();
}
