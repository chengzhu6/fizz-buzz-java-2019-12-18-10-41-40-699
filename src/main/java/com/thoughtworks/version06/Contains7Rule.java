package com.thoughtworks.version06;

public class Contains7Rule extends Rule {

    @Override
    public void rule(Result result, Integer digital) {
        result.setBuzz(false);
    }


    @Override
    protected boolean ruleIsWork(Integer digital) {
        return digital.toString().contains("7");
    }
}
