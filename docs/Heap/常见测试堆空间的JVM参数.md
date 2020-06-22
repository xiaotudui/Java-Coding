## 常见测试堆空间的 JVM 参数

-XX:+PrintFlagsInital 查看所有参数的初始值

-XX:+PrintFlagsFinal 查看所有参数的最终值

-Xms 设置堆的初始值

-Xmx 设置堆的最大值

-Xmn 设置新生代的大小

-XX:NewRatio 新生代与老年代的比例

-XX:SurvivorRatio 设置 Eden 和 Survivor 比例

-XX:MaxTenuringThreshold 设置进入老年代的年龄阈值

-XX:+PrintGCDetails 打印 垃圾回收 的细节

-XX:HandlerPromotionFailure 是否设置空间分担担保