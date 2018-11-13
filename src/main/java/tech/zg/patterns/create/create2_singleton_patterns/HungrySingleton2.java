package tech.zg.patterns.create.create2_singleton_patterns;

/**
 * 饿汉式【生产可用】
 * <p>
 * 这种方式和HungrySingleton1类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和HungrySingleton1是一样的。
 *
 * @author: 张弓
 * @date: 2018/11/13
 * @version: 1.0.0
 */
public class HungrySingleton2 {

    private static HungrySingleton2 hungrySingleton2;

    static {
        hungrySingleton2 = new HungrySingleton2();
    }

    /**
     * 私有构造函数
     */
    private HungrySingleton2() {
    }

    public static HungrySingleton2 getInstance() {
        return hungrySingleton2;
    }
}
