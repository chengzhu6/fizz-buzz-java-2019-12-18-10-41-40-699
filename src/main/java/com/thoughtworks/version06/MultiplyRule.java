package com.thoughtworks.version06;

public class MultiplyRule implements Rule {
    private Rule nextRule;

    @Override
    public void strategy(Result result, Integer digital) {
        result.setFizz(digital % 3 == 0);
        result.setBuzz(digital % 5 == 0);
        result.setWhizz(digital % 7 == 0);
        if (nextRule != null) {
            nextRule.strategy(result, digital);
        }
    }

    @Override
    public Rule appendNextRule(Rule nextRule) {
        return this.nextRule = nextRule;
    }
}
