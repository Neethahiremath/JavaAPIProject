package com.sample.service.JavaPrograms;

import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class FindTheWordFromFileTest {

    @InjectMocks
    private
    FindTheWordFromFile target = spy(new FindTheWordFromFile());
    private String input;

    @Before
    public void setUp() {
        input = "port";
    }

    @Test
    public void test_createInitialMap_success() throws CustomException {

        Map<Character, Integer> result = target.createInitialMap(input);
        assertThat(result.containsKey('p'), is(true));
    }

    @Test(expected = CustomException.class)
    public void test_createInitialMap_throw_exception() throws CustomException {
        target.createInitialMap(null);
    }
}
