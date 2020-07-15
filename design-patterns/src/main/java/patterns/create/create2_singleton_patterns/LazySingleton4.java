package patterns.create.create2_singleton_patterns;

/**
 * 懒汉式【双重检查，推荐】
 * <p>
 * Double-Check概念对于多线程开发者来说不会陌生。
 * 如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
 * 这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 * <p>
 * 优点：线程安全；延迟加载；效率较高。
 *
 * @author: 张弓
 * @date: 2018/11/13
 * @version: 1.0.0
 */
public class LazySingleton4 {

    private static LazySingleton4 lazySingleton4;

    /**
     * 私有构造函数
     */
    private LazySingleton4() {
    }

    /**
     * 如果不为空则不同步执行，如果为空的时候同步执行，并且再判断一次是否为空。
     *
     * @return
     */
    public static LazySingleton4 getInstance() {
        if (lazySingleton4 == null) {
            synchronized (LazySingleton4.class) {
                if (lazySingleton4 == null) {
                    lazySingleton4 = new LazySingleton4();
                }
            }
        }
        return lazySingleton4;
    }
}
