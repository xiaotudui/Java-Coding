## 虚拟机的启动
Java 虚拟机的启动是通过引导类加载器创建一个初始类来完成的，这个类是由虚拟机的具体实现指定的。
 
 RunTime 运行环境，单例模式，饿汉
 
## 准确式内存管理
虚拟机可以知道内存中某个位置的数据是什么类型的

ClassLoader 只负责class文件的加载，至于是否能够执行，取决于执行引擎。

运行时常量池，常量池加载到内存中。

方法区，存放了类的信息，运行时常量池信息

如果一个类型是用户类加载器加载的，那么JVM会将这个类加载器的一个引用作为类型信息的一部分保存在
方法区。

当解析一个类型到另一个类型的引用的时候，JVM 需要保证这两个类型的类加载器是相同的。

-Xss 栈大小

局部变量表中的变量也是重要的垃圾回收的根结点

进程对应一个JVM实例

-Xms 起始堆空间大小
-Xmx 最大大小
-Xmn 新生代最大内存大小

YGC/Minor GC Eden满的时候
Major GC 老年代满的时候
Full GC 
* System.gc() 
* 老年代空间不足
* 方法区不足


  