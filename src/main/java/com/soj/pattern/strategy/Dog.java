package com.soj.pattern.strategy;

public class Dog extends Animal{
    public Dog() {
        super();
        setSound("Bark");
        setFlyAbilities(new CannotFly());
    }
}
