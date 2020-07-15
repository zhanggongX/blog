package patterns.create.create5_builder_patterns;

/**
 * 建房子的指挥者
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/22
 * @version: 1.0.0
 */
public class HouseDirector {

    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    /**
     * 建造正常的房子
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public void build() {
        this.builder.buildBase();
        this.builder.buildWall();
        this.builder.buildDoor();
        this.builder.buildWindow();
        this.builder.buildRoof();
    }

    /**
     * 建造特殊的房子，劳资就是不要窗户
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/22
     * @version: 1.0.0
     */
    public void buildNoWindow() {
        this.builder.buildBase();
        this.builder.buildWall();
        this.builder.buildDoor();
        //this.builder.buildWindow();
        this.builder.buildRoof();
    }
}
