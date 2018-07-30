package tech.zg.patterns.structure.structure2_decorator_patterns;

/**
 * 一个具体的对象，继承Component，实现Component的方法。
 * <p>
 * @author: 张弓
 * @date: 2018/7/30
 * @version: 1.0.0
 */
public class ConcreteComponent extends Component{

    /**
     * 一些具体的操作。
     * <p>
     *
     * @author: 张弓
     * @date: 2018/7/30
     * @version: 1.0.0
     */
    @Override
    public void someOperation() {

        System.out.println("具体的操作!");
    }
}
