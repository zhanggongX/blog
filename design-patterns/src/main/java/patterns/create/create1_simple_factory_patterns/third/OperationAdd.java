package patterns.create.create1_simple_factory_patterns.third;

/**
 * 加法运算
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class OperationAdd implements Operation {

    /**
     * 根据入参计算相加的结果并返回
     * <p>
     *
     * @param firstNum  第一个值
     * @param secondNum 第二个值
     * @return 加在一起的结果
     * @author: 张弓
     * @date: 2018/7/28
     * @version: 1.0.0
     */
    @Override
    public double getResult(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
}