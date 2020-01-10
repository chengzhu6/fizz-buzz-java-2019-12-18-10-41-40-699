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
        String actual = fizzBuzz.game(3);
        String excepted = "Fizz";
        assertEquals(excepted, actual);
    }

    @Test
    public void should_return_buzz_when_digital_is_multiples_of_5() {
        String actual = fizzBuzz.game(5);
        String excepted = "Buzz";
        assertEquals(excepted, actual);
    }
}
