package com.soj.pattern.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {
    @Test
    void testForBirdSound(){
        Animal dog=new Bird();
        dog.setSound("Tweet");
        Assertions.assertEquals("Tweet",dog.getSound());
    }
    @Test
    void testForBirdFly(){
        Animal dog=new Bird();
        Fly itCanFly=new ItFly();
        dog.setFlyAbilities(itCanFly);
        Assertions.assertEquals("Flying High",dog.tryToFly());
    }
}