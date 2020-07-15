package patterns.structure.structure7_facade_patterns;

/**
 * 外观模式类，提供一组简单的接口调用各个复杂的模块
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/15
 * @version: 1.0.0
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade(SubSystemOne subSystemOne, SubSystemTwo subSystemTwo, SubSystemThree subSystemThree) {
        this.subSystemOne = subSystemOne;
        this.subSystemTwo = subSystemTwo;
        this.subSystemThree = subSystemThree;
    }

    /**
     * 外观模式的方法A，外部类调用这一个方法，就会实际上访问了一组方法。
     * 例子中的方法较少，体现不出来优势。
     * 如果一个流程需要多个方法，就会比直接外部调用整洁了很多。
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/15
     * @version: 1.0.0
     */
    public void methodA() {
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB() {
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
