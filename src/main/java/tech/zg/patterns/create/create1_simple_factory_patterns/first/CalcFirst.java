package tech.zg.patterns.create.create1_simple_factory_patterns.first;

import java.util.Scanner;

/**
 * 一个完全按照面向过程的计算器
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class CalcFirst {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();
        // 只是例子，操作符数字不做校验了。

        String result = "";
        switch (operate) {
            case "+":
                result = String.valueOf(Double.valueOf(firstNum) + Double.valueOf(secondNum));
                break;
            case "-":
                result = String.valueOf(Double.valueOf(firstNum) - Double.valueOf(secondNum));
                break;
            case "*":
                result = String.valueOf(Double.valueOf(firstNum) * Double.valueOf(secondNum));
                break;
            case "/":
                if (Double.valueOf(secondNum) != 0) {
                    result = String.valueOf(Double.valueOf(firstNum) / Double.valueOf(secondNum));
                }else {
                    System.out.println("除数不能为0");
                }
                break;

        }

        System.out.println("计算结果为: " + result);

    }
}