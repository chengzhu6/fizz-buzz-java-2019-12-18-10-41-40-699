package com.thoughtworks.version06;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {


    FizzBuzz fizzBuzz;

    @Test
    public void should_get_fizz_buzz_whizz_combination_when_digital_is_multiples_of_3_5_7() {
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

    @Test
    public void not_get_fizz_when_digital_contains_of_5() {
        String actual = fizzBuzz.fizzBuzz(35);
        String excepted = "BuzzWhizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void not_buzz_when_digital_contains_of_7() {
        String actual = fizzBuzz.fizzBuzz(75);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }
}
