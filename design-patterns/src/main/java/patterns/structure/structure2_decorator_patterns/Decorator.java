package patterns.structure.structure2_decorator_patterns;

/**
 * 装饰模式抽象类，持有一个被装饰类的对象，对于Component是不知道Decorator的存在的。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/7/30
 * @version: 1.0.0
 */
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {

        this.component = component;
    }

    /**
     * 这个方法代之一些操作
     * <p>
     *
     * @author: 张弓
     * @date: 2018/7/30
     * @version: 1.0.0
     */
    @Override
    public void someOperation() {

        if(component != null){
            component.someOperation();
        }
    }
}
