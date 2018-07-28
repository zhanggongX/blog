package tech.zg.patterns.create.create1_simple_factory_patterns.third;

import java.util.Scanner;

/**
 * 使用简单工厂模式的计算器。</br>
 * 在这里只需要根据操作符号通过工厂拿到相应的计算类然后进行相应的计算即可
 * 如果要增加计算法方式，也只需要再增加一个Operation的子类即可
 * <p>
 *
 * @author: 张弓
 * @date: 2018/7/28
 * @version: 1.0.0
 */
public class CalcThird {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();
        // 只是例子，操作符数字不做校验了。

        Operation operation = OperationFactory.createOperation(operate);
        double result = operation.getResult(Double.valueOf(firstNum), Double.valueOf(secondNum));

        System.out.println("计算结果为: " + result);
    }
}