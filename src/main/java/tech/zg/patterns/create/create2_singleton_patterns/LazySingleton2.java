package tech.zg.patterns.create.create2_singleton_patterns;

/**
 * 懒汉式【线程安全，生产可用，但不推荐】
 * <p>
 * 解决上面第三种实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
 * <p>
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 *
 * @author: 张弓
 * @date: 2018/11/13
 * @version: 1.0.0
 */
public class LazySingleton2 {

    private static LazySingleton2 lazySingleton2;

    /**
     * 私有构造函数
     */
    private LazySingleton2() {
    }

    /**
     * 每次访问这个方法都是同步的，但是大部分情况是不需要创建而是直接返回的，这就拉低了并发性能。
     *
     * @return
     */
    public static synchronized LazySingleton2 getInstance() {
        if (lazySingleton2 == null) {
            lazySingleton2 = new LazySingleton2();
        }
        return lazySingleton2;
    }
}
