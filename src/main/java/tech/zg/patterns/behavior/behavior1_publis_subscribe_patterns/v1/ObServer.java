package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v1;

/**
 * 订阅者抽象接口
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public abstract class ObServer {

    /**
     * 接收到消息后更新状态
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    public abstract void updateState();
}
