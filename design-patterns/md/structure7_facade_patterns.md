# 外观模式

&emsp;&emsp;外观模式：为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。简单的说，就是给一组乱七八糟的方法提供一个对外的方法。<br>
&emsp;&emsp;什么时候使用外观模式呢?<br>
&emsp;&emsp;分三个阶段来说：1，在设计初期阶段，应该有意识的将不同的两个层分离，现在web开发的三层结构，就是这样的思想。2，在开发阶段，子系统往往因为不断的重构演化而变的复杂，大多数的设计模式都会产生很多较小的类，这当然是好事儿，但是在调用上也会带来一定的麻烦，增加一个facade可提供一个简单的接口，来减少他们之间的依赖。3，在维护一个遗留的大型系统时，修改这个系统绝对是一个麻烦的事情，但是这个系统又可能很重要，新的需求要调用这个系统，就可以提供一个facade类，用来给复杂的旧系统提供一个简单的调用，让新系统和facade对象交互，facade与遗留代码交互所有复杂的工作。<br>

更详细的解释，在代码中。<br>
- [参考代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/structure/structure7_facade_patterns)<br>
- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)