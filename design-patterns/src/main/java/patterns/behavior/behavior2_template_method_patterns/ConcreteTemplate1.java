package patterns.behavior.behavior2_template_method_patterns;

/**
 * 具体的使用模板类1
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public class ConcreteTemplate1 extends AbstractTemplate {

    /**
     * 多个类不同的实现方法2
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    @Override
    protected void doSomething2() {
        System.out.println("I Am ConcreteTemplate1 DoSomething2");
    }
}
