package tech.zg.patterns.create.create1.third;

/**
 * 运算类的抽象类，所有运算的父类
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public interface Operation {

    public abstract double getResult(double firstNum, double secondNum);
}