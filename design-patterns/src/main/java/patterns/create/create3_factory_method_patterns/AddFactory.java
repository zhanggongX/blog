package patterns.create.create3_factory_method_patterns;

import patterns.create.create1_simple_factory_patterns.third.Operation;
import patterns.create.create1_simple_factory_patterns.third.OperationAdd;

/**
 * 加法工厂
 * <p>
 * @author: 张弓
 * @date: 2018/8/8
 * @version: 1.0.0
 */
public class AddFactory implements Factory{

    /**
     * 创建加法计算类
     * <p>
     *
     * @return Operation
     * @author: 张弓
     * @date: 2018/8/8
     * @version: 1.0.0
     */
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
