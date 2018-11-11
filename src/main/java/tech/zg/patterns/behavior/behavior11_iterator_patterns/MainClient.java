package tech.zg.patterns.behavior.behavior11_iterator_patterns;

/**
 * 测试入口
 * <p>
 *
 * @author: 张弓
 * @date: 2018/11/11
 * @version: 1.0.0
 */
public class MainClient {

    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("AA");
        aggregate.add("BB");

        Iterator iterator = aggregate.iterator();
        System.out.println(iterator.first());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
    }
}
