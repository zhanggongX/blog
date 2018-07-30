package tech.zg.patterns.structure.structure2_decorator_patterns;

/**
 * 具体的装饰类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/7/30
 * @version: 1.0.0
 */
public class ConcreteDecorator2 extends Decorator{

    /**
     * 这个方法代之一些操作
     * <p>
     *
     * @author: 张弓
     * @date: 2018/7/30
     * @version: 1.0.0
     */
    @Override
    public void someOperation() {
        System.out.println("装饰类2pre---");
        super.someOperation();
        System.out.println("装饰类2after---");
    }
}
