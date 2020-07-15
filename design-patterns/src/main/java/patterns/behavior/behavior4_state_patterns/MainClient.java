package patterns.behavior.behavior4_state_patterns;

/**
 * 状态模式例子，根据不同的时间来改变不同的工作状态。
 * <p>
 *
 * @author: 张弓
 * @date: 2018/10/13
 * @version: 1.0.0
 */
public class MainClient {


    public static void main(String[] args) {
        Work project = new Work();

        project.setHour(9);
        project.writeProgram();

        project.setHour(10);
        project.writeProgram();
        project.setHour(12);
        project.writeProgram();
        project.setHour(13);
        project.writeProgram();
        project.setHour(14);
        project.writeProgram();
        project.setHour(17);
        project.writeProgram();

        project.setFinishWork(true);
        //project.setFinishWork(false);

        project.setHour(19);
        project.writeProgram();
        project.setHour(22);
        project.writeProgram();
    }
}
