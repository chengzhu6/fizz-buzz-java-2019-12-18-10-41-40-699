package com.thoughtworks.version03;

public class FizzBuzz {

    private boolean isFizz;
    private boolean isBuzz;
    private boolean isWhizz;

    public String fizzBuzz(int target) {
        isFizz = isFizz(target);
        isBuzz = isBuzz(target);
        isWhizz = isWhizz(target);

        return (isFizz || isBuzz || isWhizz) ? resultToString() : Integer.toString(target);
    }

    private String resultToString() {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append("Fizz");
        if (isBuzz) result.append("Buzz");
        if (isWhizz) result.append("Whizz");
        return result.toString();
    }

    private boolean isFizz(int target) {
        return target % 3 == 0 || Integer.toString(target).contains("3");
    }

    private boolean isBuzz(int target) {
        return target % 5 == 0;
    }

    private boolean isWhizz(int target) {
        return target % 7 == 0;
    }

}
