package tech.zg.patterns.create.create1.third;

/**
 * 加法运算
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
}