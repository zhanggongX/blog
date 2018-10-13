package tech.zg.patterns.behavior.behavior4_state_patterns;

/**
 * 工作类，不同的时间，工作状态是不一样的。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class Work {

    /**
     * 时间
     */
    private Integer hour;
    /**
     * 工作状态
     */
    private State currentState;
    /**
     * 是否完成了工作。
     */
    private Boolean finishWork;

    public Work() {
        this.currentState = new ForenoonState();
        this.setFinishWork(false);
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public Boolean getFinishWork() {
        return finishWork;
    }

    public void setFinishWork(Boolean finishWork) {
        this.finishWork = finishWork;
    }

    /**
     * 写程序
     * <p>
     *
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    public void writeProgram() {
        // 调用不同的状态的类的写代码方法，不同的状态的逻辑，在不同的状态类中完成。
        currentState.writeProgram(this);
    }
}
