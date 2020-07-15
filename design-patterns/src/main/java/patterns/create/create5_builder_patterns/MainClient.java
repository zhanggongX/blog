package patterns.create.create5_builder_patterns;

/**
 * 建造者模式主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/15
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {

        // 无模式的创建房子方法，忘记装门了，另外我要是想多加窗户，多装门，多盖一堵墙。都要修改老代码
        NonPatternCreateHouse nonPatternCreateHouse = new NonPatternCreateHouse();
        House house = nonPatternCreateHouse.houseBuilder();
        house.showHouse();
        System.out.println("----------------------------------------------------------");

        // 建造者模式，创建我的房子
        HouseBuilder myHouseBuilder = new MyHouseBuilder();
        HouseDirector myHouseDirector = new HouseDirector(myHouseBuilder);
        myHouseDirector.build();
        House myHouse = myHouseBuilder.getHouse();
        myHouse.showHouse();
        System.out.println("----------------------------------------------------------");

        // 建造者模式，创建别人的房子，和创建我的房子，过程是一样的，是稳定的，但是建的房子是不一样的。
        HouseBuilder otherHouseBuilder = new OtherHouseBuilder();
        HouseDirector otherHouseDirector = new HouseDirector(otherHouseBuilder);
        otherHouseDirector.buildNoWindow();
        House otherHouse = otherHouseBuilder.getHouse();
        otherHouse.showHouse();
    }
}
