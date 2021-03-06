# 策略模式

&emsp;&emsp;之前学简单工厂模式的时候，举了一个计算器的例子，当时说过，这个计算器其实更适合策略模式。使用简单工厂模式来实现这个程序，需要我们把计算类型传给工厂，让工厂创建出一个具体的计算类返回给我们，我们在用这个计算类来计算结果，有没有一种更好用的模式来实现呢？比如说我们之间把参数传给一个类，这个类来自动的帮我们找到合适的计算方法，计算出结果呢。有，这个模式就是策略模式。<br>
&emsp;&emsp;策略模式是用来定义一系列算法的模式，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用类的耦合,策略模式的核心思想就是，创建一个上下文对象，这个对象引用了这一系列算法的抽象，通过引用不同的具体实现，来计算出具体的结果。<br>
&emsp;&emsp;策略模式和简单工厂模式的相似和区别。<br>
&emsp;&emsp;这两种模式看上去很像。都是根据多态，通过不同的条件，来使用不同的对象进行解耦。<br>
&emsp;&emsp;但是他们是有本质的区别的，首先，它们两个一个是创建型的模式，一个是行为型的模式，其次，工厂模式的具体算法选型交给了调用方，而策略模式则把算法的选型交给了提供方。一个是我要把使用的类型传递给工厂，然后获得具体的算法类，然后再去计算。一种是传递给策略上下文，然后直接调用即可，而不用关心调用的那个方法，因为策略的上下文有具体的算法的引用。<br>
&emsp;&emsp;什么时候使用策略模式呢？策略模式就是用来封装算法的，它可以用来封装几乎任何类型的规则，所以在我们实际工作中，如果听到在不同时间应用不同的业务规则，就可以考虑使用策略模式来处理这种变化的可能性。当然策略模式，大多数情况下，可以被工厂模式所取代。<br>
&emsp;&emsp;策略模式，详见代码[behavior9_strategy_patterns](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior9_strategy_patterns)。<br>


- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)