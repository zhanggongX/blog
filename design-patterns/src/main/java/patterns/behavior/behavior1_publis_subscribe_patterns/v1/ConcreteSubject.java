package patterns.behavior.behavior1_publis_subscribe_patterns.v1;

/**
 * 具体主题类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/8/25
 * @version: 1.0.0
 */
public class ConcreteSubject extends Subject{

    /**
     * 主题内容
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
