package com.thoughtworks;

public class FizzBuzz {

    public String game(int target) {
        Digital digital = new Digital();
        StringBuffer result = new StringBuffer();
        if (digital.is3Or5Or7Multiples(target)) {
            if (digital.is3Multiples(target)) {
                result.append("Fizz");
            }
            if (digital.is5Multiples(target)) {
                result.append("Buzz");
            }
            if (digital.is7Multiples(target)) {
                result.append("Whizz");
            }
        } else {
            result.append(target);
        }
        return result.toString();
    }
}
