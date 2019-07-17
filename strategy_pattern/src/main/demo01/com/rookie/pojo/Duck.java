package main.demo01.com.rookie.pojo;

import main.demo01.com.rookie.behavior.fly.FlyBehavior;
import main.demo01.com.rookie.behavior.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void preformFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
