package main.demo01.com.rookie.duck;


import main.demo01.com.rookie.behavior.fly.impl.FlyWithWings;
import main.demo01.com.rookie.behavior.quack.impl.Quack;
import main.demo01.com.rookie.pojo.Duck;

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
