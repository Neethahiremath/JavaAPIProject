package com.sample.service.api;

import com.google.inject.Inject;
import com.sample.service.db.RoleEntity;
import com.sample.service.service.RoleService;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Neetha Hiremath
 */
@Path("/roles")
@Api(value = "Get Roles")
public class RoleResource {

    private RoleService roleService;

    @Inject
    public RoleResource(RoleService roleService) {
        this.roleService = roleService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @UnitOfWork
    @ApiOperation(value = "Fetch the Roles")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Responded successfully")
    })
    public List<RoleEntity> getRoles() {
        return roleService.getRole();
    }
}
