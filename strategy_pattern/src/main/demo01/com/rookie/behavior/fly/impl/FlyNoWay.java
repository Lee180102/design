package main.demo01.com.rookie.behavior.fly.impl;

import main.demo01.com.rookie.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
