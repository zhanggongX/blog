package patterns.create.create3_factory_method_patterns;

import patterns.create.create1_simple_factory_patterns.third.Operation;

import java.util.Scanner;

/**
 * 测试运行主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/8
 * @version: 1.0.0
 */
public class MainClient {

    /**
     * 加法工厂，只计算加法。
     * <p>
     *
     * @param args
     * @author: 张弓
     * @date: 2018/8/8
     * @version: 1.0.0
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        /*System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();*/
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();
        // 只是例子，操作符数字不做校验了。

        Factory factory = new AddFactory();
        Operation operation = factory.createOperation();
        double result = operation.getResult(Double.valueOf(firstNum), Double.valueOf(secondNum));

        System.out.println("计算结果为: " + result);
    }
}
