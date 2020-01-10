package com.thoughtworks.version02;

public class FizzBuzz {


    public String fizzBuzz(int target) {
        if (target % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(target);
    }

}
