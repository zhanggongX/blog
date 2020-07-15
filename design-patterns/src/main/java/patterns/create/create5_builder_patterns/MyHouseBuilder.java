package patterns.create.create5_builder_patterns;

/**
 * 我的房子的建造者类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/22
 * @version: 1.0.0
 */
public class MyHouseBuilder implements HouseBuilder {

    private House house = new House();

    /**
     * 获取建造的房子
     * <p>
     *
     * @return House
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public House getHouse() {
        return house;
    }

    /**
     * 建造地基
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public void buildBase() {
        house.addParts("打地基");
    }

    /**
     * 建造墙，至于要建几面墙，具体的实现类，具体去实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public void buildWall() {
        house.addParts("建四面墙");
    }

    /**
     * 建造门，同理建造几个门，自己具体实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public void buildDoor() {
        house.addParts("装上一个门");
    }

    /**
     * 建造窗户，同理建造几个窗户，自己具体实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public void buildWindow() {
        house.addParts("装上两个窗");
    }

    /**
     * 建造屋顶
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    @Override
    public void buildRoof() {
        house.addParts("装上屋顶");
    }
}
