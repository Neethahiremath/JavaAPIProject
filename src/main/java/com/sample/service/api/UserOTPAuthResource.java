package com.sample.service.api;

import com.google.inject.Inject;
import com.sample.service.service.SendSmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/userAuth/")
@Api(value = "SendSMS")
public class UserOTPAuthResource {

   private SendSmsService sendSmsService;

    @Inject
    public UserOTPAuthResource(SendSmsService sendSmsService) {
        this.sendSmsService = sendSmsService;
    }

    @GET
    @Path("/sendSMS")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get SMS")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Responded Successfully")
    })
    public String getResponse()

    {
        return sendSmsService.sendSms();
    }
}
