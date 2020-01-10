package com.thoughtworks;

public class Digital {
    public boolean is3Multiples(int target) {
        return target % 3 == 0;
    }

    public boolean is5Multiples(int target) {
        return target % 5 == 0;
    }

    public boolean is7Multiples(int target) {
        return target % 7 == 0;
    }

    public boolean is3Or5Or7Multiples(int target) {
        return is3Multiples(target) || is5Multiples(target) || is7Multiples(target);
    }

    public boolean isContains3(int target) {
        return Integer.toString(target).contains("3");
    }

    public boolean isContains5(int target) {
        return Integer.toString(target).contains("5");
    }

    public boolean isContains7(int target) {
        return Integer.toString(target).contains("7");
    }
}
