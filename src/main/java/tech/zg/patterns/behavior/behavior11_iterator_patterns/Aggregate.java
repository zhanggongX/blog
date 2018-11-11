package tech.zg.patterns.behavior.behavior11_iterator_patterns;

/**
 * 聚合类接口
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public interface Aggregate<T> extends IteratorEnable {

    /**
     * 增加对象
     * <p>
     *
     * @param object
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    void add(T object);

    /**
     * 移除对象
     * <p>
     *
     * @param object
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    void remove(T object);

    /**
     * 查询对象
     * <p>
     *
     * @param index
     * @return T
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    T get(int index);

    /**
     * 大小
     * <p>
     *
     * @return int
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    int size();
}
