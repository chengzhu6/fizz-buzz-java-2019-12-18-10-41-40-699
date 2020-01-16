package com.thoughtworks.version05;

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
    public void get_fizz_buzz_whizz_combination_when_digital_is_multiples_of_3_5_7() {
        String actual = fizzBuzz.fizzBuzz(21);
        String excepted = "FizzWhizz";
        assertEquals(excepted, actual);
    }
}
