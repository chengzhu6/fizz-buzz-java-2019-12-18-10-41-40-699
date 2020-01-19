package com.thoughtworks.version06;

public class Result {

    private boolean fizz;
    private boolean buzz;
    private boolean whizz;

    public boolean isFizz() {
        return fizz;
    }

    public void setFizz(boolean fizz) {
        this.fizz = fizz;
    }

    public boolean isBuzz() {
        return buzz;
    }

    public void setBuzz(boolean buzz) {
        this.buzz = buzz;
    }

    public boolean isWhizz() {
        return whizz;
    }

    public void setWhizz(boolean whizz) {
        this.whizz = whizz;
    }

    public boolean isNumber() {
        return fizz || buzz || whizz;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        if (fizz) resultString.append("Fizz");
        if (buzz) resultString.append("Buzz");
        if (whizz) resultString.append("Whizz");
        return resultString.toString();
    }
}
