package com.sample.service.service;

import com.google.inject.Inject;
import com.sample.service.db.RoleDao;
import com.sample.service.db.RoleEntity;

import java.util.List;

/**
 * @author Neetha Hiremath
 */
public class RoleService {

    private RoleDao roleDao;

    @Inject
    public RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<RoleEntity> getRole() {
        return roleDao.getRoles();
    }
}
