package tech.zg.patterns.create.create4_abstract_factory.v1;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

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
