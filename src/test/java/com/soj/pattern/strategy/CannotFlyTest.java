package com.soj.pattern.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CannotFlyTest {

    @Test
    void testToCannotFly() {
        Fly flies=new CannotFly();
        String  result="I can't fly";
        Assertions.assertEquals(result,flies.fly());
}}