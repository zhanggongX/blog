package tech.zg.patterns.behavior.behavior9_strategy;

import java.util.Scanner;

/**
* 策略模式 测试类
* <p>
* @author ：zhanggong
* @version : 1.0.0
* @date ：2018/7/24
*/
public class Calc {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();
        // 只是例子，操作符数字不做校验了。

        OperationContext operationContext = new OperationContext(operate);
        double result = operationContext.getResult(Double.valueOf(firstNum), Double.valueOf(secondNum));

        System.out.println("计算结果为: " + result);
    }

}