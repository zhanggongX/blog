package tech.zg.patterns.behavior.behavior1_publis_subscribe_patterns.v2;

/**
 * 具体的通知者
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/8
 * @version: 1.0.0
 */
public class ConcreteNotifierOne extends Notifier {

    /**
     * 通知，具体的通知，由具体的通知者实现
     * <p>
     *
     * @author: 张弓
     * @date: 2018/9/8
     * @version: 1.0.0
     */
    @Override
    public void notifyUpdate() {
        try {
            System.out.println("通知者1通知开始。。。。");
            this.eventHandler.notifyUpdate();
            System.out.println("通知者1通知结束。。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
