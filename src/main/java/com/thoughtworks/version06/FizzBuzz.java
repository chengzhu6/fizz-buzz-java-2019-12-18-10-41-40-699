package com.thoughtworks.version06;

public class FizzBuzz {
    public String fizzBuzz(Integer digital) {
        Result result = new Result();
        result.setFizz(digital % 3 == 0);
        result.setBuzz(digital % 5 == 0);
        result.setWhizz(digital % 7 == 0);
        return result.isNumber() ? result.toString() : digital.toString();
    }
}
