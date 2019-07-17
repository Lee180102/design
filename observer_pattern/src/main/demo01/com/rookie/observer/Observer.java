package main.demo01.com.rookie.observer;

/**
 * 所有的气象组建都是实现此观察者接口,这样主题在需要通知观察者时,有了一个共同的接口.
 */
public interface Observer {
   /**
    *
    */
   void update(float temp, float humidity, float pressure);
}
