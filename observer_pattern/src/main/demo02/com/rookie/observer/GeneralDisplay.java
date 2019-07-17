package main.demo02.com.rookie.observer;

import main.demo01.com.rookie.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {
    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void display() {

    }
}
