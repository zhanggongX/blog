# 迭代器模式
&emsp;&emsp;迭代器模式，就是提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。<br>
&emsp;&emsp;迭代器分离了集合对象的遍历行为，抽象出了一个迭代器类来负责，这样就做到了即不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。<br>
&emsp;&emsp;迭代器模式是一种非常非常常用的模式，以至于java sdk很多地方实现了这个模式，翻一下源代码，几乎所有的集合都实现了迭代器的接口。<br>
&emsp;&emsp;什么时候使用迭代器模式呢？当你需要访问一个聚合对象，而不管这些对象是什么都不需要遍历的时候，你就可以考虑使用迭代器模式了。<br>
&emsp;&emsp;java的sdk里有各种非常好的迭代器代码，但这里还是简单的实现一个。不重复造轮子是不会深刻的知道轮子是怎么造出来的。


- [详见代码 ](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior11_iterator_patterns)

- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)