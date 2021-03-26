package org.example;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class MutationExampleTest {
    MutationExample mutationExample;
    @Before
    public void before(){
         mutationExample=new MutationExample();
    }
    @Test
    void should_return_positive_when_use_number_greater_than_0() {
         mutationExample=new MutationExample();
        String positive = mutationExample.function(1);
        assertEquals(positive,"message 1");
    }

    @Test
    void should_return_positive_when_use_number_0() {
        mutationExample=new MutationExample();
        String positive = mutationExample.function(0);
        assertEquals(positive,"message 1");
    }

    @Test
    void should_return_negative_when_use_number_smaller_than_0() {
         mutationExample=new MutationExample();
        String negative = mutationExample.function(-1);
        assertEquals(negative,"message 2");
    }

}
