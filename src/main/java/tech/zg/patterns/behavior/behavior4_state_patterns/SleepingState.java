package tech.zg.patterns.behavior.behavior4_state_patterns;

/**
 * 睡眠状态
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class SleepingState implements State {

    /**
     * 写代码，完成本状态下的主类逻辑，并决定下一个状态是什么，并设置给主类。
     * <p>
     *
     * @param work
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + "点，太困了，必须要睡了");
    }
}
