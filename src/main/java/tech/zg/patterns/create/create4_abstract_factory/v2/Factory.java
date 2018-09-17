package tech.zg.patterns.create.create4_abstract_factory.v2;

import tech.zg.patterns.create.create4_abstract_factory.v2.User;

/**
 * 抽象工厂
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/14
 * @version: 1.0.0
 */
public interface Factory {

    User createUser();
}
