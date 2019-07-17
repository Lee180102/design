package main.demo01.com.rookie.duck;

import main.demo01.com.rookie.behavior.fly.impl.FlyNoWay;
import main.demo01.com.rookie.behavior.quack.impl.Quack;
import main.demo01.com.rookie.pojo.Duck;

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
