package tech.zg.patterns.create.create1_simple_factory_patterns.third;

/**
 * 加法运算
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class OperationAdd implements Operation {

    @Override
    public double getResult(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
}