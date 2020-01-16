package com.thoughtworks.version05;

public class FizzBuzz {
    public String fizzBuzz(Integer digital) {
        boolean isFizz = digital % 3 == 0;
        boolean isBuzz = digital % 5 == 0;
        boolean isWhizz = digital % 7 == 0;
        return isFizz || isBuzz || isWhizz ? resultToString(isFizz, isBuzz, isWhizz) : digital.toString();
    }

    private String resultToString(boolean isFizz, boolean isBuzz, boolean isWhizz) {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append("Fizz");
        if (isBuzz) result.append("Buzz");
        if (isWhizz) result.append("Whizz");
        return result.toString();
    }
}
