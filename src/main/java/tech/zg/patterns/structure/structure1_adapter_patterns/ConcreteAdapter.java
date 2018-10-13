package tech.zg.patterns.structure.structure1_adapter_patterns;

/**
 * 具体的适配器
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class ConcreteAdapter implements Adapter {

    private Target target = new Target();

    /**
     * 适配器提供的普通的请求
     * <p>
     *
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    @Override
    public void request() {
        System.out.println("适配器准备去请求特殊的接口");
        target.specificRequest();
        System.out.println("适配器请求特殊的接口成功");
    }
}
