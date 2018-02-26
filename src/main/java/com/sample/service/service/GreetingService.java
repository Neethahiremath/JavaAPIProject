package com.sample.service.service;

import com.google.inject.Singleton;
import com.sample.service.dto.FreshDepot;
import com.sample.service.dto.GreetingResponse;

import java.util.EnumSet;
import java.util.Set;

/**
 * @author Neetha Hiremath
 */

@Singleton
public class GreetingService {


    public GreetingResponse getGreetingMessage(String name) {

        GreetingResponse greetingResponse = new GreetingResponse();
        greetingResponse.setMessage("Hello " + name);
        greetingResponse.setName(name);

        return greetingResponse;
    }


    public Set<FreshDepot> getFreshDepotDetails() {
        return EnumSet.allOf(FreshDepot.class);
    }
}
