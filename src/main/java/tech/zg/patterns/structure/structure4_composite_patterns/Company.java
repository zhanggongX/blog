package tech.zg.patterns.structure.structure4_composite_patterns;

/**
 * 组合中公司的接口声明
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加子节点
     * <p>
     *
     * @param component
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    public abstract void add(Company component);

    /**
     * 移除子节点
     * <p>
     *
     * @param component
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    public abstract void remove(Company component);

    /**
     * 显示子节点
     * <p>
     *
     * @param depth
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    public abstract void display(int depth);

    /**
     * 干活
     * <p>
     *
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    public abstract void doSomething();
}
