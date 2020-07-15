package patterns.create.create6_prototype_patterns;

/**
 * 具体的原型类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/13
 * @version: 1.0.0
 */
public class ConcreteProtoType extends ProtoType {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    public ConcreteProtoType clone() throws CloneNotSupportedException {
        return (ConcreteProtoType) super.clone();
    }
}
