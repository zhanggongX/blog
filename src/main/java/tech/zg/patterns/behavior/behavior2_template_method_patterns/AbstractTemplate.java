package tech.zg.patterns.behavior.behavior2_template_method_patterns;

/**
 * 模板类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    public void templateMethod() {

        // 多个类通用的方法1
        doSomething1();
        // 多个类不同的实现方法2
        doSomething2();
        // 多个类通用的方法3
        doSomething3();
    }

    /**
     * 多个类不同的实现方法2
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    protected abstract void doSomething2();

    /**
     * 多个类通用的方法1
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    private void doSomething1() {
        System.out.println("doSomething1");
    }

    /**
     * 多个类通用的方法3
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    private void doSomething3() {
        System.out.println("doSomething3");
    }
}
