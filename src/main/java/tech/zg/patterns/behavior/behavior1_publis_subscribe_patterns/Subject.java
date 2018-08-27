package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 发布者抽象类，主题
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public abstract class Subject {

    /**
     * 订阅者列表
     */
    private List<ObServer> observerList = new ArrayList<>();

    /**
     * 增加订阅者
     * <p>
     *
     * @param observer
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    public void attach(ObServer observer) {
        observerList.add(observer);
    }

    /**
     * 移除订阅者
     * <p>
     *
     * @param observer
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    public void detach(ObServer observer) {
        observerList.remove(observer);
    }

    /**
     * 消息通知
     * <p>
     *
     * @author: 张弓
     * @date: 2018/8/25
     * @version: 1.0.0
     */
    public void notifyMsg() {
        if (!StringUtils.isEmpty(observerList)) {
            for (ObServer observer : observerList) {
                observer.updateState();
            }
        }
    }
}
