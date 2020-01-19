package com.thoughtworks.version06;

import java.util.Optional;

public interface Rule {

    void strategy(Result result, Integer digital);

    Rule appendNextRule(Rule nextRule);
}
