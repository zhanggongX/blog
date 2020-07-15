package patterns.structure.structure4_composite_patterns;

/**
 * 财务部
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
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
    @Override
    public void add(Company component) {

    }

    /**
     * 移除子节点
     * <p>
     *
     * @param component
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public void remove(Company component) {

    }

    /**
     * 显示子节点
     * <p>
     *
     * @param depth
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public void display(int depth) {
        String depthStr = "";
        for (int i = 0; i < depth; i++) {
            depthStr += "-";
        }
        System.out.println(depthStr + name);
    }

    /**
     * 干活
     * <p>
     *
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public void doSomething() {
        System.out.println(name + "公司财务收支管理");
    }
}
