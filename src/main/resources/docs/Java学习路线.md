Java 的学习路线建议按照“基础 → 核心 → 框架 → 数据库 → 中间件 → 并发/JVM → 分布式 → 项目实战 → 面试”的顺序推进。很多人一开始直接学框架，最后只会 CRUD，但对底层原理理解不足，因此建议把基础打扎实。

下面给你一份偏“就业 + 实战 + 面试”方向的完整路线。

---

# 一、Java 基础阶段（最重要）

这一阶段的目标是：

* 能独立写中小型程序
* 理解 Java 面向对象思想
* 具备阅读源码能力

建议学习时长：1~2 个月。

---

## 1. Java 基础语法

先学习：

* 变量
* 数据类型
* 运算符
* 流程控制

    * if
    * switch
    * for
    * while
* 数组

这里重点不是“记语法”，而是养成编程思维。

例如：

* 如何拆解问题
* 如何用循环优化代码
* 如何封装逻辑

推荐练习：

* 打印九九乘法表
* 冒泡排序
* 二分查找
* 学生管理系统（控制台版）

---

## 2. 面向对象（核心）

这是 Java 的灵魂。

必须真正理解：

* 类与对象
* 封装
* 继承
* 多态

以及：

* 构造方法
* this
* super
* static
* final

重点理解：

### 多态

很多初学者会背定义，但不会用。

要理解：

* 编译看左边
* 运行看右边

例如：

```java
Animal a = new Dog();
```

为什么能这样写？

底层发生了什么？

方法调用为什么会动态绑定？

这些非常关键。

---

## 3. 常用类

必须熟练：

### String

重点：

* 不可变性
* 字符串常量池
* StringBuilder
* StringBuffer

经典面试题：

```java
String s = "a" + "b";
```

和

```java
String s = a + b;
```

区别是什么？

---

### 包装类

* Integer
* Double
* Character

重点：

* 自动装箱/拆箱
* IntegerCache

---

### Object 类

重点：

* equals
* hashCode
* toString

必须理解：

为什么重写 equals 必须重写 hashCode？

---

## 4. 集合框架（超级重点）

这是面试高频。

必须深入：

## List

### ArrayList

重点：

* 底层数组
* 扩容机制
* 为什么查询快
* 为什么插入慢

### LinkedList

重点：

* 双向链表
* 为什么插入快
* 为什么查询慢

必须能回答：

什么时候选择 ArrayList？

什么时候选择 LinkedList？

---

## Set

### HashSet

重点：

* 底层 HashMap
* 去重原理
* hashCode + equals

---

## Map

### HashMap（重中之重）

必须掌握：

* 数组 + 链表 + 红黑树
* hash 冲突
* 扩容
* 负载因子
* 为什么长度是 2 的幂
* JDK1.7 和 1.8 区别

后面学习并发时：

* ConcurrentHashMap

也非常重要。

---

## 5. 异常机制

学习：

* try-catch-finally
* throws
* throw
* 自定义异常

重点理解：

* checked exception
* runtime exception

---

## 6. IO 与 NIO

### IO

学习：

* 文件读写
* 字节流
* 字符流
* 缓冲流

### NIO

重点：

* Buffer
* Channel
* Selector

后面 Netty 会用到。

---

## 7. 多线程与并发（核心难点）

这一部分是 Java 含金量最高的模块之一。

建议认真学习。

---

# 二、Java 并发编程

建议学习时长：1~2 个月。

---

## 1. 创建线程方式

* Thread
* Runnable
* Callable
* 线程池

重点：

为什么实际开发不推荐直接 new Thread？

---

## 2. 线程安全

学习：

* synchronized
* volatile
* Lock

重点：

### synchronized 底层

必须理解：

* 对象头
* monitor
* 锁升级

    * 偏向锁
    * 轻量级锁
    * 重量级锁

---

### volatile

重点：

* 可见性
* 禁止指令重排

经典问题：

volatile 为什么不能保证原子性？

---

## 3. JUC（Java 并发包）

必须学习：

* ReentrantLock
* CountDownLatch
* CyclicBarrier
* Semaphore
* ThreadLocal

以及：

* CAS
* AQS

---

## 4. 线程池（面试高频）

必须掌握：

* corePoolSize
* maximumPoolSize
* 阻塞队列
* 拒绝策略

经典问题：

为什么不推荐 Executors 创建线程池？

---

# 三、JVM（高频核心）

很多人害怕 JVM，其实重点没那么多。

建议重点：

---

## 1. JVM 内存结构

学习：

* 堆
* 栈
* 方法区
* 程序计数器
* 本地方法栈

---

## 2. 垃圾回收（GC）

重点：

* CMS
* G1

理解：

* 新生代
* 老年代
* Minor GC
* Full GC

---

## 3. 类加载机制

学习：

* 双亲委派
* 类加载过程

经典问题：

为什么需要双亲委派？

---

# 四、MySQL 数据库

Java 后端离不开数据库。

---

## 1. SQL

必须熟练：

* 增删改查
* 多表查询
* 子查询
* 分组
* 索引

---

## 2. 索引（核心）

重点：

* B+ 树
* 聚簇索引
* 回表
* 覆盖索引

经典问题：

为什么 MySQL 用 B+ 树？

---

## 3. 事务

学习：

* ACID
* 隔离级别
* MVCC

---

## 4. SQL 优化

必须会：

* explain
* 慢查询分析

---

# 五、Web 开发基础

---

## 1. HTML + CSS + JavaScript

不用特别精通。

但至少要会：

* 页面结构
* DOM
* Ajax

---

## 2. HTTP

必须掌握：

* GET/POST
* Cookie
* Session
* 状态码

---

# 六、Spring 全家桶（就业核心）

这是 Java 后端的核心。

建议花最多时间。

---

# 七、Spring

重点：

## IOC

理解：

* 控制反转
* 依赖注入

---

## AOP

重点：

* 动态代理
* JDK 动态代理
* CGLIB

---

# 八、Spring MVC

学习：

* 请求流程
* DispatcherServlet
* 参数绑定

---

# 九、Spring Boot

这是现代开发核心。

必须掌握：

* 自动配置
* starter
* yml
* 整合 MyBatis

---

# 十、MyBatis

学习：

* mapper
* 动态 SQL
* 一级缓存
* 二级缓存

---

# 十一、Redis

重点：

* String
* Hash
* List
* Set
* ZSet

以及：

* 缓存穿透
* 缓存击穿
* 缓存雪崩

---

# 十二、MQ 消息队列

推荐学习：

* RabbitMQ
* Kafka

重点：

* 削峰
* 解耦
* 异步

以及：

* 消息可靠性
* 重复消费

---

# 十三、微服务与分布式

建议后期学习。

---

## 推荐：

* Spring Cloud
* Nacos
* OpenFeign
* Gateway

---

## 分布式核心

学习：

* 分布式事务
* 分布式锁
* CAP
* BASE

---

# 十四、项目实战（最重要）

只看视频很难真正提升。

一定要自己做项目。

建议：

---

## 初级项目

* 学生管理系统
* 图书管理系统

---

## 中级项目

* 外卖系统
* 博客系统
* 商城系统

---

## 高级项目

* 秒杀系统
* IM 聊天系统
* 分布式商城

---

# 十五、源码学习

推荐：

## Spring 源码

重点：

* IOC 启动过程
* Bean 生命周期

---

## HashMap 源码

重点：

* put
* resize

---

## ThreadPoolExecutor 源码

重点：

* execute 流程

---

# 十六、算法与数据结构

Java 后端面试越来越重视算法。

至少掌握：

* 链表
* 树
* 堆
* DFS/BFS
* 动态规划

推荐刷题：

* LeetCode 热题 100

---

# 十七、学习顺序建议（非常关键）

推荐顺序：

```text
Java基础
→ 集合
→ 多线程
→ JVM
→ MySQL
→ HTML/JS/HTTP
→ Spring
→ SpringBoot
→ MyBatis
→ Redis
→ MQ
→ 微服务
→ 分布式
→ 源码
→ 算法
→ 高级项目
```

---

# 十八、学习建议

## 1. 不要只看视频

一定：

* 自己敲代码
* 自己调试
* 自己查错

---

## 2. 多画图

比如：

* HashMap
* JVM
* 锁升级
* Spring IOC

画图后理解会快很多。

---

## 3. 学会看源码

开始会痛苦。

但后面能力会提升非常快。

---

## 4. 学会总结

建议：

* 写博客
* 记笔记
* 整理面试题

---

# 十九、推荐学习资源

## Java 基础

* 《Java 核心技术》
* 《Effective Java》

Effective Java

---

## JVM

* 《深入理解Java虚拟机》

深入理解Java虚拟机

---

## 并发

* 《Java并发编程实战》

Java并发编程实战

---

## Spring

* 《Spring源码深度解析》

Spring源码深度解析

---

# 二十、最后的路线建议

如果你的目标是：

## 找 Java 后端工作

重点优先级：

```text
Java基础
> 集合
> 并发
> MySQL
> SpringBoot
> Redis
> 项目
```

---

## 如果目标是大厂

需要加强：

* JVM
* 并发
* 分布式
* 算法
* 源码

---

## 如果目标是快速就业

优先：

* SpringBoot
* MyBatis
* Redis
* 项目实战

先能做项目，再逐渐补底层。

---

真正拉开差距的，不是“学了多少框架”，而是：

* 是否理解底层原理
* 是否做过真实项目
* 是否具备排查问题能力
* 是否能从源码层面解释问题

很多人会用框架，但不会分析：

* 为什么慢
* 为什么死锁
* 为什么 Full GC
* 为什么 SQL 不走索引

而这些，才是 Java 工程师真正的核心能力。
