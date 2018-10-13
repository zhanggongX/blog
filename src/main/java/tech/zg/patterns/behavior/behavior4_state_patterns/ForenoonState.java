package tech.zg.patterns.behavior.behavior4_state_patterns;

/**
 * 上午的工作状态。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class ForenoonState implements State{

    /**
     * 写代码
     * <p>
     *
     * @param work
     * @author: 张弓
     * @date: 2018/10/13
     * @version: 1.0.0
     */
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 12){
            System.out.println("当前时间:" + work.getHour() + "点，上午工作精神百倍");
        }else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}
