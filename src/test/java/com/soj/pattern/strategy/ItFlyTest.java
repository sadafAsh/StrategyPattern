package com.soj.pattern.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItFlyTest {

    @Test
    void testToFlyHigh() {
        Fly flies=new ItFly();
        String  result="Flying High";
        Assertions.assertEquals(result,flies.fly());
    }
}