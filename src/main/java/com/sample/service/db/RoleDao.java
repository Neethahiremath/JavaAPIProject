package com.sample.service.db;

import com.google.inject.Inject;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;


/**
 * @author Neetha Hiremath
 */

public class RoleDao extends AbstractDAO<RoleEntity> {


    /**
     * Creates a new DAO with a given session provider.
     *
     * @param sessionFactory
     *         a session provider
     */
    @Inject
    public RoleDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<RoleEntity> getRoles() {
        // return criteria().setProjection(Projections.property("ID")).list();
        return currentSession().createCriteria(RoleEntity.class).list();
    }
}
