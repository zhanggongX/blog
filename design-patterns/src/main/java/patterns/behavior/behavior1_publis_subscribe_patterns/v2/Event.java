package patterns.behavior.behavior1_publis_subscribe_patterns.v2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * 委托事件类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/9/6
 * @version: 1.0.0
 */
public class Event {

    /**
     * 要执行方法的对象
     */
    private Object object;
    /**
     * 要执行的方法
     */
    private String methodName;
    /**
     * 要执行方法的参数
     */
    private Object[] params;
    /**
     * 要执行方法的类型，本类通过参数列表自动获得
     */
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    /**
     * 获取参数的类型列表
     * <p>
     *
     * @param params
     * @author: 张弓
     * @date: 2018/9/6
     * @version: 1.0.0
     */
    private void contractParamTypes(Object... params) {
        if (params.length > 0) {
            this.paramTypes = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                this.paramTypes[i] = params[i].getClass();
            }
        }
    }

    /**
     * 事件的执行方法
     * <p>
     *
     * @throws Exception
     * @author: 张弓
     * @date: 2018/9/6
     * @version: 1.0.0
     */
    public void invoke() throws Exception {
        Method method = this.object.getClass().getMethod(this.methodName, this.paramTypes);
        if (null == method) {
            return;
        }
        method.invoke(this.object, this.params);
    }
}
