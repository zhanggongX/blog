package tech.zg.patterns.create.create1.Three;

import java.util.Scanner;

public class CalcThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();
        // 只是例子，操作符数字不做校验了。

        AbstractOperation operation = OperationFactory.createOperation(operate);
        double result = operation.getResult(Double.valueOf(firstNum), Double.valueOf(secondNum));

        System.out.println("计算结果为: " + result);
    }
}