package patterns.behavior.behavior11_iterator_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 具体的聚合类
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class ConcreteAggregate<T> implements Aggregate<T>, IteratorEnable {

    private static final int DEFAULT_SIZE = 16;
    private List<T> list = null;

    public ConcreteAggregate() {
        list = new ArrayList(DEFAULT_SIZE);
    }

    public ConcreteAggregate(int aggregateSize) {
        list = new ArrayList(aggregateSize);
    }

    /**
     * 返回迭代器的方法
     * <p>
     *
     * @return Iterator
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator<T>(this);
    }

    /**
     * 增加对象
     * <p>
     *
     * @param object
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public void add(T object) {
        list.add(object);
    }

    /**
     * 移除对象
     * <p>
     *
     * @param object
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public void remove(T object) {
        list.remove(object);
    }

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
    @Override
    public T get(int index) {
        return list.get(index);
    }

    /**
     * 大小
     * <p>
     *
     * @return int
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    @Override
    public int size() {
        return list.size();
    }



    /**
     * 本聚合类的迭代器
     * <p>
     *
     * @author: 张弓
     * @date: 2018/11/11
     * @version: 1.0.0
     */
    class ConcreteIterator<T> implements Iterator<T> {

        private AtomicInteger index = null;
        private Aggregate aggregate;

        public ConcreteIterator(Aggregate aggregate) {
            this.index = new AtomicInteger(0);
            this.aggregate = aggregate;
        }

        /**
         * 返回第一个
         * <p>
         *
         * @return T
         * @author: 张弓
         * @date: 2018/11/11
         * @version: 1.0.0
         */
        @Override
        public T first() {
            return (T) this.aggregate.get(0);
        }

        /**
         * 返回下一个
         * <p>
         *
         * @return T
         * @author: 张弓
         * @date: 2018/11/11
         * @version: 1.0.0
         */
        @Override
        public T next() {
            return (T) this.aggregate.get(index.intValue());
        }

        /**
         * 是否有下一个
         * <p>
         *
         * @return T
         * @author: 张弓
         * @date: 2018/11/11
         * @version: 1.0.0
         */
        @Override
        public boolean hasNext() {
            int current = index.getAndIncrement();
            return current < this.aggregate.size();
        }

        /**
         * 返回当前项
         * <p>
         *
         * @return T
         * @author: 张弓
         * @date: 2018/11/11
         * @version: 1.0.0
         */
        @Override
        public T currentItem() {
            return (T) this.aggregate.get(index.intValue());
        }
    }
}
