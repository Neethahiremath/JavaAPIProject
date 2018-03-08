package com.sample.service;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.hibernate.ScanningHibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

/**
 * @author Neetha Hiremath
 */
public class SampleApplication extends Application<SampleConfiguration> {

    public static void main(String[] args) throws Exception {
        new SampleApplication().run(args);
    }

    private final HibernateBundle<SampleConfiguration> hibernateBundle = new ScanningHibernateBundle<SampleConfiguration>(
            "com.sample.service.db"
    ) {

        @Override
        public PooledDataSourceFactory getDataSourceFactory(SampleConfiguration configuration) {
            return configuration.getSampleDataBase();
        }
    };

    private SampleModule sampleModule;

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {

    SwaggerBundle<SampleConfiguration> swaggerBundle=new  SwaggerBundle<SampleConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(SampleConfiguration configuration) {
                return configuration.getSwaggerBundleConfiguration();
            }
        };

        GuiceBundle<SampleConfiguration> guiceBundle = GuiceBundle.<SampleConfiguration>newBuilder()
                .setConfigClass(SampleConfiguration.class)
                .addModule(sampleModule = new SampleModule())
                .build();
        bootstrap.addBundle(hibernateBundle);
        bootstrap.addBundle(guiceBundle);
        bootstrap.addBundle(swaggerBundle);
    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {

        environment.jersey().packages(getClass().getPackage().getName() + ".api");
        sampleModule.setSessionFactory(hibernateBundle.getSessionFactory());
        sampleModule.setHibernateBundle(hibernateBundle);
    }
}
