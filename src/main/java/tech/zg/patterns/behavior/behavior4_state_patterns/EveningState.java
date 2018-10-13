package tech.zg.patterns.behavior.behavior4_state_patterns;

/**
 * 晚上的工作状态
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class EveningState implements State {

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
        if(work.getFinishWork()){
            work.setCurrentState(new RestState());
            work.writeProgram();
        }else {
            if(work.getHour() < 21){
                System.out.println("当前时间" + work.getHour() + "点，晚上状态疲惫至极。");
            }else {
                work.setCurrentState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
