package main.com.rookie.duck;


import main.com.rookie.behavior.fly.impl.FlyWithWings;
import main.com.rookie.behavior.quack.impl.Quack;
import main.com.rookie.pojo.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("I'm a rool Marrard dauk");
    }
}
