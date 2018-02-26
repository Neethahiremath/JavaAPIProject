package com.sample.service.api;

import com.sample.service.dto.FreshDepot;
import com.sample.service.dto.GreetingResponse;
import com.sample.service.service.GreetingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Set;

/**
 * @author Neetha Hiremath
 */
@Path("/greeting")
@Api(value = "Greeting")
public class GreetingPersonResource {
    private GreetingService greetingService;

    @Inject
    public GreetingPersonResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Welcomes the person to My project")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Responded Successfully")
    })

    public GreetingResponse getWelcomeGreeting(@ApiParam(value = "Name") @PathParam("name") String name) {
        return greetingService.getGreetingMessage(name);
    }

    @GET
    @Path("/depots")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Welcomes the person to My project")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Responded Successfully")
    })
    public Set<FreshDepot> getFreshDepots() {
        return greetingService.getFreshDepotDetails();
    }
}
