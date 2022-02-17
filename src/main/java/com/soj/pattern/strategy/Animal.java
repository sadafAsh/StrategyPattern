package com.soj.pattern.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {
    static final Logger logger = LogManager.getLogger(Animal.class.getName());
    private String name;
    private String sound;
    private int weight;
    private double speed;
    private double height;
    private String favFood;
    private Fly flyTypes;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String newSound) {
        this.sound = newSound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight>0) {
            this.weight = newWeight;
        }else {
            logger.debug("Weight must be more than 0");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String newFavFood) {
        this.favFood = newFavFood;
    }

    public String  tryToFly(){
        return flyTypes.fly();
    }

    public void setFlyAbilities(Fly newFlyTypes){
      flyTypes=  newFlyTypes;
    }
}
