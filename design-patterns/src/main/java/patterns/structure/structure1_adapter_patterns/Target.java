package patterns.structure.structure1_adapter_patterns;

/**
 * 需要适配的对象
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class Target {

    /**
     * 需要适配的方法
     * <p>
     *
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    public void specificRequest() {
        System.out.println("特殊的请求");
    }
}
