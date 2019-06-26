package com.wusiq.serviceconsumer.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cloud-service-provider")
public interface UserRemote {

    @GetMapping("/{userId}/userName")
    String getUserName(@PathVariable Integer userId);

    @GetMapping("/time")
    String getTime();
}
