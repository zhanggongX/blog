package tech.zg.patterns.structure.structure6_proxy_patterns;

/**
 * 被代理的具体类
 * <p>
 * @author: 张弓
 * @date: 2018/8/4
 * @version: 1.0.0
 */
public class RealSubject implements Subject{

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
        System.out.println("do some thing!");
    }
}
