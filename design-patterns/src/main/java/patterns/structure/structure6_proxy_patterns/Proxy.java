package patterns.structure.structure6_proxy_patterns;

/**
 * 代理类
 * <p>
 * @author: 张弓
 * @date: 2018/8/4
 * @version: 1.0.0
 */
public class Proxy implements Subject{

    private Subject subject;

    public Proxy() {
        this.subject = new RealSubject();
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
        System.out.println("proxy do some thing pre !");
        subject.doSomeThing();
        System.out.println("proxy do some thing after !");
    }
}
