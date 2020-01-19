package com.thoughtworks.version06;

public abstract class Rule {

    private Rule nextRule;

    protected abstract void rule(Result result, Integer digital);

    protected abstract boolean ruleIsWork(Integer digital);

    public Rule appendNextRule(Rule nextRule) {
        return this.nextRule = nextRule;
    }

    public void strategy(Result result, Integer digital) {
        if (ruleIsWork(digital)) {
            rule(result, digital);
        }
        if (nextRule != null) {
            nextRule.strategy(result, digital);
        }
    }

}
