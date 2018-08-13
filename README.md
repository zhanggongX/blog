设计模式笔记
===

为什么要考虑用设计模式？<br>

&emsp;&emsp;回顾一下我们的开发之路，最开始只会用简单的java API。而开发简单的java程序，也只需要熟练使用java API即可，但是随着我们开发技能的不断提高，
想必很多人都会有疑惑，什么样的代码才是好代码呢？很多人都想写一手好代码，但是怎么去写才算是好代码呢？<br>
&emsp;&emsp;我也遇到了这样的疑惑，好吧，其实这就是我的疑惑，有疑惑怎么办？看书啊，然后我就读了两本书，一本叫大话设计模式，
认识了大鸟和小菜，一本叫代码整洁之道，是一个外国的大神写的书。
是我发现我三月份看完之后，七月份已经差不多忘得干干净净了，没办法，写下来吧。<br>
&emsp;&emsp;回到当初的问题，究竟什么样的代码是好代码呢？<br>
&emsp;&emsp;举个栗子，回想一下古代雕版印刷，在活字印刷术发明之前，发一个公告就要刻一个雕版，我们可以把发一个公告作为一个任务，把雕版比作我们的程序，
在活字印刷术发明之前，印刷一个通告，就要雕刻一个整版，如果一个雕版完成以后有一个地方要改，
无论增删改查一个字体就要全部重来，就像我们写程序，一个main函数从头到尾，任何一个地方修改，就要把整个程序给思考一遍，然后才能动手修改，这是极其的不灵活的。<br>
&emsp;&emsp;而发明了活字印刷术之后呢？<br>
&emsp;&emsp;第一，要改某个字，只需替换掉这个字即可，这是可维护性<br>
&emsp;&emsp;第二，已经用过的字，还可以用，这是可复用性。<br>
&emsp;&emsp;第三，若是要加字，只需要再烧制一个字体模板往里添加即可，这是灵活性好。<br>
&emsp;&emsp;这就是好代码的优势。<br>
&emsp;&emsp;而学习设计模式，就是参考前人的智慧，深刻理解这些模式，从而在开发的过程中，能够灵活的使用封装、继承、多态等特性把程序的耦合度降低，
从而把程序写的更加灵活，且易于复用。仔细看完常见的设计模式，你会发现其实这些设计模式就是各种对继承和多态的灵活使用而已。<br>

### 1 创建型模式
- [1.1 简单工厂模式](https://github.com/zhangonga/design-patterns/blob/master/md/create1_simple_factory_patterns.md)
- [1.2 单例模式]()
- [1.3 工厂方法模式](https://github.com/zhangonga/design-patterns/blob/master/md/create3_factory_method_patterns.md)
- [1.4 抽象工厂模式]()
- [1.5 建造者模式]()
- [1.6 原型模式](https://github.com/zhangonga/design-patterns/blob/master/md/create6_prototype_patterns.md)

### 2 结构型模式
- [2.1 适配器模式]()
- [2.2 装饰模式](https://github.com/zhangonga/design-patterns/blob/master/md/structure2_decorator_patterns.md)
- [2.3 桥接模式]()
- [2.4 组合模式]()
- [2.5 享元模式]()
- [2.6 代理模式](https://github.com/zhangonga/design-patterns/blob/master/md/structure6_proxy_patterns.md)
- [2.7外观模式]()

### 3 行为型模式
- [3.1 观察者模式]()
- [3.2 模板方法模式](https://github.com/zhangonga/design-patterns/blob/master/md/behavior2_template_method_patterns.md)
- [3.3 命令模式]()
- [3.4 状态模式]()
- [3.5 职责链模式]()
- [3.6 解释器模式]()
- [3.7 中介模式]()
- [3.8 访问者模式]()
- [3.9 策略模式](https://github.com/zhangonga/design-patterns/blob/master/md/behavior9_strategy_patterns.md)
- [3.10 备忘录模式]()
- [3.11 迭代器模式]()

### 一些原则
- [单一职责原则](https://github.com/zhangonga/design-patterns/blob/master/md/some_principle.md#%E5%8D%95%E4%B8%80%E8%81%8C%E8%B4%A3%E5%8E%9F%E5%88%99single-responsibility-principle)
- [开放-封闭原则](https://github.com/zhangonga/design-patterns/blob/master/md/some_principle.md#%E5%BC%80%E6%94%BE-%E5%B0%81%E9%97%AD%E5%8E%9F%E5%88%99open-closeed-principle)
- [里氏替换原则](https://github.com/zhangonga/design-patterns/blob/master/md/some_principle.md#%E9%87%8C%E6%B0%8F%E6%9B%BF%E6%8D%A2%E5%8E%9F%E5%88%99liskov-substitution-pricciple)
- [依赖倒转原则](https://github.com/zhangonga/design-patterns/blob/master/md/some_principle.md#%E4%BE%9D%E8%B5%96%E5%80%92%E8%BD%AC%E5%8E%9F%E5%88%99dependency-inversion-principle)
- [迪米特法则](https://github.com/zhangonga/design-patterns/blob/master/md/some_principle.md#%E8%BF%AA%E7%B1%B3%E7%89%B9%E6%B3%95%E5%88%99law-of-demeter)
