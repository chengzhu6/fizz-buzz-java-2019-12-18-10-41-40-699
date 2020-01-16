package com.thoughtworks.version04;

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

    @Test
    public void get_fizz_and_buzz_whizz_combination_when_digital_is_multiples_of_3_5_7() {
        String actual = fizzBuzz.fizzBuzz(21);
        String excepted = "FizzWhizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void just_get_fizz_when_digital_contains_of_3() {
        String actual = fizzBuzz.fizzBuzz(30);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }
}
