package patterns.create.create1_simple_factory_patterns.third;

/**
 * 减法运算
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class OperationSub implements Operation {

    /**
     * 根据入参计算相减的结果并返回
     * <p>
     *
     * @param firstNum  第一个值
     * @param secondNum 第二个值
     * @return 相减后的结果
     * @author: 张弓
     * @date: 2018/7/28
     * @version: 1.0.0
     */
    @Override
    public double getResult(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
}