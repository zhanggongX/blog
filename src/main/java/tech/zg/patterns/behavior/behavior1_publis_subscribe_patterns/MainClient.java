package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns;

import tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v1.ConcreteObServer;
import tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v1.ConcreteSubject;

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

    }
}
