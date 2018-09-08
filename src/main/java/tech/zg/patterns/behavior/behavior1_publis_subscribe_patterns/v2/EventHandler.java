package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件载体类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/8
 * @version: 1.0.0
 */
public class EventHandler {

    /**
     * 所有事件
     */
    private List<Event> objects;

    public EventHandler() {
        this.objects = new ArrayList<Event>();
    }

    /**
     * 添加事件
     * <p>
     *
     * @param event
     * @author: 张弓
     * @date: 2018/9/8
     * @version: 1.0.0
     */
    public void addEvent(Event event) {
        objects.add(event);
    }

    /**
     * 通知事件
     * <p>
     *
     * @author: 张弓
     * @date: 2018/9/8
     * @version: 1.0.0
     */
    public void notifyUpdate() throws Exception {
        for (Event event : objects) {
            event.invoke();
        }
    }
}
