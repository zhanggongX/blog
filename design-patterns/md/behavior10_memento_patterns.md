# 备忘录模式
&emsp;&emsp;备忘录模式，是指在不破坏原类的封装性的前提下，捕获一个类的内部状态，并在对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态。<br>
&emsp;&emsp;备忘录模式，最常用的应该是在游戏中。例如，我们玩某个游戏，保存游戏进度，就可以使用备忘录模式，而且备忘录模式很简单，这个模式有三个角色，1=需要备份的对象，2=备份对象，3=管理备份的对象。<br>
&emsp;&emsp;2需要有1的所有属性，这样才能保存下来1的所有的属性。3可以持有多个2，这个就可以保存多个1的进度。<br>
&emsp;&emsp;就是这么简单，代码例子有，如下；<br>

- [详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior10_memento_patterns)。<br>


- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)