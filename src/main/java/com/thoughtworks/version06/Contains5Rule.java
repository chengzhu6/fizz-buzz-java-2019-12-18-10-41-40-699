package com.thoughtworks.version06;

public class Contains5Rule implements Rule{

    private Rule nextRule;

    @Override
    public void strategy(Result result, Integer digital) {
        boolean contains5 = digital.toString().contains("5");
        if (contains5) {
            result.setFizz(false);
        }
    }

    @Override
    public Rule appendNextRule(Rule nextRule) {
        return this.nextRule = nextRule;
    }
}
