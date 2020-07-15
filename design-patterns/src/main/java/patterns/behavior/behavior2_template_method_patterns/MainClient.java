package patterns.behavior.behavior2_template_method_patterns;

/**
 * 模板方法模式测试主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {

        AbstractTemplate template1 = new ConcreteTemplate1();
        AbstractTemplate template2 = new ConcreteTemplate2();

        // 这里直接执行模板方法，模板方法会根据不同的具体类，调用具体的方法。
        template1.templateMethod();
        System.out.println();
        template2.templateMethod();

        /**
         * doSomething1
         I Am ConcreteTemplate1 DoSomething2
         doSomething3

         doSomething1
         I Am ConcreteTemplate2 DoSomething2
         doSomething3
         */
    }
}
