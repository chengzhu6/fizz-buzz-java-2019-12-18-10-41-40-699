package com.thoughtworks.version02;

public class FizzBuzz {
    boolean isFizz;
    boolean isBuzz;
    boolean isWhizz;
    enum Result {
        Fizz, Buzz, Whizz
    }

    public String fizzBuzz(int target) {
        isFizz = target % 3 == 0;
        isBuzz = target % 5 == 0;
        isWhizz = target % 7 == 0;
        boolean contains3 = Integer.toString(target).contains("3");
        boolean contains5 = Integer.toString(target).contains("5");
        boolean contains7 = Integer.toString(target).contains("7");
        if (!contains5 && contains3) {
            isFizz = true;
            isBuzz = false;
            isWhizz = false;
        }
        if (!contains7 && contains5) isFizz = false;
        if (contains7) isBuzz = false;
        return (isBuzz || isFizz || isWhizz) ? resultToString(): Integer.toString(target);
    }

    private String resultToString() {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append(Result.Fizz.name());
        if (isBuzz) result.append(Result.Buzz.name());
        if (isWhizz) result.append(Result.Whizz.name());
        return result.toString();
    }
}
