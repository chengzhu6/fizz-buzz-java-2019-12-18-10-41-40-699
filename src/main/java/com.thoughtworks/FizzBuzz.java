package com.thoughtworks;

public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 121; i++) {
            String result = fizzBuzz.game(i);
            System.out.println(result);
        }
    }


    public String game(int target) {
        Digital digital = new Digital();
        StringBuilder result = new StringBuilder();
        if (digital.is3Or5Or7Multiples(target)) {
            if (digital.isContains7(target)) {
                if (digital.isContains3(target)) {
                    getResult(result, digital.is3Multiples(target), "Fizz");
                } else {
                    getResult(result, digital.is3Multiples(target), "Fizz");
                    getResult(result, digital.is7Multiples(target), "Whizz");
                    getResult(result, result.length() == 0, Integer.toString(target));
                }
            } else {
                if (digital.isContains5(target)) {
                    getResult(result, digital.is5Multiples(target), "Buzz");
                    getResult(result, digital.is7Multiples(target), "Whizz");
                    getResult(result, result.length() == 0, Integer.toString(target));
                } else if (digital.isContains3(target)) {
                    getResult(result, digital.is3Multiples(target), "Fizz");
                } else {
                    getResult(result, digital.is3Multiples(target), "Fizz");
                    getResult(result, digital.is5Multiples(target), "Buzz");
                    getResult(result, digital.is7Multiples(target), "Whizz");
                }
            }
        } else {
            if (digital.isContains5(target)) {
                result.append(target);
            } else {
                if (digital.isContains3(target)) {
                    result.append("Fizz");
                } else {
                    result.append(target);
                }
            }
        }
        return result.toString();
    }

    private void getResult(StringBuilder result, boolean isAppend, String appendString) {
        if (isAppend) result.append(appendString);
    }
}
