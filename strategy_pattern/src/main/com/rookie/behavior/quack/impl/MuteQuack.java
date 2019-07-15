package main.com.rookie.behavior.quack.impl;

import main.com.rookie.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
