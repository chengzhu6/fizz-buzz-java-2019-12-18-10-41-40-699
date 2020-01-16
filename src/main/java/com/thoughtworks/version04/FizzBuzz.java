package com.thoughtworks.version04;

public class FizzBuzz {
    public String fizzBuzz(Integer digital) {
        boolean isFizz = digital % 3 == 0;
        boolean isBuzz = digital % 5 == 0;
        boolean isWhizz = digital % 7 == 0;
        boolean contains3 = digital.toString().contains("3");
        boolean contains5 = digital.toString().contains("5");
        boolean contains7 = digital.toString().contains("7");
        if (contains3 && !contains5) {
            isFizz = true;
            isBuzz = false;
            isWhizz = false;
        }
        if (contains5 && !contains7) {
            isFizz = false;
        }
        if (contains7) {
            isBuzz = false;
        }
        return isFizz || isFizz || isWhizz ? resultToString(isFizz, isBuzz, isWhizz) : digital.toString();
    }

    private String resultToString(boolean isFizz, boolean isBuzz, boolean isWhizz) {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append("Fizz");
        if (isBuzz) result.append("Buzz");
        if (isWhizz) result.append("Whizz");
        return result.toString();
    }
}
