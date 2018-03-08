package com.sample.service.JavaPrograms;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import static org.mockito.Mockito.spy;

public class StreamAPIJavaExamplesTest {

    @Mock
   private StreamAPIJava8Examples target = spy(new StreamAPIJava8Examples());

    @Test
    public void test_getOptionalExample() {

        Integer output = target.getOptionalExample(12);

        assertThat(output,is(12));

    }
    @Test
    public void test_getOptionalExample_when_null_input() {

        Integer output = target.getOptionalExample(null);

        assertThat(output,is(0));

    }

}
