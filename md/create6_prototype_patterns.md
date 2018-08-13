# 原型模式

&emsp;&emsp;原型模式，就是用原型实例指定创建对象的种类，并且通过拷贝这些原型来创建新的对象，就是为了快速构造一个和已有对象相同的副本<br>
&emsp;&emsp;其实就是合理利用Java的clone方法。<br>
&emsp;&emsp;一般在初始化的信息不发生变化的情况下，clone是最好的办法，因为它是直接在底层内存中复制的，省去了对象创建的过程，对性能有很大的提高<br>
&emsp;&emsp;浅克隆和深克隆，如果一个对象中的变量，全部是基本类型的时候，可以直接使用clone方法，但是如果对象中有引用变量的时候就必须使用深克隆了，因为浅克隆克隆出来的对象，还是指向旧的对象，这样修改新的对象，就会影响旧的对象。<br>
&emsp;&emsp;所谓的深克隆，就是将引用类型变量再进行克隆，知道所有的引用对象全部克隆成新的对象为止。


- [详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/create/create6_prototype_patterns)

- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)