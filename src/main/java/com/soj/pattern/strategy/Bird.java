package com.soj.pattern.strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        setFlyAbilities(new ItFly());
    }
}
