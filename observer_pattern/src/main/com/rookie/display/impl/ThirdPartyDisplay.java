package main.com.rookie.display.impl;

import main.com.rookie.display.DisplayElement;
import main.com.rookie.observer.Observer;

/**
 * 开发人员可以通过时间观察者和显示接口来创建自己的布告板
 */
public class ThirdPartyDisplay implements DisplayElement, Observer {

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
