package patterns.behavior.behavior10_memento_patterns;

import org.springframework.beans.BeanUtils;

/**
 * 发起人，被备份的类。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/17
 * @version: 1.0.0
 */
public class Originator {

    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        BeanUtils.copyProperties(this, memento);
        return memento;
    }

    public void resetMemento(Memento memento) {
        BeanUtils.copyProperties(memento, this);
    }

    public void showState() {
        System.out.println(this.state);
    }
}
