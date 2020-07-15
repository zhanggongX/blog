package patterns.behavior.behavior1_publis_subscribe_patterns;

import patterns.behavior.behavior1_publis_subscribe_patterns.v1.ConcreteObServer;
import patterns.behavior.behavior1_publis_subscribe_patterns.v1.ConcreteSubject;
import patterns.behavior.behavior1_publis_subscribe_patterns.v2.*;

/**
 * 观察者模式主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {

        // 简单的观察者模式
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.setSubjectState("AAA");

        concreteSubject.attach(new ConcreteObServer( "X", concreteSubject));
        concreteSubject.attach(new ConcreteObServer( "Y", concreteSubject));

        concreteSubject.notifyMsg();

        // 观察者模式进阶，委托模式
        Notifier notifierOne = new ConcreteNotifierOne();
        notifierOne.addListener(new ListenerOne(), "doSomeThingOne", "吃饭");
        notifierOne.addListener(new ListenerTwo(), "doSomeThingTwo", "睡觉", 1);
        notifierOne.notifyUpdate();

        Notifier notifierTwo = new ConcreteNotifierTwo();
        notifierTwo.addListener(new ListenerOne(), "doSomeThingOne", "立刻吃饭");
        notifierTwo.addListener(new ListenerTwo(), "doSomeThingTwo", "睡觉", 2);
        notifierTwo.notifyUpdate();

        /*1。各个具体的通知者完全不知道观察者的存在，完全解耦。（当然，功劳归功于Event和EventHandler，且这两个类具有通用性）
          2。一次通知，执行了不同类的不同方法
          3。扩展性很高，再来一个观察者三，并在测试代码中告诉通知者一下就好，通知者完全没有变。重用性好
          4。各个观察者之间没有任何关系，它们接收通知的方法也完全不一样。
        */
    }
}
