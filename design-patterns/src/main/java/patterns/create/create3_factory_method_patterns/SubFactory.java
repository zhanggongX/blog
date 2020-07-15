package patterns.create.create3_factory_method_patterns;

import patterns.create.create1_simple_factory_patterns.third.Operation;
import patterns.create.create1_simple_factory_patterns.third.OperationSub;

/**
 * 减法工厂
 * <p>
 * @author: 张弓
 * @date: 2018/8/8
 * @version: 1.0.0
 */
public class SubFactory implements Factory {
    /**
     * 创建减法计算类
     * <p>
     *
     * @return Operation
     * @author: 张弓
     * @date: 2018/8/8
     * @version: 1.0.0
     */
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
