package com.thoughtworks.version06;

public class FizzBuzz {
    public String fizzBuzz(Integer digital) {
        Result result = new Result();
        Rule rule = new MultiplyRule();
        rule.appendNextRule(new Contains3Rule())
                .appendNextRule(new Contains5Rule())
                .appendNextRule(new Contains7Rule());
        rule.strategy(result, digital);
        return result.isNumber() ? result.toString() : digital.toString();
    }
}
