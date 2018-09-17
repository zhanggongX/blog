package tech.zg.patterns.create.create4_abstract_factory.v2;

import tech.zg.patterns.create.create4_abstract_factory.v2.*;
import tech.zg.patterns.create.create4_abstract_factory.v2.ConcreteFactory2;
import tech.zg.patterns.create.create4_abstract_factory.v2.User;

/**
 * 入口类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/17
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {
        //Factory factory = new MysqlFactory();
        Factory factory = new ConcreteFactory2();
        User user = factory.createUser();
        user.showName();
    }
}
