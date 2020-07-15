package patterns.structure.structure6_proxy_patterns;

/**
 * 装饰类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/4
 * @version: 1.0.0
 */
public class Decorator implements Subject{

    private Subject subject;

    public Decorator(Subject subject) {
        this.subject = subject;
    }

    /**
     * 被代理的方法，做某事儿
     * <p>
     *
     * @return void
     * @author: 张弓
     * @date: 2018/8/4
     * @version: 1.0.0
     */
    @Override
    public void doSomeThing() {
        System.out.println("Decorator do some thing pre !");
        subject.doSomeThing();
        System.out.println("Decorator do some thing after !");
    }
}
