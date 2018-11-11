package tech.zg.patterns.structure.structure4_composite_patterns;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 人力资源部
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class HrDepartment extends Company {

    private List<Company> childrenCompany = new ArrayList<>();

    public HrDepartment(String name) {
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
        System.out.println(name + "招聘-培训员工。");
    }
}
