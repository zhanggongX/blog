package tech.zg.patterns.create.create6_prototype_patterns;

/**
 * 主类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/8
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) throws CloneNotSupportedException {


        ConcreteProtoType concreteProtoType = new ConcreteProtoType();
        concreteProtoType.setName("you");

        ConcreteProtoType concreteProtoType1 = concreteProtoType.clone();

        System.out.println(concreteProtoType.getName());
        System.out.println(concreteProtoType1.getName());

        /**
         * you
         * you
         *
         * */
    }
}
