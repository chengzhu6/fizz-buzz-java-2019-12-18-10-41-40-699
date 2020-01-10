package com.thoughtworks;

public class FizzBuzz {

    public String game(int target) {
        Digital digital = new Digital();
        if (digital.is3Multiples(target)) {
            return "Fizz";
        } else if (digital.is5Multiples(target)) {
            return "Buzz";
        }
        return Integer.toString(target);
    }
}
