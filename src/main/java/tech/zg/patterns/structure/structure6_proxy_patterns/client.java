package tech.zg.patterns.structure.structure6_proxy_patterns;

/**
 * 代理模式测试类，并详细介绍了代理模式和装饰模式的区别。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/1
 * @version: 1.0.0
 */
public class client {

    public static void main(String[] args) {

        Proxy proxy = new Proxy();
        proxy.doSomeThing();

        /*
          proxy do some thing pre !
          do some thing!
          proxy do some thing after !
        */


        Subject subject = new RealSubject();
        Decorator decorator = new Decorator(subject);
        decorator.doSomeThing();
        /*
          Decorator do some thing pre !
          do some thing!
          Decorator do some thing after !
        */

        /**
         * 如上，就是代理模式和装饰模式的两段代码。
         * 我们用代理模式的时候，并不知道代理类具体代理了什么。
         * 而我们使用装饰模式的时候，我们把要装饰的类，传给了装饰者类，我们知道要装饰的是那个类。
         *
         * 这就是这两个模式的最根本的区别，一个是装饰，增加一些功能，一个是代理，要控制一个类。
         */
    }
}
