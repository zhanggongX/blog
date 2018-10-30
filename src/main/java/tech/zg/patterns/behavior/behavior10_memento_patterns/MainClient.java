package tech.zg.patterns.behavior.behavior10_memento_patterns;

/**
 * 备忘录模式
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/17
 * @version: 1.0.0
 */
public class MainClient {


    public static void main(String[] args) {
        // 创建一个需要备份的类，把状态设置成1，并打印
        Originator originator = new Originator();
        originator.setState(1);
        originator.showState();

        // 创建一个备忘录的管理者，并创建一个备忘录，并设置给管理者，管理者可以持有多个备忘录，记录多次状态。
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // 把当前类设置状态为2。并打印
        originator.setState(2);
        originator.showState();

        // 恢复之前的状态。
        originator.resetMemento(caretaker.getMemento());
        originator.showState();
    }
}
