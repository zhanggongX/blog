# 模板方法模式

&emsp;&emsp;当我们要完成在某一细节层次一致的一个过程或者一系列步骤，但其极个别步骤在更详细的层次上实现可能不同时，我们通常考虑使用模板方法来处理。<br>
&emsp;&emsp;模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤[DP]。<br>
&emsp;&emsp;简单点说，就是把共通的方法，放到父类中，把一些需要变化的方法定义成虚方法，然后子类中再重写这些虚方法，实现具体的逻辑。<br>

- [详见代码](https://github.com/zhangonga/design-patterns/tree/master/src/main/java/tech/zg/patterns/behavior/behavior2_template_method_patterns)

- [返回首页](https://github.com/zhangonga/design-patterns#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%AC%94%E8%AE%B0)