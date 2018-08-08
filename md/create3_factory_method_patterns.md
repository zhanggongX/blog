# 工厂方法模式

&emsp;&emsp;工厂方法模式是定义一个工厂接口，然后有多个子类工厂，让这些子类工厂去创建具体那个类的对象。<br>
&emsp;&emsp;简单工厂与工厂方法的区别：<br>
&emsp;&emsp;一，简单工厂是根据入参创建不同的对象，在工厂类中有一个判断逻辑，而工厂方法模式则是定义一个工厂接口，具体的工厂类去创建具体的对象。<br>
&emsp;&emsp;二，在简单工厂模式中，如果我们增加一个类型，在增加类的同时，还要修改工厂类的方法，这就违反了开闭原则，而工厂方法模式则解决了这个问题。<br>
&emsp;&emsp;三，但是工厂方法的问题是，新增一个类型，要增加两个类，一个方法类，一个方法的工厂类。<br>
&emsp;&emsp;四，工厂方法还有一个问题，在简单工厂方法中，我们使用那个类判断逻辑是在工厂中，而工厂方法则放到了客户端，也就是说我们增加了一个类，工厂不违反开闭原则了，但是客户端违反开闭原则了。<br>

- [参考代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/create/create3_factory_method_patterns)
- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)