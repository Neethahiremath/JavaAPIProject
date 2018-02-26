package com.sample.service;

import com.google.inject.AbstractModule;
import io.dropwizard.hibernate.HibernateBundle;
import com.google.inject.Provides;
import org.hibernate.SessionFactory;

/**
 * @author Neetha Hiremath
 */
public class SampleModule extends AbstractModule {

    private SessionFactory sessionFactory;
    private HibernateBundle<SampleConfiguration> hibernateBundle;

    @Provides
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Provides
    public HibernateBundle<SampleConfiguration> getHibernateBundle() {
        return hibernateBundle;
    }

    public void setHibernateBundle(HibernateBundle<SampleConfiguration> hibernateBundle) {
        this.hibernateBundle = hibernateBundle;
    }

    @Override
    protected void configure() {

    }
}
