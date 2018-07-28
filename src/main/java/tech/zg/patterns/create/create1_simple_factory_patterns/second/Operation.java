package tech.zg.patterns.create.create1_simple_factory_patterns.second;

/**
* 计算类，根据入参数字和符号，计算出结果。</br>
* 如果要增加其他的计算方式，则要在这个类里边添加，可能会影响到其他的计算方式。违背单一职责，开闭原则。
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