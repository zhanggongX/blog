package patterns.create.create2_singleton_patterns;

/**
 * 饿汉式【生产可用】
 * <p>
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 * @author: 张弓
 * @date: 2018/11/13
 * @version: 1.0.0
 */
public class HungrySingleton1 {

    private final static HungrySingleton1 INSTANCE = new HungrySingleton1();

    /**
     * 私有构造函数
     */
    private HungrySingleton1() {
    }

    public static HungrySingleton1 getInstance() {
        return INSTANCE;
    }
}
