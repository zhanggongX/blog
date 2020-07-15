# 观察者模式

&emsp;&emsp;观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态发生变化时，会通知所有的观察者对象，使它们能够自动更新自己。<br>
&emsp;&emsp;简单来说，当有多个观察者同时观察一个对象的时候，当主题对象的状态发生了变化，观察者能够回调自身的方法更新自己。<br>
&emsp;&emsp;观察者的模式的优点，解耦了通知者与观察者，观察者不需要知道通知者内部是怎么实现的，方便以后进行代码的修改，体现了依赖倒转原则。<br>
&emsp;&emsp;但是普通的观察者模式是有问题的，比如多个订阅者要实现同一个方法，而实际情况中，具体的被通知者的实现是千变万化的，不能强制要求所有的被通知者实现一样的更新方法。为了优化这样的情况，可以通过委托模式来取代观察订阅者模式来实现观察者模式。<br>
&emsp;&emsp;委托模式：<br>
&emsp;&emsp;所谓的委托模式，就是定义一个对象Event，这个对象Event持有观察者的实例、要通知的方法、方法的入参。所有通知者就不用管观察者具体实现了什么，做了什么。总结起来就是利用反射调用观察者的方法而已。<br>
&emsp;&emsp;你可以点击下方的链接去看我写的例子代码，你会发现委托模式有以下优点:<br>
&emsp;&emsp;1。各个具体的通知者完全不知道观察者的存在，完全解耦。（当然，功劳归功于Event和EventHandler，且这两个类具有通用性）<br>
&emsp;&emsp;2。一次通知，执行了不同类的不同方法<br>
&emsp;&emsp;3。扩展性很高，再来一个观察者三，并在测试代码中告诉通知者一下就好，通知者完全没有变。重用性好<br>
&emsp;&emsp;4。各个观察者之间没有任何关系，它们接收通知的方法也完全不一样。<br>


- [基于发布-订阅的观察者模式详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior1_publis_subscribe_patterns/v1)
- [基于委托的观察者模式详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior1_publis_subscribe_patterns/v2)

- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)