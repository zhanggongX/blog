package patterns.create.create1_simple_factory_patterns.third;

/**
 * 运算类接口
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public interface Operation {

    /**
     * 根据入参计算结果并返回
     * <p>
     *
     * @param firstNum  第一个值
     * @param secondNum 第二个值
     * @return 计算结果
     * @author: 张弓
     * @date: 2018/7/28
     * @version: 1.0.0
     */
    double getResult(double firstNum, double secondNum);
}