package com.thoughtworks;

public class FizzBuzz {

    public String game(int target) {
        Digital digital = new Digital();
        StringBuilder result = new StringBuilder();
        if (digital.is3Or5Or7Multiples(target)) {
            if (digital.isContains7(target)) {
                if (digital.isContains3(target)) {
                    if (digital.is3Multiples(target)) result.append("Fizz");
                } else {
                    if (digital.is3Multiples(target)) result.append("Fizz");
                    if (digital.is7Multiples(target)) result.append("Whizz");
                }
            } else {
                if (digital.isContains5(target)) {
                    if (digital.is5Multiples(target)) result.append("Buzz");
                    if (digital.is7Multiples(target)) result.append("Whizz");
                } else if (digital.isContains3(target)) {
                    if (digital.is3Multiples(target)) result.append("Fizz");
                } else {
                    if (digital.is3Multiples(target)) result.append("Fizz");
                    if (digital.is5Multiples(target)) result.append("Buzz");
                    if (digital.is7Multiples(target)) result.append("Whizz");
                }
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
