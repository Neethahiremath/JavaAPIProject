package com.sample.service.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by VT65 on 11/28/2017.
 */

@JsonSerialize(using = IdNamedEnumSerialiser.class)
public interface IdNamedEnum extends NamedEnum {
    String getId();
}
