package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns;

/**
 * 观察者主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.setSubjectState("AAA");

        concreteSubject.attach(new ConcreteObServer( "X", concreteSubject));
        concreteSubject.attach(new ConcreteObServer( "Y", concreteSubject));

        concreteSubject.notifyMsg();
    }
}
