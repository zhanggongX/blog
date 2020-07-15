package patterns.structure.structure1_adapter_patterns;

/**
 * 适配器模式
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {
        Adapter adapter = new ConcreteAdapter();
        adapter.request();
    }
}
