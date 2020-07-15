package patterns.behavior.behavior4_state_patterns;

/**
 * 父状态类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public interface State {

    /**
     * 写代码，完成本状态下的主类逻辑，并决定下一个状态是什么，并设置给主类。
     * <p>
     *
     * @param work
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    void writeProgram(Work work);
}
