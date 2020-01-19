package com.thoughtworks.version06;

public class Contains5Rule implements Rule{

    private Rule nextRule;

    @Override
    public void strategy(Result result, Integer digital) {
        boolean contains5 = digital.toString().contains("5");
        boolean contains7 = digital.toString().contains("7");
        if (contains5 && !contains7) {
            result.setFizz(false);
        }
        if (nextRule != null) {
            nextRule.strategy(result, digital);
        }
    }

    @Override
    public Rule appendNextRule(Rule nextRule) {
        return this.nextRule = nextRule;
    }
}
