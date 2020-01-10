package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalTest {

    Digital digital;

    @Before
    public void setUp() throws Exception {
        digital = new Digital();
    }

    @Test
    public void should_return_true_when_digital_is_multiples_of_3() {
        boolean actual = digital.is3Multiples(3);
        assertTrue(actual);
    }

    @Test
    public void should_return_true_when_digital_is_multiples_of_5() {
        boolean actual = digital.is5Multiples(5);
        assertTrue(actual);
    }

    @Test
    public void should_return_true_when_digital_is_multiples_of_7() {
        boolean actual = digital.is7Multiples(7);
        assertTrue(actual);
    }

    @Test
    public void should_return_true_when_digital_not_is_multiples_of_3_or_5_or_7() {
        boolean actual = digital.is3Or5Or7Multiples(4);
        assertFalse(actual);
    }
}
