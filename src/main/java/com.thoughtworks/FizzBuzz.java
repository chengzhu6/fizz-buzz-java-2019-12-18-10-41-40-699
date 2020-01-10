package com.thoughtworks;

public class FizzBuzz {

    public String game(int target) {
        Digital digital = new Digital();
        if (digital.is3Multiples(target)) {
            return "Fizz";
        } else {
            return Integer.toString(target);
        }
    }
}
