package com.thoughtworks.version06;

public class Contains3Rule extends Rule{

    @Override
    public void rule(Result result, Integer digital) {
            result.setFizz(true);
            result.setBuzz(false);
            result.setWhizz(false);
    }

    @Override
    public boolean ruleIsWork(Integer digital) {
        boolean contains3 = digital.toString().contains("3");
        boolean contains5 = digital.toString().contains("5");
        return contains3 && !contains5;
    }
}
