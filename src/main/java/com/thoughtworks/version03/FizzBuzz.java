package com.thoughtworks.version03;

public class FizzBuzz {

    private boolean isFizz;
    private boolean isBuzz;
    private boolean isWhizz;

    public String fizzBuzz(int digital) {
        isFizz = isFizz(digital);
        isBuzz = isBuzz(digital);
        isWhizz = isWhizz(digital);

        return (isFizz || isBuzz || isWhizz) ? resultToString() : Integer.toString(digital);
    }

    private String resultToString() {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append("Fizz");
        if (isBuzz) result.append("Buzz");
        if (isWhizz) result.append("Whizz");
        return result.toString();
    }

    private boolean isFizz(int digital) {
        return digital % 3 == 0 || isContains(digital, 3);
    }

    private boolean isBuzz(int digital) {
        return digital % 5 == 0 && !isContains(digital, 3);
    }

    private boolean isWhizz(int digital) {
        return digital % 7 == 0 && !isContains(digital, 3);
    }

    private boolean isContains(int digital, int target) {
        return Integer.toString(digital).contains(Integer.toString(target));
    }


}
