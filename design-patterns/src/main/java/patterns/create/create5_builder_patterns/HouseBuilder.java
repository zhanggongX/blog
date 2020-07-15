package patterns.create.create5_builder_patterns;

/**
 * 房子构建者，这个接口只是起到稳定建造过程的作用
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/22
 * @version: 1.0.0
 */
public interface HouseBuilder {

    /**
     * 获取建造的房子
     * <p>
     *
     * @return House
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract House getHouse();

    /**
     * 建造地基
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract void buildBase();

    /**
     * 建造墙，至于要建几面墙，具体的实现类，具体去实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract void buildWall();

    /**
     * 建造门，同理建造几个门，自己具体实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract void buildDoor();

    /**
     * 建造窗户，同理建造几个窗户，自己具体实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract void buildWindow();

    /**
     * 建造屋顶
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public abstract void buildRoof();
}
