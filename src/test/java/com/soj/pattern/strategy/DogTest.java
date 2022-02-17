package com.soj.pattern.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

@Test
    void testForDogSound(){
    Animal dog=new Dog();
    dog.setSound("Bark");
    Assertions.assertEquals("Bark",dog.getSound());
}
    @Test
    void testForDogFly(){
        Animal dog=new Dog();
        Fly cannotFly=new CannotFly();
        dog.setFlyAbilities(cannotFly);
        Assertions.assertEquals("I can't fly",dog.tryToFly());
    }
}