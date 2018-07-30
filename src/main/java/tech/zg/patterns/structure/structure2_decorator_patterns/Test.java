package tech.zg.patterns.structure.structure2_decorator_patterns;

/**
 * 测试类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/7/30
 * @version: 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();
        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();

        concreteDecorator1.setComponent(concreteComponent);
        concreteDecorator2.setComponent(concreteDecorator1);
        concreteDecorator2.someOperation();

        /*
          输出的内容为:

            装饰类2pre---
            装饰类1pre---
            具体的操作!
            装饰类1after---
            装饰类2after---
         */
    }
}
