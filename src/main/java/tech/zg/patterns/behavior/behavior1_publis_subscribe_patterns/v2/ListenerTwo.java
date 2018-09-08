package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v2;

/**
 * 监听者2号
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/8
 * @version: 1.0.0
 */
public class ListenerTwo {

    public void doSomeThingTwo(String arg1, Integer arg2) {
        System.out.println("接收到通知：" + arg1 + arg2 + "个小时， 我要去睡觉了");
    }
}
