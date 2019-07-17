package main.demo01.com.rookie.subject;

import main.demo01.com.rookie.observer.Observer;

/**
 * 主题接口
 */
public interface Subject {
    /**
     * @param o 观察者变量
     * @discraption 用来注册观察者
     *
     */
    void registerObserver(Observer o);

    /**
     * @param o 观察者变量
     * 用来删除观察者
     */
    void removeObserver(Observer o);

    /**
     * 当主题状态改变,才方法被调用,以通知所有的观察者
     */
    void notifyObservers();

}
