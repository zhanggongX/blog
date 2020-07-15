package patterns.structure.structure7_facade_patterns;

/**
 * 外观模式测试主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {

        Facade facade = new Facade(new SubSystemOne(), new SubSystemTwo(), new SubSystemThree());
        facade.methodA();
        facade.methodB();

        /**
         * method one
         * method two
         * method two
         * method three
         */
    }
}
