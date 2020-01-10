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
            if (digital.isContains3(target)) {
                result = new StringBuffer(result.toString().replace("Buzz", ""));
                result = new StringBuffer(result.toString().replace("Whizz", ""));
            }
        } else {
            if (digital.isContains3(target)) {
                result.append("Fizz");
            } else {
                result.append(target);
            }
        }
        return result.toString();
    }
}
