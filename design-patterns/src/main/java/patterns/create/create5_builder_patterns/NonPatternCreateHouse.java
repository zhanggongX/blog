package patterns.create.create5_builder_patterns;

/**
 * 无模式建造房子
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/22
 * @version: 1.0.0
 */
public class NonPatternCreateHouse {

    /**
     * 我写这个例子的时候，真的忘记装门了。。。
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public House houseBuilder() {

        House house = new House();

        house.addParts("打地基");
        house.addParts("建四面墙");
        house.addParts("装上门");
        //house.addParts("装上窗户");
        house.addParts("盖好房顶");

        return house;
    }
}
