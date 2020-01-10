package com.thoughtworks.version03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void get_fizz_when_digital_is_multiples_of_3() {
        String actual = fizzBuzz.fizzBuzz(9);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }
}
