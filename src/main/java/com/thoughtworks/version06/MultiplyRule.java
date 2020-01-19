package com.thoughtworks.version06;

public class MultiplyRule extends Rule {

    @Override
    public void rule(Result result, Integer digital) {
        result.setFizz(digital % 3 == 0);
        result.setBuzz(digital % 5 == 0);
        result.setWhizz(digital % 7 == 0);
    }

    @Override
    public boolean ruleIsWork(Integer digital) {
        return true;
    }
}
