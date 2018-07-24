package tech.zg.patterns.create.create1_simple_factory.second;

/**
* 计算类
* <p>
* @author ：zhanggong
* @version : 1.0.0
* @date ：2018/7/18
*/
public class Operation {

    public static double getResult(double firstNum, double secondNum, String operate){

        double result = 0d;

        switch (operate) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                }else {
                    System.out.println("除数不能为0");
                    throw new RuntimeException("除数不能为0");
                }
                break;

        }
        return result;
    }
}