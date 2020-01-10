package com.thoughtworks.version02;

public class FizzBuzz {


    public String fizzBuzz(int target) {

        return Strategy.getResult(target);
    }

}

class Strategy {
    static boolean isFizz;
    static boolean isBuzz;
    static boolean isWhizz;

    public static String getResult(int target) {
        isFizz = target % 3 == 0;
        isBuzz = target % 5 == 0;
        isWhizz = target % 7 == 0;
        boolean contains3 = Integer.toString(target).contains("3");
        if (contains3) isFizz = true;
        return isBuzz || isFizz || isWhizz ? getResult(): Integer.toString(target);
    }

    private static String getResult() {
        StringBuilder result = new StringBuilder();
        if (isFizz) result.append(Result.Fizz.name());
        if (isBuzz) result.append(Result.Buzz.name());
        if (isWhizz) result.append(Result.Whizz.name());
        return result.toString();
    }
}

enum Result {
    Fizz, Buzz, Whizz
}
