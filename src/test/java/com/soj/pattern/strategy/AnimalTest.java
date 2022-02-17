package com.soj.pattern.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToGetName() {
        Animal animal=new Animal();
        animal.setName("Dog");
        Assertions.assertEquals("Dog",animal.getName());
    }


    @Test
    void testToGetSound() {
        Animal animal=new Animal();
        animal.setSound("Bark");
        Assertions.assertEquals("Bark",animal.getSound());
    }


    @Test
    void testToGetWeightWhichMoreThanZero() {
        Animal animal=new Animal();
        animal.setWeight(4);
        Assertions.assertEquals(4,animal.getWeight());
    }
    @Test
    void testToGetWeightWhichIsLessThanZero() {
        Animal animal=new Animal();
        animal.setWeight(-4);
        Assertions.assertEquals(0,animal.getWeight());
    }


    @Test
    void testToGetSpeed() {
        Animal animal=new Animal();
        animal.setSpeed(2.3);
        Assertions.assertEquals(2.3,animal.getSpeed());
    }

    @Test
    void testToGetHeight() {
        Animal animal=new Animal();
        animal.setHeight(3.4);
        Assertions.assertEquals(3.4,animal.getHeight());
    }
    @Test
    void testToGetFavFood() {
        Animal animal = new Animal();
        animal.setFavFood("Bones");
        Assertions.assertEquals("Bones", animal.getFavFood());
    }
    }