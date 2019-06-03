package com.wusiq.serviceconsumer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRemote userRemote;

    @GetMapping(value = "/{userId}/userName")
    public String getUserName(@PathVariable Integer userId) {
        return userRemote.getUserName(userId);
    }

    @GetMapping(value = "time")
    public String getTime() {
        return userRemote.getTime();
    }
}
