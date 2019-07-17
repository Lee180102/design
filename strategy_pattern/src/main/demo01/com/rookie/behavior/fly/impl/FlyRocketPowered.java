package main.demo01.com.rookie.behavior.fly.impl;

import main.demo01.com.rookie.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket !");
    }
}
