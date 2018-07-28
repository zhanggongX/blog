package tech.zg.patterns.behavior.behavior9_strategy_patterns;


import tech.zg.patterns.create.create1_simple_factory_patterns.third.Operation;
import tech.zg.patterns.create.create1_simple_factory_patterns.third.OperationFactory;

/**
 * 策略模式上下文，调用本类接口，本类再调用具体的算法实现。
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/24
 */
public class OperationContext {

    /**
     * 一系列操作的抽象类或接口
     */
    private Operation operation;

    /**
     * 构造方法，根据不同的操作类型，给上下文对象引用具体的计算方法。
     * <p>
     *
     * @param operate 操作类型
     * @author: 张弓
     * @date: 2018/7/28
     * @version: 1.0.0
     */
    public OperationContext(String operate) {

        operation = OperationFactory.createOperation(operate);
    }

    /**
     * 所有一系列算法的通用接口
     * <p>
     *
     * @param firstNum
     * @param secondNum
     * @return double
     * @author: 张弓
     * @date: 2018/7/28
     * @version: 1.0.0
     */
    public double getResult(double firstNum, double secondNum) {
        return operation.getResult(firstNum, secondNum);
    }
}