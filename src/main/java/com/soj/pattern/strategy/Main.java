package com.soj.pattern.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    static  final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
Animal spooky=new Dog();
String flying=spooky.tryToFly();
logger.debug("Dog :{}",flying);
spooky.setWeight(5);
logger.debug("Dog :{} ",spooky.getWeight());
logger.debug("Dog : {}",spooky.getSound());


Animal tweety=new Bird();
String flying1=tweety.tryToFly();
logger.debug("Bird : {}",flying1);
logger.debug("Bird :{} ",tweety.getSound());


    }
}
