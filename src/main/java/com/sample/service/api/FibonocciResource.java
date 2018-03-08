package com.sample.service.api;

import com.google.inject.Inject;
import com.sample.service.service.FibonocciService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class FibonocciResource {

    @Inject
    FibonocciService fibonocciService;

    FibonocciResource(FibonocciService fibonocciService) {
        this.fibonocciService = fibonocciService;
    }

    @GET
    @Path("/fibonocci")
    @Produces(MediaType.APPLICATION_JSON)
    public String getFibonocciSeries(@QueryParam("value") Integer value) {
        return fibonocciService.getSeriesData(value);
    }
}
