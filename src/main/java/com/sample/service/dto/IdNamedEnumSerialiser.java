package com.sample.service.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

/**
 * Created by VT65 on 11/28/2017.
 */
public class IdNamedEnumSerialiser extends StdSerializer<IdNamedEnum> {

    protected IdNamedEnumSerialiser() {
        this(null);
    }

    protected IdNamedEnumSerialiser(Class<IdNamedEnum> t) {
        super(t);
    }

    @Override
    public void serialize(
            IdNamedEnum idNamedEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider
    ) throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("id", idNamedEnum.getId());
        jsonGenerator.writeStringField("name", idNamedEnum.getName());
        jsonGenerator.writeEndObject();
    }
}
