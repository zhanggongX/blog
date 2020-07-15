package patterns.structure.structure4_composite_patterns;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的公司
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class ConcreteCompany extends Company {

    private List<Company> childrenCompany = new ArrayList<>();

    public ConcreteCompany(String name) {
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
        childrenCompany.add(component);
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
        childrenCompany.remove(component);
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
        if(!CollectionUtils.isEmpty(childrenCompany)){
            for(Company company : childrenCompany){
                company.display(depth + 2);
            }
        }
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
        if(!CollectionUtils.isEmpty(childrenCompany)){
            for(Company company : childrenCompany){
                company.doSomething();
            }
        }
    }
}
