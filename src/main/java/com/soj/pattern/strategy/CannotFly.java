package com.soj.pattern.strategy;

public class CannotFly implements Fly {
    @Override
    public String fly() {
        return "I can't fly";
    }
}
