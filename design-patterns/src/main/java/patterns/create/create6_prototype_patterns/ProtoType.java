package patterns.create.create6_prototype_patterns;

/**
 * 原型类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public abstract class ProtoType implements Cloneable {

    private String name;

    /**
     * 克隆自身的方法
     * <p>
     *
     * @return ProtoType
     * @author: 张弓
     * @date: 2018/8/13
     * @version: 1.0.0
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
