# 适配器模式
&emsp;&emsp;将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。也就是说如果一个接口，我们不能用，但是又不能去修改它，也不知道他的具体细节，那么就只能做一个适配器来适配它了。<br>
&emsp;&emsp;说实话这个模式太简单了，没什么好讲的，例如适配一个对象，方便别的方法调用，我们只需要定义一个适配对象，提供其他方法可以调用的接口，然后在适配对象中调用老的方法即可。<br>
&emsp;&emsp;适配器模式，应该是设计模式应用的比较少的模式了，一般都是适配旧的系统的才会可能用到，也就是在调用方和被调用方都不太容易修改的时候再使用适配器模式，否则还是提供新的方法比较好。

- [详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/structure/structure1_adapter_patterns)
- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)