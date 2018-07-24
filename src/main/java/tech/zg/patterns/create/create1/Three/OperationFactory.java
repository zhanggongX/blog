package tech.zg.patterns.create.create1.Three;

/**
* 简单工厂方法，根据不同的操作类型，返回不同的实体类。
 * 如果是再Spring框架中，则直接使用getBean获取不同的实例即可，前提是要再Spring中注入了Bean
* <p>
* @author ：zhanggong
* @version : 1.0.0
* @date ：2018/7/18
*/
public class OperationFactory {

    public static AbstractOperation createOperation(String operate) {

        AbstractOperation abstractOperation = null;

        switch (operate) {
            case "+":
                abstractOperation = new OperationAdd();
                break;
            case "-":
                abstractOperation = new OperationSub();
                break;
        }

        return abstractOperation;
    }
}