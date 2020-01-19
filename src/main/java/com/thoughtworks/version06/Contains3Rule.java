package com.thoughtworks.version06;

public class Contains3Rule implements Rule{
    private Rule nextRule;

    @Override
    public void strategy(Result result, Integer digital) {
        boolean contains3 = digital.toString().contains("3");
        boolean contains5 = digital.toString().contains("5");
        if (contains3 && !contains5) {
            result.setFizz(true);
            result.setBuzz(false);
            result.setWhizz(false);
        }
    }

    @Override
    public Rule appendNextRule(Rule nextRule) {
        return this.nextRule = nextRule;
    }
}
