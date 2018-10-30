package tech.zg.patterns.behavior.behavior10_memento_patterns;

/**
 * 管理者，非必要，但是最好存在，可以存放多个历史备份
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/30
 * @version: 1.0.0
 */
public class Caretaker {

    /**
     * 管理者可以持有多个备忘录
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
