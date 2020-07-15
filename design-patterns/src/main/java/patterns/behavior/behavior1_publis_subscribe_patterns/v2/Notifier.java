package patterns.behavior.behavior1_publis_subscribe_patterns.v2;

/**
 * 通知者
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/8
 * @version: 1.0.0
 */
public abstract class Notifier {

    /**
     * 通知者，持有委托时间句柄
     */
    protected EventHandler eventHandler;

    public Notifier() {
        this.eventHandler = new EventHandler();
    }

    /**
     * 增加监听者
     * <p>
     *
     * @param object
     * @param methodName
     * @param args
     * @author: 张弓
     * @date: 2018/9/8
     * @version: 1.0.0
     */
    public void addListener(Object object, String methodName, Object... args) {
        Event event = new Event(object, methodName, args);
        eventHandler.addEvent(event);
    }

    /**
     * 通知，具体的通知，由具体的通知者实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/9/8
     * @version: 1.0.0
     */
    public abstract void notifyUpdate();
}
