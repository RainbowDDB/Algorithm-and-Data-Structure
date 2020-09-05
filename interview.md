# 面试相关

## 操作系统

### 线程与进程

> 进程是操作系统资源分配的最小单位，线程是 CPU 调度的最小单位

1. 开销方面：每个进程都有独立的代码和数据空间，而一个进程的**所有线程共享代码和数据空间**，每个线程都有**独立的方法栈**

2. 所处环境：操作系统中能运行多个进程，一个进程中运行多个线程，通过 `CPU 调度`每个 `CPU 时间片`只有一个线程进行

3. 内存分配，操作系统为每个进程分配内存空间，除 CPU 外，操作系统不会为线程分配空间

### 进程间通讯 IPC

1. 管道 匿名管道

   内核中一块固定大小的缓冲区，可以进行进程间通信

   同步互斥机制，半双工模式，两个管道实现双向通信，仅可以在父子进程间通信

2. FIFO 命名管道

   可以在无关进程间交换数据，速度很慢

3. 消息队列

   内核中一个数据报消息队列，不同进程可以通过句柄访问此队列

   允许多个进程写入读取，可实现双向通信

4. 共享内存

   将同一块物理内存映射到不同进程的虚拟内存空间中，实现内存资源对多进程的共享

   为临界资源，需要操作时需要保证原子性。可以使用信号量和互斥锁

5. 信号量

   内核中的信号量集合数组，用于对临界资源进行保护，实现**进程间的互斥与同步**

   P-1/V+1，如果值为 0，进程挂起，否则恢复运行

   > 上述五点均在内核空间，用于本地的进程间通信

6. socket

   网络间的进程通信，**应用层与运输层通信的软件抽象层**

   常用方法与 tcp 连接的问题

   Connect `socket()`、`bind()`、`listen()`、`connect()`、`accept()`、`close()`

   I/O `read()`、`write()`

7. Binder(Android 进程通信机制) 详情见下

### 页面置换算法

缺页中断，无空闲页面需要移出某个页面

1. 最佳置换算法 OPT
2. 先进先出 FIFO
3. 最近最久未使用 LRU 算法

## 计网

### HTTP/HTTPS

- 版本、原理和区别(安全性 ssl)，cookie/session 无状态？

  1. http/0.9 简陋，仅有 get，仅支持 html

  2. http/1.0 多支持了 post 和 head，非持久连接，content-type 支持的更多内容格式，支持 cache

  3. http/1.1 持久连接，支持了 Put、Delete 等请求方式，管道机制：支持多个请求同时发送

  4. http/2.0 双工，服务端支持同时处理多个请求，解决队头拥塞的问题，多路复用，将多个流 `stream` 放入一个连接 `connection` 中

  5. http/3.0 `QUIC 协议`(基于 `UDP`)

  - 自定义连接机制：`TCP` 每次只要断开了连接就需要重新握手
    ，而基于 `UDP`，用 64 位随机数作为 `ID` 标示，只要 `ID` 不变就不会重新建立连接

  - 自定义重传机制：每个包通过递增的序列号发送，并通过 `offset` 确定内容的发送位置

  - 无阻塞的多路复用：一个连接的 `Stream` 之间没有任何依赖，和 `TCP` 不一样的是，接收到的包就可以直接发给用户，而无需等待前面的包全部传输成功，直接应答，无需像 `TCP` 一样累计应答

  - 自定义流量控制：仍类似于滑动窗口，offset

- TCP 和 UDP，三次握手和四次挥手
- 转发与重定向
- 报文内容、请求方式和状态码
- 域名解析过程

### HTTPS 加密

- SSL 安全套接字层 应用层与传输层之间

1. 加密握手阶段：客户端向服务端索要并验证秘钥，对称加密，此过程为明文传输

   -> 客户端发起请求 `Client Hello` 发送客户端支持的 SSL、加密算法等

   -> 服务端回应 `Server Hello`(`CA证书数字签名`公钥验证)，发送公钥证书

   -> 客户端回应 `Client Key Exchange`，发送公钥加密后的对称密钥，对加密通道进行验证

   -> 服务端最后回应 `New Session Ticket` 对发送的加密数据进行验证，成功后，通知客户端开始以加密方式传输数据

2. 利用对话秘钥进行加密通信

- TLS 传输层安全协议

- 基本过程

1. 基于**证书利用数字签名**进行 C/S 身份验证
2. **对称秘钥算法**对数据加密
3. **MAC 算法**检验数据完整性

### 缓存

强制缓存(Cache-Control)与对比缓存(code 304，并不返回 body 内容)

---

## Java

### JVM 内存模型

#### 五大区域

1. 程序计数器

   线程私有，记录当前运行的指令地址

2. 虚拟机栈

   线程私有，每个方法执行的时候会创建一个栈帧，存储局部变量表、操作数、方法返回等信息。当线程请求栈深度超过临界，就会报出`StackOverFlowError`

3. 本地方法栈

   线程私有，保存的是 native 方法信息

4. 堆

   所有线程共享的一块内存，所有对象实例和数组都要在堆上分配内存，（需要注意的是基本类型数据存储在栈中），此区域经常发生**垃圾回收**的操作

5. 方法区

   已被加载的类信息、常量、静态变量。在 jdk1.8 中已经不存在，被**元数据区**替代，原方法区被分为：1.加载的类信息(**元数据区**) 2.运行时常量池(**堆中**)

#### GC 垃圾回收机制

- 完整的 gc 过程

  -> 新生代 Eden 空间，minorGC

  -> 新生代 Survivor 空间，存活+1

  -> 老年代 存活>15，majorGC

  > Full GC 调用 System.gc()显式进行堆内存全扫描，强制进行内存清理

- 垃圾回收算法

1. 标记清除法 直接遍历
2. 标记整理法 遍历+边界清除（**适用于垃圾少的情况**）
3. 复制算法 两个区域，将不清理的放入另一个区域，再删除第一个区域
4. 分代收集算法 新生代用 3，老年代用 1、2

- 如何判断对象是否存活

1. 引用计数法 每一个对象为其他对象所持有的引用数，为 0 则不存活

   > 问题：循环引用，互相引用导致两者均无法 gc，现代垃圾回收算法中已不再使用

2. 可达性分析算法(引用链) `GC Roots`，不可达则进行最终判定

3. 最终判定：如果此对象没有复写 `finalize` 方法或者已经被调用过，则判定死亡，直接回收；否则放入 `F-Queue` 中等待执行 `finalize` 方法，之后 `GC` 会在 `F-Queue` 中进行**第二次标记**

#### 类加载

- 类加载器：通过一个类的全限定类名获得这个类的二进制自己流叫做类加载器

1. 根系加载器 由 `c++` 实现，不继承于 `ClassLoader`
2. 扩展类加载器 由 `java` 实现，加载 `JRE` 扩展目录
3. 系统类加载器 负责在 `JVM` 启动时加载来自 `Java` 命令的`-classpath` 选项、`java.class.path` 系统属性，或者 `CLASSPATH` 换将变量所指定的 `JAR` 包和类路径

- 类加载过程

1. 加载——将 `Class` 文件读入到内存，并创建一个 `Class` 对象
2. 链接——将类的二进制数据合并到 `JRE` 中，分为以下三步

   验证——检验类中是否有正确的内部结构

   准备——将类的**静态变量分配到内存**

   解析——类中二进制数据**符号引用转变为直接引用**

3. 初始化——为类的**静态变量赋予正确的初始值**

- 类加载时机

  创建类的对象，初始化、引用类的静态变量或调用静态方法、反射

- 类加载机制

1. 全盘负责

   就是当一个类加载器负责加载某个 Class 时，该 Class 所**依赖和引用其他 Class**也将由该类加载器负责载入，除非显示使用另外一个类加载器来载入

2. 双亲委派模型——保证类的唯一性，避免类重复加载
3. 缓存机制——所有加载过的 Class 都会被缓存

   > 这就是为什么在修改了 Class 后，必须重新启动 JVM，程序所做的修改才会生效的原因

#### 引用

1. 强引用 具有强引用的对象 gc 绝对不会回收
2. 软引用 SoftReference 内存不足才会回收
3. 弱引用 WeakReference 只要回收时发现弱引用对象就会直接回收
4. 虚引用 用来跟踪对象被垃圾回收的活动，jdk 中直接内存(不在堆内存处)的回收用到虚引用(分配一个对象指向直接内存处)

### 设计模式

#### 单例模式 Singleton

- 懒汉式：类加载时不产生单例，线程**不安全**，需要加`synchronized`和`volitile`，改进：**双重同步锁**

  ```java
  public class SingletonDemo {
      // 没有volatile修饰符，可能出现Java中的另一个线程看到个初始化了一半的instance的情况，但使用了volatile变量后，就能保证先行发生关系，所有的写优先于读（可见性与顺序性）
      private static volatile SingletonDemo instance = null;
      private SingletonDemo() {}
      //运行时加载对象
      public static SingletonDemo getInstance() {
          if (instance == null) {
              synchronized(SingletonDemo.class){
                  // 当两个进程按序进入同步锁时，如果之前已经生成实例，这里需要再次判断，防止多次生成！
                  if(instance == null){
                      instance = new SingletonDemo();
                  }
              }
          }
          return instance;
      }
  }
  ```

- 饿汉式：类加载时就产生单例，线程**安全**

- 静态内部类：类似于饿汉式，线程**安全**

- 枚举实现

#### 工厂模式/抽象工厂模式 Factory

自定义创建工厂

常见实例：`Okhttp` 的 `CacheStrategy` 构建工厂

#### 建造者模式 Builder

Builder 和 build 对象

静态内部类或者外部类实现，`builder.build()`

#### 责任链模式 Resp-Chain

涉及角色：**抽象处理者**与**具体处理者**

**具体处理者**可以决定是自己处理还是交给下一个处理着进行处理，或者是自己处理一部分，剩余交个下一个处理者

> 纯与不纯的责任链模式，大多数情况下都是不纯的，即自己处理一部分，剩下的交给下一个处理者

常见实例：`View`的绘制、`Okhttp`的拦截器机制

#### 策略模式 Strategy

把对象和本身的运算规则分开来，和 `if-else/switch` 类似，但是解耦

常见实例：`okhttp` 的 `CacheStrategy`

#### 观察者模式 Observer

也叫发布/订阅模式(Publish/Subscribe)

表示层和数据逻辑层的分离，分为 **推模型**（全部推送）与 **拉模型**（少量推送，剩下的部分有观察者主动获取）

常见实例：`Android Adapter`、`各种Listener`、`BroadcastReceiver`

#### 装饰者模式 Decorate

在不改变原有对象基础上，将功能附加到对象中

常见实例：`Java IO`

#### 适配器模式 Adapter

常见实例：`Java IO` 中 `InputStreamReader` 与 `InputStream`

### 哈希算法

- 散列表、槽、桶

1. 为什么 HashMap 扩容要变成原来两倍？

   保证扩容数组与原数组的老数据的索引位置不会改变

   默认 16，`h&(length-1)`低位全为 1 保证 `h` 的**唯一对应**，使得数组的 index 更为平均

2. put 操作才正式创建数组

- 散列函数`hashCode()`与`equals()`

  重写 equals 必须重写 hashCode，因为 HashMap 是通过 hashCode 查找元素的

- 哈希冲突的解决

1. 开散列法（如`HashMap`的实现，链地址法）
2. 闭散列法

### MD5 加密

安全的散列算法，过程不可逆，只能用穷举法破解

- 加密原理

  512 位分为 16 个 32 位子分组，经过一系列处理变为 4 个 32 位子分组，级联有一个 128 位的散列值

  -> 填充使字节长度 mod512 为 448，填充 1+无数个 0，然后在最后添加一个 64 位的二进制数表示**填充前的字节长度**(512N+448+64)

  -> 4 个 32 位链接变量，主循环 4 轮，每轮进行数次操作，对其中三个做非线性计算然后加上第四个变量，在向右环移数个单位，加上四个变量其中之一并覆盖掉其中之一

- 安全性
  非常难以破解，时间极长。但是可以通过**制定字典**，破解一些数据

  > 主要运用在数字签名、文件完整性验证以及口令加密等方面

### 多线程问题

#### synchronized 与 lock

1. 可中断性：`sync` 的锁**不可被中断**，只能等待锁的释放，而 `lock` 可以被中断

2. 异常释放：sync 出现异常自己就会释放锁，lock 需要 `finally` 中**主动释放**

3. 可获取性：lock 可以通过 `tryLock()`方法知道是否获取锁

4. lock 可以**提高多个线程读操作的效率**

5. sync 使用 Object 的 `wait/notify` 调度机制，而 lock 使用 `condition` 的 `await/signal` 进行调度

   > 当资源竞争非常激烈时，使用 Lock 的性能表现要好于 Sync

6. 性能问题

   某个线程在等待锁的释放的时候需要中断，可中断/可不中断

   能够分开处理一些 wait/notify，Lock 里面的 Condition 就能控制通知哪个线程

---

## Android

---

### Activity 活动 与 Fragment 碎片

#### 活动生命周期与状态

1. 失去焦点（Paused）、进入后台（Stopped）
2. 系统配置发生改变（Destroy 重建），如何避免（`android:configChange`）
3. `onRestart` 与 `onNewIntent`

#### 活动启动模式与任务栈

1. standard
2. singleTop
3. singleTask
4. singleInstance
5. 任务栈 TaskAffinity 的使用

#### Fragment 碎片

- 加载到 Activity 的两种方式

1. `xml` 静态加载
2. `FragmentManager` 获取事务 `transaction`，将 `Fragment` `add` 到事务中，调用 `commit` 开启事务

- 完整生命周期

  -> onAttach

  -> onCreate

  -> onCreateView

  -> onCreate(Activity)

  -> onActivityCreated

  -> onStart(Activity) -> onStart

  -> onResume(Activity) -> onResume(Fragment 完全初始化完毕)

  -> onPause -> onPause(Activity)

  -> onStop -> onStop(Activity)

  -> onDestroyView -> onDestroy(Activity)

  -> onDetach

- Transaction

  内部是一个双向链表的结构，记录我们 add/replace 的碎片

1. add、hide、show 不会走生命周期方法
2. replace 会重新走一遍生命周期的创建
3. addToBackStack() 回退栈方法

- 通信问题

1. `Fragment` 中调用 `getActivity` 获取活动/推荐用接口形式调用(`onAttach` 和 `onDetach` 中绑定解除)

2. `Activity` 调用 `Fragment` 一般是直接通过方法，setArguments 进行传值

3. `Fragment` 互相调用，由 `Activity` 做中转站

- `FragmentPagerAdapter` 和 `FragmentStatePagerAdapter`

  前者会调用 detach，并没有回收内存；后者调用 remove，回收内存。

  所以前者适用于少量页面的情况，后者适用于大量页面的情况

### Service 服务

在托管进程的主线程进行，由系统进程托管，一般服务内开线程进行耗时操作(官方库：IntentService**异步会自动停止**的服务)

#### 重要回调

1. onBind()/onUnbind() 返回 IBinder 进行绑定/解绑服务
2. onCreate() 初始化创建一次
3. int onStartCommand() 返回三种 service 的运行策略，启动服务
4. onDestroy() 销毁

#### 状态

1. 启动状态 startService()
2. 绑定状态 bindService() 转换问题？(启动服务稍微优先)

   > IBinder 实现（仅自己进程）、Messenger（串行 IPC）、AIDL（并行 IPC）三种方式

#### 前台服务和通知发送

`startForeground` 和 `stopForeground`

#### Android 5.0 以上的隐式启动问题

#### 优先级

1. onStartCommand 的返回值 START_STICKY
2. android:priority
3. onStartCommand 提升为前台服务级别

---

### IPC 跨进程通信

#### 基础内容

- 应用情景

  加大应用可使用的内存空间，多个进程的数据共享

  > ContentProvider 也是跨进程通信的

- `android:process` 开启多进程模式
- IPC 将出现的问题

1. 静态成员和单例模式完全失效
2. 线程同步机制完全失效
3. `SharedPreference` 可靠性下降
4. `Application` 多次创建

#### Serializable 与 Palcelable

1. 实现 `Serializable` 接口完成对象的序列化，声明一个 `serialVersionUID` 变量，通过`ObjectOutputStream`和`ObjectInputStream`进行序列化和反序列化

2. 通过 `Palcelable` 实现序列化

   实现 `Palcelable` 接口复写 `describeContent` 方法

   `writeToPalcel` 将对象数据序列化成为一个 `Palcel` 对象

   创建 `Parcelable.Creator<T>` 对象，将 `Palcel` 对象转为正常对象 `T`

3. 性能比较

   `Serializable` 内存使用大，临时变量很多(gc 频繁)，通过 `IO` 流形式进行数据的读写在硬盘上，能比较好的进行数据的持久化

   `Parcelable` 内存使用小，不会产生很多临时变量，通过 `IBinder` 作为信息载体，直接在内存中进行读写，在 `Android` 中性能较优，但持久化上不是很好

#### Binder（AIDL） 代理模式

> 基于 C-S 通信模式。跨进程通信需要在序列化和反序列化数据中不断操作，虽然跨进程中数据是多份的，但是他们底层的 Binder 是同一个对象

在 Android 开发中 Binder 主要使用在 Service 中，包括 AIDL 和 Messenger

基础：用户空间/内核空间与系统调用、管道/Socket、Binder 驱动加载在内核空间运行

1. Binder 通信机制——类似于中转站

   对于 Server 进程，Binder 是本地对象，而对于 Client 进程，Binder 是指代理 Binder 对象

   `ServiceManager`、`Binder Client`、`Binder Server` 与 `Binder驱动`

   -> `Server` 向 `ServiceManager` 注册，生成方法映射表

   -> `Client` 请求 `ServiceManager` 查找，由 `Binder驱动` 其返回一个 `Server Object` 的 `Proxy` 对象

   -> `Client` 调用 `Proxy` 对象的方法，`Binder驱动` 回传给 `Server` 进行调用返回给 `Client`

2. aidl 自动 Build 文件内容

   - 内部类 `Stub` 继承自 `Binder`
   - `Stub`——Binder 的内部代理实现类 `Proxy`
   - `aidl` 接口方法

3. Binder 重要方法

   - `linkToDeath`(客户端设置死亡代理`DeathRecipient`以便重新绑定，服务端实例化`自定义Binder`——`Stub`)
   - `unlinkToDeath`

#### ContentProvider 四大组件之一

为不同的应用间(进程间)数据共享，**提供统一接口**

通过 `Uri` 标识要访问的数据，`ContentResolver` 增删改查进行共享数据的操作，`ContentObserver` 监听数据变化

- Uri 统一资源定位符

  格式：`[scheme:][//host:port][path][?query]`

  > 通过 authority、name、match_code 匹配 Uri，确认身份

- ContentResolver

  内部的 `notifyChange` 方法用来通知监听特定 Uri 的 `ContentObserver` 对象(`registerContentObserver()`)

  query、delete、insert、update 方法，**均在此 Provider 的进程的线程池中执行，而不是在其主线程中**。但是对于调用者而言，还是**可能会产生阻塞**，所以调用者仍要在**子线程**中进行操作

  > 此线程池由 Binder 创建并维护

- ContentObserver

  在其中传递一个 `handler`，在收到数据变化的通知后，回调 `onChange`，发送 handler 消息，在主线程中操作 UI

- 权限与限制

  1. `android:exported="false"` 只有统一应用的组件或者相同用户 ID 的应用程序才能访问
  2. `android:protectionLevel="signature"` 同签名权限
  3. `path-permission` 部分权限开放

- 运行线程、进程问题与 Binder

  默认情况下为单例模式(`android:multiprocess="false"`)，哪个客户端调用的都是同一个 `ContentProvider`

  当调用内部方法时（如 `query`），如果调用者和 `ContentProvider` 在同一进程，则也在同一线程操作；如果不在同一进程，则方法会运行在自身进程的 `Binder` 线程里

  > 注意：无论在不在同一进程中，均会阻塞调用者。**_所以相当于在调用者线程中读取数据（有异议）_**

  一个进程中有 16 个 Binder 线程与远程服务通信交互。ContentResolver 通过 Binder 进程间通信机制进行跨进程跨应用通信，但是 ContentProvider 底层是通过匿名共享内存来实现的

- 问题

1. 他屏蔽了内部对数据存储的细节，只需要关注 Uri，可以跨进程跨应用共享数据，还能操作本地文件；而 sql 只能操作**本进程的数据库**

#### Messenger

1. 是基于 AIDL 的封装，使用更简单，**_暂略_**

#### Socket

1. 一种基于 C-S 通信机制的跨进程通信方式，使用管道，采用存储转发方式，一次通信的数据拷贝次数为 2，传输效率低下，且开销很大

2. 主要用于跨网络进程通信和本机进程的低速通信

---

### Context 上下文

Activity、Service、Application 三种

1. 优先使用`Application`的 Context(`getApplicationContext()`)
2. 内存泄漏引用问题：不要让生命周期长于 Activity 的对象持有到 Activity 的引用。
3. 尽量不要在 Activity 中使用非静态内部类(理由见 2)，如果硬要使用(如`Handler`)，则应该使用弱引用`WeakReference`

---

### BroadcastReceiver 广播接收者

1. 广播接收器运行在主线程，不能进行耗时操作
2. 静态注册 Manifest(常驻广播) 与 动态注册(onResume/onPause)

#### 广播发送与类型

1. 普通广播
2. 系统广播
3. 有序广播 sendOrderedBroadcast()，按照 priority 以及动态与否排序
4. 应用内广播

   exported:false、权限验证、指定包名

   `LocalBroadcastManager`

5. 粘性广播 5.0 以上已失效

---

### View 视图 UI

#### 事件分发

应用层从 `Activity->Window->View`

`ViewGroup事件分发` 责任链模式

- 最主要的三个方法

1. dispatchTouchEvent()
2. onInterruptTouchEvent()
3. onTouchEvent()

- 流程：总是由高层向低层传递，由父类向子类传递，最后再原路返回，整体事件分发呈**U 型**

  -> `(ViewGroup)dispatchTouchEvent`

  -> `(ViewGroup特有)onInterceptTouchEvent`

  -> `(View)dispatchTouchEvent` 和 `requestDisallowInterruptTouchEvent`

  -> `(View)onTouchEvent` return true 则消费掉不再向上传递

  -> `View`的事件分发开始

  注：先处理`ACTION_DOWN`之后是`UP & MOVE`

`View事件分发`(已经没有子 View 的 View)

1. dispatchTouchEvent()
2. onTouchEvent()
3. onTouch()
4. performClick() / onClick() / onLongClick()

> 至此，xy 方向的滑动冲突的解决也就很简单了(如`ViewPager`和`ListView`)

#### View 的绘制流程

`Activity` -> `PhoneWindow` -> `DecorView` -> `TitleActionBar`/`ViewGroup` -> `View`

每个 View 负责绘制自己

- 步骤

1. 通过`WindowManager`将`DecorView`传入`ViewRootImpl`
2. `ViewRootImpl`中 `requestLayout()`

   ->`scheduleTraversals()`发送绘制的 Message

   ->`performTraversals()`执行下列方法

   -> 对于每个 ViewGroup 的所有子 View 进行如下操作

3. `Measure` 测量(大小)
4. `Layout` 布局(位置)
5. `Draw` 绘制

- 关键类/方法

1. MeasureSpec 测量这个 View 的方式

   > 测量方式： `EXACTLY`(match_parent&具体数值)/`AT_MOST`(wrap_content)

2. Measure 计算这个 View 的实际大小(`performMeasure()`)，`measure方法`最终的测量有`View`的回调`onMeasure`实现

3. Layout 用来确定 View 在父容器的布局位置(`performLayout`)，`layout方法`最终的测量有`View`的回调`onLayout`实现（注：View 中为空实现，在 ViewGroup 中有实现）

4. Draw 用来将这个控件绘制出来，从`performDraw`开始，调用每个 View 的`draw(canvas)`方法
   > **绘制流程**：背景(`drawBackground`)->`Canvas层`->内容(`onDraw`)->子 View(`dispatchDraw()`)->显示效果&恢复图层(`onDrawForeground`)->各种装饰物

- 其他的东西

1. getMeasureWidth 和 getWidth 的区别与使用？

   只有在测量过程和布局计算时，使用 getMeasureWidth；在 Layout 之后才使用 getWidth 获取

2. 在 Activity 中获取 View 宽高的方式

   `view.post`/`ViewTreeObserver`/`onWindorFocusChanged`

#### RecyclerView 和 ListView

机制：LayoutManager 从 Recycler 中获取已经绑定数据的 Item 显示，并将不需要的 Item 丢给 Recycler 回收；Adapter 用于数据绑定 Item，供 Recycler 获取

1. `LayoutManager` 管理子 `View` 布局，接管绘制`RecyclerView` 的 `onMeasure`、`onLayout`、`onDraw`
2. `Recycler` 缓存（View 的循环回收利用）
3. `Adapter` 数据、Item 生成与绑定
4. `ViewHolder` 包装器，用于 Adapter 进行数据绑定
5. `ItemDecoration` 装饰物 UI
6. `ItemAnimator` 动画 UI

- 多级缓存回收/复用机制

  1. `Scrap`布局期间进入临时分离状态的子视图，存放 detached 的视图

     分为`AttachedScrap`(无修改)和`ChangedScrap`(有修改)

  2. `Recycle`先前使用特定位置的视图放置在高速缓存中以便重用，从而跳过初始化步骤（`CachedView`），存放`removed`的视图，但仍然存一些信息（比如 pos、state），再次重用不需要重新绑定

  3. `RecyclerPool`，不仅仅是`removed`还是“恢复出厂设置”的视图，需要重新绑定

  4. `ViewCacheExtension` 扩展缓存，由开发者实现

  5. `HiddenView`，不在`Recycler`中，用于缓存被隐藏的 Item

- 从无到有的缓存复用过程
  在 `onMeasure` 中进行一系列的缓存查找和创建初始化

  -> `ChangedScrap` 一级缓存，**预布局阶段**

  -> `AttachScrap` 一级缓存

  -> `HiddenView` 不在 Recycler 里的“缓存”，一般为动画过渡作用

  -> `CachedView` 一级缓存

  -> `ViewCacheExtension` 二级缓存

  -> `RecyclerPool` 三级缓存，多个 RecyclerView 共用

  -> 没有找到任何缓存，进行初始化 ViewHolder

- 滑动时缓存过程

  -> remove 掉放入 CachedView

  -> 满了放入 Pool 中，并重置

- 数据更新时的缓存过程

  `notifyDataSetChanged()`将所有 view 放入 Pool 中重新绑定数据，由于 Pool 的容量限制就可能会重新创建新视图造成性能的损失

  > `hasStableIds()` 返回 true 将缓存放入**Scrap 或 CachedView**中 提高效率，而`notifyDataSetChanged()`设置了`hasStableIds`为**false**，故会将 view 放入 Pool 中

  `notifyItemChanged()`只将某些 View 放入`ChangedScrap`和`AttachedScrap`中

- 性能的优化与缓存相关

  本质：减少 onCreateViewHolder 和 onBindViewHolder 的调用次数和时间，**用缓存减少调用次数，用预加载减少调用时间**

  > 命中一级缓存，无需调用创建和绑定方法

  1. 减少调用次数通过缓存实现
  2. 减少调用时间

     `onCreateViewHolder` 减少 View 层级，尽量避免使用`ConstraintLayout`

     `onBindViewHolder` 减少`ImageView`渲染时间，非 UI 显示操作后移，**添加延迟任务、图片请求加载延迟；快速滑动时，加入 Scroll 监听，停止加载数据**

#### 自定义 View 相关 模板方法模式

- 构造器 4 种
- 自定义属性 `res/values/attrs.xml`
- 类型

1. 自定义组合控件 组合方便复用

   自定义属性，构建布局，在`View`中引用(`LayoutInfluter`)

2. 继承系统控件

   扩展功能，可复写`onDraw`

3. 直接继承 View

   可复写`onDraw`、`onMeasure`

4. 直接继承 ViewGroup

   可复写`onDraw`、`onMeasure`、`onLayout`，并轮训子 View 绘制（`measureChildren`与`setMeasuredDimension`），扩展性极强

---

### 内存泄漏相关

根本原因：**短生命周期对象**释放时，被**其他对象一系列的引用**导致无法及时释放，长时间以来会出现 OOM(Out Of Memory)

#### 主要情况

1. 监听器，注册/注销问题(比如`广播`、`listener`)
2. 数据/资源连接(如`数据库`，`IO`，`cursor`)
3. 非静态内部类(匿名)会持有对外部类的引用(如`Handler、Thread`)
4. 静态变量，因为静态变量的生命周期和应用的生命周期一样长(如`静态View、单例、静态Activity`)

> PS：静态内部类不持有引用，如果要使用外部类的方法，需要使用`WeakReference`

#### debug/测试方法

1. `MemoryMonitor`
2. `LeakCanary`

#### 避免

1. `非静态内部类`替换为`静态内部类+WeakReference`，尽可能不要在匿名内部类中进行异步操作
2. 尽量使用`Application`的`Context`
3. 在正确的时候(如`Activity`的`onStop`、`onDestroy`中)，及时清理关闭可能出现引用导致无法释放内存的资源
4. 为`WebView`开启另一个**进程**，通过`AIDL`通信

---

### Handler

跨线程通信

> 设计模式：Message 的享元模式

#### 四个对象

1. Handler 发送和处理消息
2. Looper 从消息队列中取出消息，并且发送给 Handler
3. MessageQueue 存储消息，内部由**单链表**实现
4. Message 发送的消息本身，携带数据

#### 基本工作流程

`Looper.prepare()` 初始化循环 Looper(当前线程的)以及 MessageQueue

> 一个线程只能有一个 Looper 和一个消息队列，但是 Handler 是不限的，他们会公用一个 Looper 和消息队列，线程存储 Looper 的主要逻辑是通过`ThreadLocal`实现的

-> `new Handler()` 通过`Looper.myLooper()`初始化 Looper

> Handler 对象在哪个线程下构建（Handler 的构造函数在哪个线程下调用）

-> `Looper.loop()` 进入循环消息队列的读取，直到消息队列为空

> 如果在子线程中初始化会为 null，需要`Looper.prepare()/loop()`初始化；在主线程中会在`ActivityThread`中自动创建一个`Looper`

-> (Handler) `sendMessage` 发送消息

-> (Handler/MessageQueue) `enqueueMessage` 将消息放入消息队列，并设置`msg.target`

-> (Looper 循环/MessageQueue) `queue.next()` 取出消息

-> (Looper 循环) `msg.target.dispatchMessage` 传回 Handler 处理消息

-> (Handler) `handleMessage` 处理消息

#### 其他小问题

1. `handler` 中的 `post` 和 `sendMessage` 有什么区别？

   本质没区别。源码上，最终都调用`sendMessageAtTime` -> `enqueueMessage` -> ......`dispatchMessage`

2. `Looper.loop()`是一个死循环但是为什么没有阻塞？

   在 `ActivityThread` 中启动了一个主线程的 `Handler`，此 Handler 处理了 Activity 各种情况的信息，所以说其实这个 `Handler` 一直在处理消息，相当于没有阻塞，**只要不出现某个消息处理时间很长出现堵塞**

3. `ThreadLocal` 的原理

   目的：在多线程程序中,同一个线程在某个时间段只能处理一个任务.我们希望在这个时间段内,任务的某些变量能够和处理它的线程进行绑定,**在任务需要使用这个变量的时候,这个变量能够方便的从线程中取出来**

   > 此对象建议为`static`，保证不会产生很多`Entry`

   - `ThreadLocalMap` 存储与这个线程绑定的变量 `<ThreadLocal,Entry<Obj>>`，Android 中用类似数组实现的 Entry

     > **一个线程可以有多个 ThreadLocal 来存储多个变量**，一个线程所存储的多个变量全部存储到一个`ThreadMap`(`Values`)中

   - 在 `Looper.prepare()` 中，通过 set 方法将 `Thread` 和 `Looper` **绑定**起来

---

### Framework&启动流程

#### Framework 架构

- 经典四层架构

1. `Application` 应用层
2. `Application Framework` 应用层框架
3. `Libraries`、`Android Runtime`(`Core Libraries`、`Dalvik VM`) 核心库及运行时
4. `Linux Kernel` Linux 内核

- 按照功能划分模块

1. `App` 系统 UI、Launcher 启动
2. `Java Framework` (System Service)

   进行 `AMS`(ActivityManagerService)与 `PMS`(PowerManagerService) 等`Service`的初始化

3. `C++ Framework` (Media) 与 `Java` 核心层通过 `JNI`(Android Runtime) 通信
4. `Native` 与 `kernel` 通信通过`系统调用 Syscall`

   用户守护进程(`daemons`)、初始化进程、`HAL 层`(和 Kernel 驱动相关)、开机动画等

5. `Kernel` 安卓内核层
6. `Loader` Boot Rom 以及 Boot Loader

#### 系统启动流程

1. `BootLoader`

   在操作系统内核运行之前运行，用于初始化硬件设备、建立内存空间的映射图，保证系统软硬件进入一个合适的状态

2. `Kernel` 初始化

   Kernel 进程，Linux 下有三个进程

   `idle` 进程 由系统自动创建，运行在内核态

   `init` 进程 由 idle 通过 kernel_thread 创建，完成系统的初始化

   `kthreadd` 进程 由 idle 创建，始终运行在内核空间，用于内核线程的调度管理

3. `init` 完成系统初始化，分裂出很多守护进程`daemons`
4. `Zygote` 孵化器初始化

   初始化第一个 VM，预加载 framework 和众多通用资源，便于孵化出新的 VM 进程来管理启动的 APP 进程

5. `SystemServer` 超级管理进程启动

   调整时间、设置语言

   初始化 `Looper`、装载库 libandroid_server.so

   初始化系统 `Context`

   创建 `SSM`(SystemServiceManager)负责系统 Service 启动，启动系统核心服务

   创建启用 java 服务

   调用 `Looper.loop()` 主线程循环

6. `AMS/PMS` 启动
7. `Launcher` 启动 `Home` 进程

#### 应用启动流程

- 创建进程

1. `Launcher`
2. `AMS` 通知 `Zygote` 孵化自身 `VM`，同时创建新进程
3. `Zygote`孵化出一个新的 VM 进程，并实例化`ActivityThread`对象
4. `ActivityThread` 进行 Looper.prepare() 和 Looper.loop() 开始循环

- 绑定应用

  将进程和 Application**绑定**，通过`ActivityThread`的`bindApplication`发送一个`BIND_APPLICATION`到消息队列，然后`加载classes到内存`中

- 启动 Activity

  发送启动消息`LAUNCH_ACTIVITY`到消息队列

---

### Android 性能优化

#### ANR

只有主线程(UI)才会 ANR，发生了某些输入时间导致一段时间未响应

- 原因

1. 主线程中执行耗时操作——需开辟新线程
2. 其他程序进程占用 CPU 导致本进程无法获得 CPU 时间片(大量的数据读写)
3. 线程持有锁，等待超时，join、sleep、wait 等
4. service 忙无响应(应避免在 Service 中进行耗时操作，除非开辟线程)

- 定位与分析

  Logcat 日志或/data/anr/traces.txt 文件(通过 AMS 写入)

  log 分析：原因、进程 id、进程包名、CPU 使用率/IO wait

  traces 分析：线程的调用栈

- 严格模式？

#### OOM

- 原因

1. 加载对象过大
2. 相应资源过多，来不及加载
3. 内存泄漏问题

- 解决

1. 内存引用处理，比如软、弱引用
2. 防止内存泄漏等方法，见上述 **内存泄漏**
3. 内存中加载图片直接在内存中处理(如边界压缩)

   常用框架如`Glide`内部也对 OOM 处理也做了封装

4. 动态回收内存
5. 优化 Dalvik 虚拟机的堆内存分配
6. 自定义堆内存大小

- 如何避免

1. 使用更加轻量的数据结构，如 `ArrayMap`(**用数组存储 Map，key 和 value 都在一个数组，且通过缓存机制，避免了频繁的创建数组带来的内存消耗)**/`SparseArray`(**延迟删除机制，gc 一次性压缩空间**)
2. 避免使用 Enum 枚举
3. 减少 Bitmap 内存占用，decode 方式以及压缩比
4. 使用更小的图片
5. 避免在 onDraw 中进行对象的创建，因为 onDraw 需要频繁调用，会导致内存抖动
6. StringBuilder 拼接
7. 内存策略优化：合理设计 cache 大小，少用 static 对象，优化布局层次、珍惜 Service 资源，Proguard 对代码进行压缩、优化和混淆

#### Bitmap 大图片处理（下采样）

1. 获取图片的宽高 `BitmapFactory.Options`
2. 按照压缩大小得到图片压缩比 `inSampleSize` 传入 `Options`（2的幂）
3. `BitmapFactory.decodeResource`

   > 内部核心方法 decodeStream()

### Android 设计框架

1. MVC

   - `Model`(数据处理的操作，如**网络、数据库**)
   - `View`(`XML`)
   - `Controller`(`Activity`和`Fragment`)

   > 缺陷：`Controller`业务逻辑繁琐，臃肿

2. MVP

   - `Model` 数据操作
   - `Presenter` 核心业务逻辑集中在此处，取消了 `View` 和 `Model` 间的耦合，作为 `View` 和 `Model` 沟通的媒介
   - `View` 由 `Activity`/`Fragment`/某个 `View` 担任

     在 `View` 层中，有一个 `Presenter` 的成员变量，需要实现一个接口将 `View` 层的业务操作转交给 `Presenter` 层进行操作

   - 使用建议

   1. 接口规范化
   2. 第三方插件生成（`Dagger`）
   3. 简单的页面不使用 MVP
   4. 根据复杂程度选择

3. MVVM

   - `Model`
   - `View`
   - `ViewModel` 其中 `View` 和 `Model` 数据双向绑定

   > `Google` 自带 `DataBinding` 框架，但是还不完善

---

### SharedPreference

#### 整体流程

-> 在 `ContextImpl` 中获取 `SharedPreference` 对象，线程安全

先尝试命中缓存，如果没有则生成对象并放入缓存，如果命中则需判断是否为**多进程模式**，如果有则重新读取文件

-> `new SharedPreferenceImpl(file,mode)`

创建备份文件 bak，初始化 mMap、mFile、mMode，最后加载磁盘上的 xml 文件

-> `startLoadFromDisk()` 加载磁盘上的 xml 文件

**新建了一个线程** 异步加载数据，loadFromDisk()

1. 如果有备份文件，**回滚备份**
2. 调试文件是否可用(exists/canRead)
3. 读取文件，赋值 map
4. 加载数据成功，赋值 mMap、时间戳和文件大小(用于多线程校验)，最后 notifyAll()

#### 读取操作

1. get 线程安全

   `awaitLoadedLocked方法` 锁 `loaded` 挂起，直到加载完数据(loaded 为 true，`notifyAll`后)才进行数据的获取，直接进行 `map.get(key)`

2. put、remove、clear

   `SharedPreferences.Editor`，实现类 `EditorImpl`

   均不是直接操作 `mMap` 的，而是将所有的操作放入 `mModified(newMap)`中，直到之后进行 apply/commit 方法才写入磁盘

3. 同步 `commit`/异步 `apply`

- `commit` 将 `mModified` **同步**到内存的 `mMap` 中(`commitToMemory`)，然后写入磁盘(`enqueueDiskWhite`)，**并直接 await 挂起**，同步完成后通知观察者，返回 true

  > `commitToMemory` 中 `clear` 会清空 `mMap`，而不会清空 `mModified`，按照流程 `mModified` 的内容仍然会赋值给 `mMap`，所以`putXXX().clear().commit()`是错误的

- `apply` 同样地，将 `mModified` **同步**到内存的 `mMap` 中(`commitToMemory`)，将写入磁盘的方法放入异步线程中

#### 其他

1. `SharedPreference` 的线程安全，但不是进程安全
2. 首次 `getSharedPreference` 会开辟新线程异步加载，**同时阻塞所有 set/get 方法**，之后调用时直接从缓存中获取
3. get 操作均在内存中 mMap 上进行，同时 commit/apply 都是**_同步到内存 mMap_** 的，只是写入磁盘的方式不同
4. MODE_MULTI_PROCESS 多进程模式是通过时间戳和文件大小判断的，并不能保证多进程数据实时同步

> **一定不要在多进程环境中使用** `SharedPreference`，频繁的读写会导致损坏错误；而且**SP 文件不能过大**

## 项目相关

### okhttp

#### 网络请求流程

同步：`client.newCall(request).execute()`

异步：`client.newCall(request).enqueue(callback)`

- 同步请求流程

  -> (`RealCall` 请求的真正执行者) `execute()`

  -> 将 `call` 加入同步请求队列

  -> 设置一系列拦截器 `Interceptor`，`getResponseWithInterceptorChain()`生成`Chain`

  > 拦截器诸如：重试/重定向功能、桥拦截器(`BridgeInterceptor`)、缓存拦截器、建立连接以及读取响应数据的拦截器(`CallServerInterceptor`)，调用顺序从自定义拦截器开始

  -> `chain.proceed(request)`责任链模式，链式调用

  > Okhttp3 通过拦截链的设计，每个拦截器各司其职，我们可以自定义拦截链，像打印日志，统一添加 header 等等，都是通过添加拦截器实现

- 异步请求流程

  -> `enqueue(callback)`

  -> `client.dispatcher().enqueue(AsyncCall(callback))`，在 `AsyncCall` 中实现 `NamedRunnable` 接口，复写 `execute` 方法

  -> `execute` 中进行`getResponseWithInterceptorChain()`方法，通过返回响应结果判断是 `onResponse` 还是 `onFailure`

#### 拦截器

1. `RetryAndFollowUpInterceptor` 重试失败及重定向拦截器

2. `BridgeInterceptor` 桥拦截器，添加或移除 `Header`，`gzip`压缩等

3. `CacheInterceptor` 缓存拦截器，根据缓存策略 `CacheStrategy` 判断是否返回缓存数据，以及是否将请求数据缓存起来

   > 不需要走网络 或者 `code 304` 会使用缓存，不缓存非 `GET` 的请求

   - 缓存策略 `CacheStrategy` 策略模式
   - 缓存的实现 `DiskLruCache`

4. `ConnectInterceptor` 连接池，缓存 http 连接，从连接池中取连接进行复用，省去三次握手的时间（分配一个`Connection`和`HttpCodec`，为下次连接做准备）

   - `StreamAllocation` 流分配，初始化在第一个拦截器里

     内部有 连接池`ConnectionPool`、地址、线路选择器`RouteSelector`

   - (`StreamAllocation`)newStream()方法

     返回解编码类对象 `HttpCodec`，内部从连接池中获取健康有用的连接 `RealConnection`

   - `findHealthyConnection`

     死循环获取可用连接 `findConnection`

     -> 前置判断是否已经释放、取消等

     -> 1) 尝试用现在的连接，有则返回；否则尝试从连接池中获取可用的路由

     -> 2) 通过获取的路由，再去连接池取，有则直接返回；如果仍没有连接，则新建一个

     -> 进行连接操作(Socket)

     -> 将此连接放入连接池

5. `CallServerInterceptor` 发送和接收数据，责任链的最底端，U 型调用 `HttpCodec`
   `response.newBuilder().body(httpCodec.openResponseBody(response)).build()`

   > `openResponseBody(response)` 内部是通过 `Okio` 去请求网络获取数据的

#### Dispatcher 线程池

1. 单例线程池 `ExecutorService`

   具有最大存活时间，以及工作队列 `Deque`

2. 请求队列 `Deque<AsyncCall>` 与 `Deque<RealCall>`

   > 共三个队列、一个线程池：同步请求队列、异步请求队列、待访问请求队列

3. 如果当前还能执行一个并发请求，则放入请求队列，否则放入准备区队列

   特点：

   1. 实现高并发、低阻塞的调度线程池 `Dispatcher`
   2. `Deque` 作为缓存，先进先出
   3. try/finally，调用 `finished` 方法，而不是采用锁来控制调用顺序

#### 设计模式相关

1. `OkhttpClient` 单例模式
2. 建造者模式 `OkhttpClient` 的构建
3. 工厂方法模式 `Call` 提供了内部接口 `Factory` 实现动态配置
4. 责任链模式 拦截器的拦截过程
5. 策略模式 `CacheStrategy`
6. 享元模式 `Dispatcher` 线程调度者，实现对象复用

### Retrofit

### Glide

链式调用，流式编码模式

#### 主入口

1. `RequestManager`

   > 由 `Glide.with(...)` 返回

   管理和启动 `Glide` 的所有请求

   可以使用 activity、fragment 或者连接生命周期的事件去停止、启动、重启请求

2. `RequestBuilder`

   通用类，设置配置选项

   - `transition` 处理加载对象占位符或者缩略图到真正图像的转场动画问题
   - `load` 加载数据对象，支持很多类型
   - `into` 触发 `Request` 真正启动的地方

#### 结构

1. `ModelLoader` load 方法中的各个 model
2. `DataFetcher` 数据获得者
3. `Target` into 方法的对应目标
4. `Resource` 各种数据资源
5. `ResourceTransformation` 资源内部转换
6. `Pool` bitmap 资源池，复用和主动回收
7. `Cache` 缓存池
8. `Decoder/Encoder` 解/编码器

#### 异步加载

线程池：GlideExecutor

加载源文件、硬盘缓存和动画三个线程池

#### 切换线程

图片异步加载成功，在主线程更新 View

在 Glide 中也是使用 Handler 进行线程的切换

#### 缓存问题

三级缓存机制：活跃资源、内存、硬盘三级缓存

1. `DiskCacheStrategy` 缓存策略

2. 通过**键值对**的方式进行缓存

- `ActiveResource` 是一个弱引用的 Map

  > 当图片加载时，会放入 `ActiveResource`，当图片的生命周期结束时，放入 `MemoryCache`，也就是内存缓存中

- 内存缓存 `LruCache`

  > 内部用 `LinkedHashMap` 实现

- 磁盘缓存 `DiskLruCache`

#### 生命周期管理

- ImageView 的内存泄漏问题

  在 Glide 中，用 `WeakReference` 修饰 `ImageView` 解决了此问题

  同时为了保证加载任务的及时取消，Glide 也进行了生命周期的管理(`with(context)`)

- 流程

  -> with 方法绑定

  -> **新建一个没有视图的 RequestManagerFragment**，持有一个 lifecycle，通过此 `Lifecycle` 通知 `RequestManager` 进行生命周期的操作

  -> `onStart` 继续加载/`onStop` 暂停加载/`onDestroy` 停止加载并清除

#### 图片加载 OOM

1. 软引用 `SoftReference`
2. `Glide` 中使用 `onLowMemory` 回调防止 OOM
3. 图片压缩方法
4. 基于 `Bitmap` 的存储位置

   压缩图片，将像素数据不放入`Java堆`中，转而放入`native堆`中（`Android 8.0` 以上的 Bitmap）
