package com.ls;

import org.springframework.stereotype.Component;

/**
 * Created by pkls on 2018-04-26.
 */
@Component
public class SchedualServiceHystric implements SchedualServiceHi {
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
