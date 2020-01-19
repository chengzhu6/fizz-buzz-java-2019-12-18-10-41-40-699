package com.thoughtworks.version06;

public class Contains5Rule extends Rule {

    @Override
    public void rule(Result result, Integer digital) {
        result.setFizz(false);
    }


    protected boolean ruleIsWork(Integer digital) {
        boolean contains5 = digital.toString().contains("5");
        boolean contains7 = digital.toString().contains("7");
        return contains5 && !contains7;
    }
}
