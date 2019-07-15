package main.com.rookie.duck;

import main.com.rookie.behavior.fly.impl.FlyNoWay;
import main.com.rookie.behavior.quack.impl.Quack;
import main.com.rookie.pojo.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck!");
    }


}
