package test.com.rookie.test;

import main.demo01.com.rookie.behavior.fly.impl.FlyRocketPowered;
import main.demo01.com.rookie.duck.MallardDuck;
import main.demo01.com.rookie.duck.ModelDuck;
import main.demo01.com.rookie.pojo.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.preformFly();

        Duck duck = new ModelDuck();
        duck.display();
        duck.performQuack();
        duck.preformFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.preformFly();
    }
}
