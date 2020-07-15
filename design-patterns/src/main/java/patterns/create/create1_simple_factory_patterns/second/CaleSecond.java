package patterns.create.create1_simple_factory_patterns.second;

import java.util.Scanner;

/**
 * 更改成面向对象的程序，把计算类抽象出去。
 * <p>
 *
 * @author ：zhanggong
 * @version : 1.0.0
 * @date ：2018/7/18
 */
public class CaleSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        String firstNum = scanner.nextLine();
        System.out.println("请输入操作符（+、-、*、/）：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String secondNum = scanner.nextLine();

        // 只是例子，这里操作符数字不做校验了。

        String result = String.valueOf(Operation.getResult(Double.valueOf(firstNum), Double.valueOf(secondNum), operate));

        System.out.println("计算结果为: " + result);
    }
}