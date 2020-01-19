package com.thoughtworks.version06;

public class Contains7Rule implements Rule{
    private Rule nextRule;

    @Override
    public void strategy(Result result, Integer digital) {
        boolean contains7 = digital.toString().contains("7");
        if (contains7) {
            result.setBuzz(false);
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
