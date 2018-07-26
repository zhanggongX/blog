package tech.zg.patterns.behavior.behavior9_strategy_patterns;


import tech.zg.patterns.create.create1_simple_factory_patterns.third.Operation;
import tech.zg.patterns.create.create1_simple_factory_patterns.third.OperationFactory;

/**
* 策略模式上下文，调用本类接口，本类再调用具体的算法实现。
* <p>
* @author ：zhanggong
* @version : 1.0.0
* @date ：2018/7/24
*/
public class OperationContext {

    private Operation operation;

    public OperationContext(String operate) {

        operation = OperationFactory.createOperation(operate);
    }

    public double getResult(double firstNum, double secondNum){
        return operation.getResult(firstNum, secondNum);
    }
}