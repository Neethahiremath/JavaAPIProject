package com.sample.service.dto;

/**
 * Created by VT65 on 11/28/2017.
 */
public interface NamedEnum {

    String name();

    default String getName() {
        return name();
    }
}
