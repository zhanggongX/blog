package patterns.create.create3_factory_method_patterns;

import patterns.create.create1_simple_factory_patterns.third.Operation;

/**
 * 工厂接口
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/8
 * @version: 1.0.0
 */
public interface Factory {

    /**
     * 创建算法类
     * <p>
     *
     * @return Operation
     * @author: 张弓
     * @date: 2018/8/8
     * @version: 1.0.0
     */
    Operation createOperation();
}
