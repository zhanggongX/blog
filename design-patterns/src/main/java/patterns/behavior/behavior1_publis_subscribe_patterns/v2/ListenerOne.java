package patterns.behavior.behavior1_publis_subscribe_patterns.v2;

/**
 * 监听者1号
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/8
 * @version: 1.0.0
 */
public class ListenerOne {

    public void doSomeThingOne(String arg) {
        System.out.println("接收到通知：" + arg + "， 我要去吃饭了");
    }
}
