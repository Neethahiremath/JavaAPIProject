package com.sample.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author Neetha Hiremath
 */
public class SampleConfiguration extends Configuration {

    @Valid
    @NotNull
    @JsonProperty("sampleDataBase")
    private DataSourceFactory sampleDataBase = new DataSourceFactory();

    @JsonProperty("swagger")
    private SwaggerBundleConfiguration swaggerBundleConfiguration;

    public SwaggerBundleConfiguration getSwaggerBundleConfiguration() {
        return swaggerBundleConfiguration;
    }

    public DataSourceFactory getSampleDataBase() {
        return sampleDataBase;
    }

}
