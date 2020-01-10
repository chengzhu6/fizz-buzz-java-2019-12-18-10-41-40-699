package com.thoughtworks;

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
    public void should_return_fizz_when_digital_is_multiples_of_3() {
        String actual = fizzBuzz.game(9);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_return_buzz_when_digital_is_multiples_of_5() {
        String actual = fizzBuzz.game(10);
        String excepted = "Buzz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_return_whizz_when_digital_is_multiples_of_7() {
        String actual = fizzBuzz.game(14);
        String excepted = "Whizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_return_combination_when_digital_is_multiples_of_3_5_7() {
        String actual = fizzBuzz.game(21);
        String excepted = "FizzWhizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_return_fizz_when_digital_contains_3() {
        String actual = fizzBuzz.game(13);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_only_return_fizz_when_digital_contains_3() {
        String actual = fizzBuzz.game(30);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }
}
