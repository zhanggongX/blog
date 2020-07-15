package patterns.behavior.behavior1_publis_subscribe_patterns.v1;

/**
 * 具体的订阅者
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public class ConcreteObServer extends ObServer {

    private String name;
    private ConcreteSubject concreteSubject;

    /**
     * 创建一个具体的观察者的时候，要明确具体的发布者
     * <p>
     *
     * @param name
     * @param concreteSubject
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    public ConcreteObServer(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    /**
     * 接收到消息后更新状态
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    @Override
    public void updateState() {
        System.out.println("观察者" + name + "新状态是" + concreteSubject.getSubjectState());
    }

}
