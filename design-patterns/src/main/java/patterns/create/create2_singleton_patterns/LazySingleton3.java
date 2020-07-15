package patterns.create.create2_singleton_patterns;

/**
 * 懒汉式【假线程安全，不推荐】
 * <p>
 * 由于LazySingleton2同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。
 * 但是这种同步并不能起到线程同步的作用。跟HungrySingleton2实现方式遇到的情形一致，
 * 假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 *
 * @author: 张弓
 * @date: 2018/11/13
 * @version: 1.0.0
 */
public class LazySingleton3 {

    private static LazySingleton3 lazySingleton3;

    /**
     * 私有构造函数
     */
    private LazySingleton3() {
    }

    public static LazySingleton3 getInstance() {
        if (lazySingleton3 == null) {
            synchronized (LazySingleton3.class) {
                lazySingleton3 = new LazySingleton3();
            }
        }
        return lazySingleton3;
    }
}
