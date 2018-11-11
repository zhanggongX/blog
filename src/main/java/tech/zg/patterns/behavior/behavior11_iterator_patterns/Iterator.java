package tech.zg.patterns.behavior.behavior11_iterator_patterns;

/**
 * 迭代器接口
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public interface Iterator<T> {

    /**
     * 返回第一个
     * <p>
     *
     * @return T
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    T first();

    /**
     * 返回下一个
     * <p>
     *
     * @return T
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    T next();

    /**
     * 是否有下一个
     * <p>
     *
     * @return T
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    boolean hasNext();

    /**
     * 返回当前项
     * <p>
     *
     * @return T
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    T currentItem();
}
