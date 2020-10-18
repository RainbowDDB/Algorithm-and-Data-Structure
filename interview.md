- [操作系统](#操作系统)
  - [线程与进程](#线程与进程)
    - [调度](#调度)
    - [进程间通讯 IPC](#进程间通讯-ipc)
    - [死锁与饥饿](#死锁与饥饿)
  - [内存管理](#内存管理)
    - [物理内存与虚拟内存](#物理内存与虚拟内存)
    - [页面置换算法与缓存思想](#页面置换算法与缓存思想)
    - [分页系统设计](#分页系统设计)
  - [编译与程序执行](#编译与程序执行)
    - [编译原理](#编译原理)
    - [内存模型结构](#内存模型结构)
  - [安全与加密](#安全与加密)
    - [密码学](#密码学)
- [Linux](#linux)
  - [常见命令](#常见命令)
  - [进程管理与线程](#进程管理与线程)
  - [Linux 内存管理](#linux-内存管理)
  - [IO](#io)
  - [文件系统](#文件系统)
  - [安全性与权限](#安全性与权限)
- [计网](#计网)
  - [HTTP/HTTPS](#httphttps)
  - [HTTPS 加密](#https-加密)
  - [缓存](#缓存)
- [Java](#java)
  - [JVM 内存模型](#jvm-内存模型)
    - [五大区域](#五大区域)
    - [GC 垃圾回收机制](#gc-垃圾回收机制)
    - [性能监控&调优](#性能监控调优)
    - [类加载](#类加载)
    - [字节码执行引擎](#字节码执行引擎)
    - [引用](#引用)
    - [内存模型与线程](#内存模型与线程)
    - [线程安全与锁优化](#线程安全与锁优化)
  - [设计模式](#设计模式)
    - [原则](#原则)
    - [单例模式 Singleton](#单例模式-singleton)
    - [工厂方法模式/简单工厂模式 Factory](#工厂方法模式简单工厂模式-factory)
    - [建造者模式 Builder](#建造者模式-builder)
    - [责任链模式 Resp-Chain](#责任链模式-resp-chain)
    - [策略模式 Strategy](#策略模式-strategy)
    - [观察者模式 Observer](#观察者模式-observer)
    - [装饰者模式 Decorate](#装饰者模式-decorate)
    - [适配器模式 Adapter](#适配器模式-adapter)
    - [代理模式 Proxy](#代理模式-proxy)
    - [外观模式 Facade](#外观模式-facade)
  - [哈希算法](#哈希算法)
  - [IO 与 NIO](#io-与-nio)
    - [类型](#类型)
    - [字节流与字符流](#字节流与字符流)
    - [节点流与处理流](#节点流与处理流)
    - [对象流与序列化](#对象流与序列化)
    - [NIO](#nio)
  - [多线程问题](#多线程问题)
    - [synchronized 与 lock(ReentrantLock)](#synchronized-与-lockreentrantlock)
    - [乐观锁与悲观锁](#乐观锁与悲观锁)
    - [自旋锁](#自旋锁)
    - [偏向锁](#偏向锁)
    - [重量级锁与轻量级锁](#重量级锁与轻量级锁)
    - [死锁](#死锁)
    - [线程池](#线程池)
    - [concurrent 包](#concurrent-包)
  - [泛型](#泛型)
  - [注解](#注解)
    - [应用](#应用)
    - [注解类型](#注解类型)
  - [依赖注入](#依赖注入)
- [Android](#android)
  - [Activity 活动 与 Fragment 碎片](#activity-活动-与-fragment-碎片)
    - [活动生命周期与状态](#活动生命周期与状态)
    - [活动启动模式与任务栈](#活动启动模式与任务栈)
    - [Fragment 碎片](#fragment-碎片)
  - [Service 服务](#service-服务)
    - [重要回调](#重要回调)
    - [状态](#状态)
    - [前台服务和通知发送](#前台服务和通知发送)
    - [优先级](#优先级)
    - [IntentService](#intentservice)
  - [IPC 跨进程通信](#ipc-跨进程通信)
    - [基础内容](#基础内容)
    - [Serializable 与 Palcelable](#serializable-与-palcelable)
    - [Binder（AIDL） 代理模式](#binderaidl-代理模式)
    - [ContentProvider 四大组件之一](#contentprovider-四大组件之一)
    - [Messenger](#messenger)
    - [Socket](#socket)
  - [Context 上下文](#context-上下文)
  - [BroadcastReceiver 广播接收者](#broadcastreceiver-广播接收者)
    - [广播发送与类型](#广播发送与类型)
    - [实现机制](#实现机制)
  - [View 视图 UI](#view-视图-ui)
    - [层次模型](#层次模型)
    - [事件分发](#事件分发)
    - [绘制流程](#绘制流程)
    - [RecyclerView 和 ListView](#recyclerview-和-listview)
    - [自定义 View 相关 模板方法模式](#自定义-view-相关-模板方法模式)
  - [多线程通信](#多线程通信)
    - [Handler](#handler)
    - [AsyncTask](#asynctask)
    - [HandlerThread](#handlerthread)
  - [Framework](#framework)
    - [Framework 架构](#framework-架构)
    - [系统启动流程](#系统启动流程)
    - [Syscall](#syscall)
    - [JNI](#jni)
    - [AMS](#ams)
    - [WMS](#wms)
    - [PMS](#pms)
    - [IMS](#ims)
  - [Android 操作系统](#android-操作系统)
    - [应用启动流程](#应用启动流程)
    - [APK 打包流程](#apk-打包流程)
    - [虚拟机](#虚拟机)
    - [进程管理](#进程管理)
  - [Android 性能优化](#android-性能优化)
    - [ANR](#anr)
    - [内存泄漏](#内存泄漏)
    - [OOM](#oom)
    - [Bitmap 大图片处理](#bitmap-大图片处理)
    - [MemoryMonitor](#memorymonitor)
    - [绘制优化](#绘制优化)
    - [总结](#总结)
  - [Android 设计框架](#android-设计框架)
    - [MVC](#mvc)
    - [MVP](#mvp)
    - [MVVM](#mvvm)
  - [数据持久化](#数据持久化)
    - [SharedPreference](#sharedpreference)
    - [SQLite](#sqlite)
    - [文件](#文件)
  - [动画](#动画)
    - [动画类型](#动画类型)
    - [补间动画 Tween](#补间动画-tween)
    - [逐帧动画 Frame](#逐帧动画-frame)
    - [属性动画 Property](#属性动画-property)
  - [最新技术](#最新技术)
    - [断点续传](#断点续传)
    - [热更新](#热更新)
- [项目相关](#项目相关)
  - [okhttp](#okhttp)
    - [网络请求流程](#网络请求流程)
    - [拦截器](#拦截器)
    - [Dispatcher 线程池](#dispatcher-线程池)
    - [设计模式相关](#设计模式相关)
    - [Okio](#okio)
  - [Retrofit](#retrofit)
    - [初始化流程](#初始化流程)
    - [执行器与适配器](#执行器与适配器)
    - [解析器 Converter](#解析器-converter)
    - [回调执行器 Executor](#回调执行器-executor)
  - [Gson](#gson)
  - [Glide](#glide)
    - [主入口](#主入口)
    - [结构](#结构)
    - [异步加载](#异步加载)
    - [切换线程](#切换线程)
    - [缓存问题](#缓存问题)
    - [生命周期管理](#生命周期管理)
    - [图片加载 OOM](#图片加载-oom)
  - [EventBus](#eventbus)
    - [三大角色](#三大角色)
    - [线程模型](#线程模型)
    - [流程](#流程)
    - [粘性事件](#粘性事件)
    - [索引优化](#索引优化)

---

## 操作系统

### 线程与进程

> 进程是操作系统资源分配的最小单位，线程是 CPU 调度的最小单位

1. 开销方面：每个进程都有独立的代码和数据空间，而一个进程的**所有线程共享代码和数据空间**，每个线程都有**独立的方法栈**

2. 所处环境：操作系统中能运行多个进程，一个进程中运行多个线程，通过 `CPU 调度`每个 `CPU 时间片`只有一个线程进行

3. 内存分配，操作系统为每个进程分配内存空间，除 CPU 外，操作系统不会为线程分配空间

4. 线程相当于轻量级的进程，OS 的创建、维护开销自然小

5. 线程没有地址空间，其包含在进程的地址空间中，一般来说，每个线程上下文包含一个**堆栈、寄存器、程序计数器**、以及调度相关的东西

#### 调度

- 进程调度

  用户态与内核态的切换，一般分为**IO 密集型**和**计算密集型**

  根据如何处理中断又分为抢占式和非抢占式

  **抢占式**：运行到指定时间直接挂起调度其他线程

  **非抢占式**：运行直至阻塞，或者运行结束自动释放 CPU

1. 批处理系统：先来先服务、最短作业优先/最短剩余时间优先
2. 交互式系统：轮转调度（设置时间片）、优先级调度、最短进程调度、彩票调度
3. 实时系统的调度：周期性事件流

- 线程调度

  用户级线程与内核级线程（由 OS 实现），性能差别

  > 注意在 JVM 中，**线程**是采用**轻量级进程**来实现的，通过其进行与内核的交互，使用的实际上是**内核进程的调度模式**

  轮转调度与优先级调度

#### 进程间通讯 IPC

1. 管道 匿名管道

   内核中一块固定大小的缓冲区，可以进行进程间通信

   同步互斥机制，半双工模式（单向），两个管道实现双向通信，仅可以在**父子、兄弟**进程间通信

2. FIFO 命名管道

   可以在无关进程间先进先出地交换数据，速度很慢

3. 消息队列

   内核中一个数据报消息队列，不同进程可以通过句柄访问此队列

   允许多个进程写入读取，可实现双向通信

4. 共享内存

   将同一块物理内存映射到不同进程的虚拟内存空间中，实现内存资源对多进程的共享

   > 内存拷贝次数最少 0 次，为最快的方式。另外，其他常规方式一般从**用户-内核-用户**需要拷贝两次

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

7. Binder(Android 进程通信机制) [详情见下](#binderaidl-代理模式)

   **CS 架构**，通过`mmap`映射，**仅一次拷贝**，Binder 驱动通过`ioctl`系统调用进行一系列的处理

#### 死锁与饥饿

- 死锁四大条件

  互斥、占有等待、不可抢占、循环等待

- 恢复——出现死锁后恢复
- 避免——银行家算法（安全状态与不安全状态）

  > 缺乏实用价值，因为很少有进程/线程能够知道自己所需资源的最大值

- 预防——四大条件破坏

1. **无法**破坏互斥
2. 占有等待：一次性申请全部资源
3. 不可抢占：`tryLock`，获取不到直接继续进行释放资源
4. 循环等待：根据业务逻辑，修改资源的获取顺序

- 活锁

  tryLock 重复尝试，虽然不会造成死锁，但是仍然卡着没有工作

- 饥饿

  同样是和活锁非常类似，不会造成死锁，但是会一直获取不到资源卡住，无限制延后执行

### 内存管理

#### 物理内存与虚拟内存

操作系统在内存管理上采用存储器地址空间来管理，为了能容纳更大的程序指令空间，系统采取**虚拟内存**的方式，将指令通过**页表进行分页**，程序会有更大的虚拟地址空间（**通过页表在虚拟内存和内存中进行映射**）

当某些虚拟内存的页面没有映射到物理内存，系统将会产生缺页中断

- 加速分页过程

  大多数程序总是对少量的页面进行多次的访问，故将少量的页面不通过页表，直接映射，建立快表 `TLB`

- 大内存页表 多级页表

#### 页面置换算法与缓存思想

缺页中断，无空闲页面需要移出某个页面，尽可能减少缺页中断率

1. 最佳置换算法 OPT（不可能实现）

2. 最近未使用 NRU（没有被访问&修改）

3. 先进先出 FIFO

4. 最近最久未使用 LRU 算法——**老化算法**

5. 工作集**时钟算法**，根据最近内存访问次数决定工作集大小（仅**局部策略**有意义）

#### 分页系统设计

1. 局部分配与全局分配策略

2. 负载控制——颠簸

3. 页面大小——内部碎片，小页面

   > 小页面可以减少内部碎片的产生，充分利用空间，但是更小的页面划分意味着更大的页表，装载时间也就更长，需要权衡

4. 分离的指令空间 I 与 数据空间 D

5. 共享——共享页面-共享库-内存映射文件

### 编译与程序执行

#### 编译原理

- 过程

1. **预处理**——将 cpp 转化为 i 文件

   宏定义、头文件引入、条件编译、特殊符号等做处理

2. **编译与优化**——将 i 文件转化为 s 文件（汇编语言）
3. **汇编**——将 s 文件转化为 o 文件（汇编转机器语言）
4. **链接**——将 o 文件转化为目标文件，如可执行文件、共享目标文件

   静态与动态链接，链接其他库中的引入对象等

   > 在 gcc 指令中，可通过-E/-S/-c 分别生成预处理后的代码(.i)、汇编代码(.s)、目标代码(.o)

#### 内存模型结构

由下到上

1. 正文段（**运行代码**）
2. 只读数据段 rodata
3. 已初始化数据段 data（全局变量与静态变量）

   > c++中已经不再区分 bss 和 data 了，它们共享一块内存区域

4. `BSS` 段，未初始化数据（全局变量与静态变量）
5. `堆`，向上增长，线程动态分配的内存段，存一些对象和数组对象

   > Java 中通过 gc 自动回收堆中内存，而 C++中需要手动回收，new/delete 等

6. `栈`，向下增长，存放局部临时变量（**非 static 的**）、函数调用栈（**后进先出**），由编译器自动分配释放等

   > **全局变量会放在堆中**，无论是引用还是基本类型都如此（所以基本类型的变量不一定在栈中）。同时在 Java 中**没有静态的局部变量**

堆与栈的区别？

1. 管理方式：栈自动管理，堆手动管理（`c++`）
2. 空间大小：栈小，堆大
3. 碎片问题：栈由编译器自动管理，先进后出，无碎片问题；而堆需要清理时，会产生内存片段的不连续
4. 分配方式：堆动态分配；栈可以动态分配 alloca，也可以静态分配（局部变量）
5. 效率：栈高

### 安全与加密

#### 密码学

- 私钥加密

  两边必须拥有一个匹配的私钥，密钥分发的问题

- 公钥加密

  加密和解密的密钥不同，每个人都有一对公钥和私钥，公钥加密，私钥解密

  `RSA` 公钥体制

- 加密散列函数与数字签名

  常见的有`MD5、SHA-1、SHA-256、SHA-512`

1. `MD5` 加密

   安全的散列算法，过程不可逆，只能用穷举法破解

   - 加密原理

     512 位分为 16 个 32 位子分组，经过一系列处理变为 4 个 32 位子分组，级联有一个 128 位的散列值

     -> 填充使字节长度 mod512 为 448，填充 1+无数个 0，然后在最后添加一个 64 位的二进制数表示**填充前的字节长度**(512N+448+64)

     -> 4 个 32 位链接变量，主循环 4 轮，每轮进行数次操作，对其中三个做非线性计算然后加上第四个变量，在向右环移数个单位，加上四个变量其中之一并覆盖掉其中之一

   - 安全性
     非常难以破解，时间极长。但是可以通过**制定字典**，破解一些数据

     > 主要运用在数字签名、文件完整性验证以及口令加密等方面

2. 数字签名 CA 证书

- 对称加密与非对称加密

  对称加密：加密解密用的是同一钥匙，DES/AES

  非对称加密：加密解密用的不同钥匙，公钥加密，私钥解密 RSA/DSA

## Linux

用户态和内核态

标准库函数(用户态)的系统调用

### 常见命令

- ls、cp、mv、rm、sort、chmod、grep

- 标准输入输出流：`<` 、 `>`
- 管道机制：`|`，过滤器

### 进程管理与线程

- `fork`

  创建子进程，返回 pid 是 0 还是其他，通过管道进行父子进程间通信，如命令 `sort <f | head`

- 系统调用

  `exec(name,argv,envp)` 文件名，调用参数以及环境指针

  `waitpid(pid,&statloc,opts)` 等待子进程 pid，退出状态，配置

  > 当进程退出时，其父进程并没有 wait，则此进程进入僵死状态，直到父进程调用 waitpid 才会结束

- 任务结构 `task_struct`

  进程标识符 PID 与 进程描述符

  Linux 在 fork 时为子进程创建一个新的进程描述符（一般大多数由父进程的填充）和用户空间，不共享内存。如果代码段只读，则可以复制也可以共享

  > 值得注意的是，复制内存的代价高昂，现代 Linux 将子进程赋予页表，指向父进程，仅当需要写入数据时，页面才会被真正复制，这种机制称为**写时复制** `copy-on-write`

- Linux 中的线程

  `clone` 系统调用，控制是在**此进程创建新线程** 还是 **另开辟进程创建新线程**

  > 注意：系统线程为内核级线程，不暴露给用户

- 调度

  Linux 系统的线程是内核线程，故系统的调度基于线程，而不是基于进程

  实时先入先出、实时轮转、分时调度

  在 Linux 中 0-99 为实时调度优先级，100-139 为非实时调度的优先级，共 140

  > 调度器只考虑可以运行的任务，对于不可运行或者各种阻塞 IO 或内核事件的任务会放入等待队列中，内部有一个任务链表以及自旋锁保证并发同步

1. O(1) 调度器

   调度队列被组织成**两个数组**，一个是任务**正在活动**的数组，一个是任务**过期失效**的数组，每个数组有 140 个链表头（对应 140 个优先级），**链表头指向对应优先级的双向进程链表**

   工作过程：

   -> 先从正在活动数组中最高优先级的任务中选择一个执行，如果线程阻塞，则消耗时间片，直到阻塞结束运行或者时间片消耗殆尽放入失效数组

   -> 当活动数组为空后，两数组指针调换，防止线程饿死的现象出现

   > `nice` 系统调用：O(1)调度器采用启发式方法，动态优先级调整，进行惩罚与奖励，这样的模式复杂且存在问题，处理交互任务时性能糟糕

2. CFS 完全公平调度器

   处理非实时任务的默认调度器

   采用红黑树的调度队列，左侧运行时间短会更早的被**优先调度**，右侧时间长

### Linux 内存管理

- 虚拟地址空间

  正文、数据段、BSS、栈，具体见上——**操作系统的内存结构模型**

  防止 BSS 全 0 的物理页框，Linux 分配了一个静态 0 页面，使得未初始化的数据区域全部指向此页面，写入时再按照写时复制的方法进行页面的分配

  Linux 支持共享代码段，但是数据段(堆)和栈段从不共享，除非同一父进程下的两个子进程，同时有分离的指令与数据空间

- 系统调用

  `brk`、`malloc` 改变数据段大小，内存分配（用户态，**vm_area_struct**）

  `mmap` 映射文件、`unmap` 取消映射文件

  `vmalloc` 虚拟内存分配（内核区域，**vm_struct**，映射到物理内存用户区）

  `kmalloc` 物理内存分配（内核区域，**物理内存映射区**，映射到物理内存内核区）

1. `mmap`

- 进行跨进程通信

  用来在**进程虚拟内存地址空间**中分配地址空间，创建和**物理内存的映射关系**，这里不涉及内核空间

  注意：mmap 只是在虚拟内存分配了地址空间，只有在第一次访问虚拟内存的时候才分配物理内存(写时复制，**用户空间-虚拟内存空间···接收缓存区（物理内存）**，唯一的一次拷贝发生在这里)

  > 总的来说，mmap 是类似一种 IPC，多进程下对彼此的修改可见，仅拷贝数据一次

- 文件读、写操作

  普通的 read 系统调用，进程不能直接访问内核数据，需要转存（**磁盘-内核空间页缓存-用户空间**）

  而 mmap 在用户态中直接访问文件映射的物理内存（此时唯一的一次拷贝发生在**磁盘···物理内存-用户空间**），直接少了一次复制过程，**用内存读写代替 IO 读写**

- 内存管理

1. 物理内存管理

   由三部分组成：内核、内存映射、其他页框

   Linux 维护一个 mem_map 数组（页描述符数组），物理内存被分为区域，为每个区域维护一个区域描述符

   分页机制——四级页表

2. 内存分配机制（物理内存）

   **伙伴算法**——2 的幂次能够快速找到，但是会产生大量的内存碎片

   **slab 分配器**——使用伙伴算法获得内存块，但是之后切出 slab 更小的单元进行管理

3. 虚拟地址空间表示 area

   每个区用 vm_area_struct 描述，一个进程的所有 area 用链表连接

- 分页与页面置换算法

  pid 0 idle 进程，交换器

  pid 1 init 进程

  pid 2 页面守护进程，负责进行页面的主动清理

  在 Linux 中，没有**预分页和工作集**的概念，是一个请求换页系统，换页到**交换区 swap**一个独立分区

  > swap 的作用是在物理内存使用完之后，将磁盘空间(也就是 SWAP 分区)虚拟成内存来使用

  通过 `PFRA` 页面回收算法分为四种不同页面：

  1. **不可回收**

  2. **可交换（必须在回收前写回交换区或者分页磁盘分区）**

  3. **可同步（被标记为脏页面就需要写回磁盘）**

  4. **可丢弃（随时可回收）**

### IO

Linux 中**一切皆为文件**，如一些 IO 设备，打印机、网络等，一般都放在 dev 目录下

特殊文件分为两类，每个都与对应设备的驱动相关联：**块特殊文件**（可独立寻址访问，如**磁盘**）、**字符特殊文件**（IO 字符流，不可随机访问，如**键盘、打印机、网络等**）

- **网络 Socket** 详情见上——操作系统的进程间通信

- 实现

  Linux 中的 IO 是通过一些列的设备驱动来实现的，每个设备类型对应一个设备驱动

  每个驱动程序分为两部分，都运行在内核态，上部分运行在**调用者**的上下文并与**Linux**交互；下部分运行在**内核**上下文并与**设备**交互，调用者——内核（操作系统）——设备的通信桥梁

  Linux 在磁盘驱动和文件系统之间设置了一个高速缓存`cache`，提高性能

- 多路复用 IO

  同时监控多个描述符，当某个描述符就绪后立即通知进程进行读/写操作

1. select

   调用阻塞，当某描述符准备就绪或者超时返回，返回后进行**遍历**寻找相应描述符

   缺点：遍历费时，性能线性下降

2. poll

   本质和 select 没区别，监视了 event 和未发生的 event，返回后也进行线性遍历

   缺点：同 select

3. epoll

   使用一个描述符管理多个描述符，将用户空间的描述符事件存放到内核事件表中，这样在内核空间和用户空间只 copy 一次

   注意：与 `select 和 poll` 不同的是，通过一个文件描述符管理 `ctl`，使得其采用类似于监听回调 `callback` 的方式，无需遍历所有描述符，`wait`后分发通知；且数量不受限制

   - `epoll_create` 创建 epoll 句柄

   - `epoll_ctl` 对文件描述符 fd 进行 op 操作

   - `epoll_wait` 等待事件上报

### 文件系统

应用（用户态）-> VFS（内核态）-> 日志文件系统 -> 底层驱动

目录、链接、文件锁（**共享锁与互斥锁**）

- VFS 虚拟文件系统

  作为各种文件系统的通用接口，方便系统调用

- ext2、ext3、ext4 日志文件系统

  ext2：包括超级块、inode 表与数据区（两者是分离的哦）

- inode 节点

  内部包括 i 节点号、链接数（硬链接与软链接）、磁盘块、各种时间戳、**位置索引**等信息

### 安全性与权限

用户 UID，super 用户 **UID 为 0**

三类用户权限：权限所有者、所有者所在组的其他用户、其他用户

**读、写、执行**对应 `rwx` 4、2、1，可通过 `chmod` 提权

## 计网

### HTTP/HTTPS

- 版本、原理和区别(安全性 SSL 与 TLS)

  1. http/0.9 简陋，仅有 get，仅支持 html

  2. http/1.0 多支持了 post 和 head，非持久连接，content-type 支持的更多内容格式，**支持 cache**

  3. http/1.1 **持久连接**，支持了 Put、Delete 等请求方式，**管道机制**：**支持多个请求同时发送**

  4. http/2.0 **双工**，服务端支持同时处理多个请求，**解决队头拥塞的问题**，多路复用，将多个流 `stream` 放入一个连接 `connection` 中

  5. http/3.0 `QUIC 协议`(基于 `UDP`)

  - 自定义连接机制：`TCP` 每次只要断开了连接就需要重新握手
    ，而基于 `UDP`，用 64 位随机数作为 `ID` 标示，只要 `ID` 不变就不会重新建立连接

  - 自定义重传机制：每个包通过递增的序列号发送，并通过 `offset` 确定内容的发送位置

  - 无阻塞的多路复用：一个连接的 `Stream` 之间没有任何依赖，和 `TCP` 不一样的是，接收到的包就可以直接发给用户，而无需等待前面的包全部传输成功，直接应答，无需像 `TCP` 一样累计应答

- cookie/session/token

  cookie 在**客户端**记录信息确定用户身份（服务端为客户端分发的通行证）

  而 session 在**服务端**记录信息确定客户端状态

  token 是令牌，进行用户身份验证，一般包含 uid、timestamp、sign，可用来进行自动登录以及跨域的解决方案

1. cookie 不可跨域名性，token 支持跨域访问
2. cookie、session 有效期
3. cookie 并不安全
4. token 的自动登录实现

   -> 首次登录获取 token 保存

   -> token 自动登录

   -> refresh_token（当 token 过期时调用）

   -> refresh_token 也过期了，才会让用户重新输入用户名密码登录

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

1. 基于**证书利用数字签名**进行 C/S 身份验证，**非对称密钥算法进行对称密钥的接收**
2. **对称秘钥算法**对数据加密
3. **MAC 算法**检验数据完整性

### 缓存

强制缓存(Cache-Control)与对比缓存(code 304，并不返回 body 内容)

---

## Java

### JVM 内存模型

#### 五大区域

1. 程序计数器

   **线程私有**，记录当前运行的指令地址

2. 虚拟机栈

   线程私有，每个方法执行的时候会创建一个**栈帧**，存储局部变量表、操作数、方法返回等信息。当线程请求栈深度超过临界，就会报出`StackOverFlowError`

3. 本地方法栈

   线程私有，保存的是 native 方法信息

4. 堆

   所有线程共享的一块内存，所有对象实例和数组都要在堆上分配内存，（需要注意的是基本类型数据存储在栈中），此区域经常发生**垃圾回收**的操作

5. 方法区

   已被加载的类信息、常量、静态变量。在 jdk1.8 中已经不存在，被**元数据区**替代，原方法区被分为：1.加载的类信息(**元数据区**) 2.运行时常量池(**堆中**)

   > 重点：类中的`基本类型变量`，在堆中与其对象绑定；类中的 `static 基本类型变量`，在类信息中；而 `static final 的基本类型变量`，在常量池中，且编译期就确认

#### GC 垃圾回收机制

- 对象的分配

1. 对象优先在 Eden 区分配
2. 大对象直接进入老年代
3. 长期存活的对象进入老年代，默认>15
4. 动态对象年龄判定，在`Surviour`空间中**低于或等于某个年龄的对象总大小**大于 Surviour 空间的一半则**直接晋升**为老年代
5. 空间分配担保

   冒险：Minor GC 后新生代对象仍然存活时，需要老年代进行**分配担保**，**把 Surviour 中存不下的对象放入老年代**

   > 注：jdk 1.6 update24 版本后，**老年代连续空间大于新生代总大小或者历次晋升的平均大小，则直接 Minor GC，否则直接 Full GC**

- 完整的 gc 过程

  -> 新生代 Eden 空间，minorGC

  -> 新生代 Survivor 空间，存活+1

  -> 老年代 Perm Gen 存活>15（受到动态年龄调整影响），majorGC

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

   > 可作为 GC Root 的对象有：通过系统类加载器和根加载器加载的类对象、激活状态的线程、**栈中的对象**、**方法区中静态引用以及常量引用的对象**

3. 最终判定：如果此对象没有复写 `finalize` 方法或者已经被调用过，则判定死亡，直接回收；否则放入 `F-Queue` 中等待执行 `finalize` 方法，之后 `GC` 会在 `F-Queue` 中进行**第二次标记**

#### 性能监控&调优

- 故障处理工具

1. jps：虚拟机进程状况工具
2. jstat：虚拟机统计信息监视工具

   用于监视虚拟机各种运行状态信息：类加载、内存、垃圾收集、即时编译等数据

3. jinfo：java 配置信息工具
4. jmap：java 内存映像工具 用于生成堆转储快照（heapdump 文件）
5. jaht：堆转储快照分析工具
6. jstack：堆栈跟踪工具 生成当前时刻线程快照（定位死锁、僵住等状态）

#### 类加载

- 类加载器：通过一个类的全限定类名获得这个类的二进制自己流叫做类加载器

1. 启动类加载器 由 `c++` 实现，不继承于 `ClassLoader`（`\lib`）
2. 扩展类加载器 由 `java` 实现，加载 `JRE` 扩展目录（`\lib\ext`）
3. 系统类加载器 负责在 `JVM` 启动时加载来自 `Java` 命令的`-classpath` 选项、`java.class.path` 系统属性，或者 `CLASSPATH` 换将变量所指定的 `JAR` 包和类路径（`getSystemClassLoader`）

- 类加载过程

1. 加载——将 `Class` 文件读入到内存，并创建一个 `Class` 对象
2. 链接——将类的二进制数据合并到 `JRE` 中，分为以下三步

   验证——检验类中是否有正确的内部结构

   准备——将类的**静态变量分配到内存**

   解析——类**常量池**中**符号引用转变为直接引用**（包括方法和字段）

3. 初始化——为类的**静态变量赋予正确的初始值**

- 类加载时机

  **创建类的对象，初始化、引用类的静态变量或调用静态方法、反射**

  > 注意：静态 Final 对象在编译器生成，调用它不会进行类加载；以及类似的**被动引用**都不会进行类的加载

- 类加载机制

1. 全盘负责

   就是当一个类加载器负责加载某个 Class 时，该 Class 所**依赖和引用其他 Class**也将由该类加载器负责载入，除非显示使用另外一个类加载器来载入

2. 双亲委派模型——保证类的唯一性，避免类重复加载，保证 Java 核心 API 库被篡改

3. 缓存机制——所有加载过的 Class 都会被缓存

   > 这就是为什么在修改了 Class 后，必须重新启动 JVM，程序所做的修改才会生效的原因

#### 字节码执行引擎

- 运行时栈帧

  一个方法对应一个栈帧，当前的栈帧在栈顶，进行当前方法的调用，一个线程对应一个栈存储栈帧（虚拟机栈）

1. 局部变量表

   方法内部**局部变量&方法参数（包括一个 this 指针）**

   栈帧变量槽复用，极少数情况影响垃圾回收

   > 局部变量表中的数据没有如同静态、全局变量的准备、初始化阶段，所以定义局部变量的同时必须赋初始值

2. 操作数栈
3. 动态连接 每个栈帧都包含一个指向**运行时常量池**中该栈帧所属方法的引用
4. 方法返回地址 出栈将返回值压入上层调用者
5. 附加信息

- 方法调用与多态

1. 绑定

   前期绑定：程序执行前，**编译期间**，`final`、`static`、`private`、`构造方法`、`成员变量`存储在**类的常量池**中

   后期绑定：程序**运行时**根据对象的类型信息进行绑定，即**除了 static 和 final 方法**以外的方法均为后期绑定

   > `invokevirtual` 方法找到实际类型，然后从子类到父类的顺序查找正确的方法版本

2. 解析与分派

   Java 是静态多分派&动态单分派的类型

   解析——前期绑定，编译期确定

   分派——后期绑定，运行时确定

   - 静态分派：**重载**取决于静态类型调用
   - 动态分派：**复写**取决于动态类型调用，也就是多态

   > 注：**字段**不参与多态，该是哪个类就是哪个类的（父子类定义公有同名变量，实际情况中没人会这么写。。。），除非继承下来的（

3. 虚方法表

   后期绑定涉及到每个类中的方法表，在此表中以数组形式记录当前类和父类可见方法的直接内存地址，索引实现

#### 引用

1. 强引用 具有强引用的对象 gc 绝对不会回收
2. 软引用 SoftReference 内存不足才会回收
3. 弱引用 WeakReference 只要回收时发现弱引用对象就会直接回收
4. 虚引用 用来跟踪对象被垃圾回收的活动，jdk 中直接内存(不在堆内存处)的回收用到虚引用(分配一个对象指向直接内存处)

#### 内存模型与线程

- 内存模型

  JVM 的多线程内存部分分为**主内存**与**工作内存**，主内存在堆上（类似于物理主内存），工作内存在每个线程（类似于高速缓存）

  内存间的交互操作有 8 种，均是原子操作

1. volatile

   可见性但不保证原子性

   不可重排序性

   顺序性（先行发生原则）

2. 原子性、可见性、有序性

   Java 保证有序性通过 volatile、synchronized 和先行发生原则来完成

3. 先行发生原则

- 线程实现

1. 内核线程实现 1:1

   内核线程->轻量级进程，Java 用的是这种，需要进行用户/内核态的切换

2. 用户线程实现 1:N
3. 混合实现 M:N

- 线程调度

1. 协同式调度

   当某个线程执行完成后，通知其他线程继续执行

2. 抢占式调度

   Java 是抢占式调度，每个线程由**系统**分配时间

   Java 代码层面只能给操作系统提“建议”（如`priority`/`yield`），但不能保证

- 线程状态

  创建、运行、等待(`wait、join、sleep`)、阻塞(`sync`)、死亡

- 协程

  原有 1:1 内核线程并发缺陷——内核/用户态的上下文切换代价极高

  > 注意不一定是协同式调度

  Java 的协程还在发展，**_Kotlin 的协程还需继续研究_**

#### 线程安全与锁优化

- 线程安全的实现方法

1. 互斥同步——悲观锁

   synchronized 和 ReentrantLock，详情见下 Java 多线程

2. 非阻塞同步——乐观锁

   > 必须要求：操作和冲突检测具有原子性，如 比较交换`CAS`、加载链接/条件储存 `Load-Linked/Store-Conditional（LL/SC）`

3. 无同步方案

   可重入代码 和 线程本地存储(ThreadLocal)

- 锁优化

1. 自旋与适应性自旋

2. 锁消除

   在虚拟机即时编译器运行时，发现一些要求同步的代码实际上不可能出现同步问题，则会优化删除此锁

3. 锁粗化

   虚拟机检测到一串连续的操作都对同一个对象加锁就会进行粗化操作，将同步块合并

4. biased 偏向锁、轻量级锁、重量级锁

   见下 java 多线程，**sync 的锁升级过程**

### 设计模式

#### 原则

1. 开闭原则：对修改关闭，对扩展开放

2. 单一职责原则：每个类具有单一的职责

3. 合成复用原则：多用组合，少用继承

4. 接口隔离原则：有很多专一功能的接口，而不是具有总接口

5. 依赖倒置：面向接口编程，而不是面向实现编程

6. 里氏代替原则：子类必须替换掉他们的父类型

7. 最少知道原则：一个模块或对象尽可能与少的其他实体作用，使得模块功能相对独立

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

#### 工厂方法模式/简单工厂模式 Factory

简单方法模式使用简单，但是使用了静态方法，不能体现多态，且不符合开闭原则，需要在工厂内扩展修改

自定义创建工厂，工厂方法模式一般结合反射实现

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

目的：转换接口，用以适配

**对象适配器方式（组合委派，灵活）**与类适配器方式（直接继承，不灵活）

常见实例：`Java IO` 中 `InputStreamReader` 与 `InputStream`

#### 代理模式 Proxy

为目标对象提供一个代理对象，代理对象控制目标对象的引用，起到中介作用，保护目标对象，可以包装额外的工作方法

> 一般来说，代理的都是接口类型

- 静态代理
- 动态代理 AOP 面向切面编程

  静态代理代码量多，每一个目标对象都要有代理对象，可采用动态代理解决

  通过反射 invoke，调用动态代理类的对象方法，**在 Java 运行时实例化**

  > 动态代理类由于需要继承 Proxy 类，只能针对接口创建代理类，且效率必然比静态代理低

  使用方法：

  1. 实现 `InvocationHandler` 接口，用于调用处理，复写 `invoke` 方法

  2. `Proxy.newProxyInstance(classLoader,interfaces,invocationHandler)` 创建动态代理

#### 外观模式 Facade

子系统的组合，使得客户与子系统松耦合

目的：封装子系统，简化接口

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

- ConcurrentHashMap

  JDK 1.7 `Segment` + `ReentrantLock` + `Entry`

  JDK 1.8 `Synchronized` + `CAS` + `Node` + 红黑树

### IO 与 NIO

#### 类型

1. 磁盘操作 `File`

   File 获取文件，但不能进行文件的读写操作，同时创建 File 实例并不会在磁盘上创建一个文件

   RandomAccessFile 可以进行读写文件且支持随机访问文件的任意位置（通过文件字节指针）

2. 字节操作 `InputStream`/`OutputStream` （字节流）
3. 字符操作 `Reader`/`Writer`（字符流）
4. 对象操作 `Serializable`
5. 网络操作 `Socket`
6. 新的输入输出 `NIO` 非阻塞 IO

#### 字节流与字符流

所有的文件传输时都是以字节方式进行的，包括图片，而字符只会在内存中形成

字节流直接操作文件本身，能够处理包括音频视频图片各种类型的文件；而字符流需要用到内存缓冲区，仅能处理文本文件，需要刷新缓冲区或者关闭流文件以输出数据

> 字符流与字节流之间的转化通过**适配器模式**进行。同时建议：finally 中关闭流文件，防止泄露

#### 节点流与处理流

程序直接操作目标设备的称为节点流，而处理流是一个间接的流类用于调用节点流

缓冲流：Buffered 处理流，为 IO 提供内存缓冲区，提高 IO 效率，同时可以进行流上的特殊操作。设计模式为**装饰者模式**

建议用 `BufferedReader` 包装所有其 `read()` 操作可能开销很高的 `Reader`（如 `FileReader` 和 `InputStreamReader`)，如：

```java
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

#### 对象流与序列化

`ObjectOutputStream` 与 `ObjectInputStream`

**对象的 IO 传递**是通过序列化与反序列化实现的，`Serializable接口`

> **默认序列化**的对象仅针对非静态变量，非 `static` 且非 `transient`

- `readObject(in)` 序列化 与 `writeObject(out)`反序列化
- `serialVersionUID` 类版本对照

- 默认序列化的问题

1. 过程是迭代的，当对象过于复杂的时候方法栈可能溢出
2. 暴露私有域，消耗的时间和空间更多

- 自定义序列化的思路

  扁平化处理，基本变量通过默认序列化实现，而自定义的 Bean 对象通过自定义序列化来写入流中，注意需要判断数据的有效性

1. `readResolve` 与 单例模式
2. 序列化代理 与 `writeReplace`

#### NIO

IO 面向流、阻塞；NIO 面向缓冲区、通过线程和通道发送请求非阻塞

- 核心

1. Channel 双向通道（IO Stream 为单向）
2. Buffer
3. Selector 运行单线程处理多个 Channel

> 线程通常将非阻塞 IO 的空闲时间用于在其它通道上执行 IO 操作，所以**一个单独的线程现在可以管理多个输入和输出通道**（Channel）

- 工作原理

1. Selector 在专门的线程处理所有的 IO 事件，负责分发（分为服务端和客户端）
2. 事件驱动机制，事件到才触发，而不是一直同步监视
3. 线程通信：`wait、notify` 减少线程间无意义的切换

### 多线程问题

#### synchronized 与 lock(ReentrantLock)

1. 可中断性：`sync` 的锁**不可被中断**，只能等待锁的释放，而 `lock` 可以被中断 **（仅通过 tryLock 方式获取的锁才可被中断）**

2. 异常释放：sync 出现异常自己就会释放锁，lock 需要 `finally` 中**主动释放**

3. 可获取性：lock 可以通过 `tryLock()`方法知道是否获取锁

4. lock 可以**提高多个线程读操作的效率**

5. sync 使用 Object 的 `wait/notify` 调度机制，而 lock 使用 `condition` 的 `await/signal` 进行调度

   > 当资源竞争非常激烈时，使用 Lock 的性能表现要好于 Sync

6. 公平性 `sync`非公平，`Reentrant`默认非公平，但是可设置公平

7. 性能问题

   某个线程在等待锁的释放的时候需要中断，可中断/可不中断

   能够分开处理一些 wait/notify，Lock 里面的 Condition 就能控制通知哪个线程

#### 乐观锁与悲观锁

- 悲观锁：Synchronized、Lock，总是认为自己操作数据的时候别人也会操作

- 乐观锁：多用于多读的情景，认为自己操作时别人不会操作，只是在最后判断一下是否被别人来操作（版本号机制或 CAS 算法）

- CAS 算法 比较与交换 `compareAndSet(expect,update)`

> 问题：`ABA问题`——jdk1.5 `AtomicStampedReference` 类检查引用是否为预期引用

#### 自旋锁

当一个线程想要获取一个资源时，发现此资源被另外的线程占有，就会一直自旋检测该锁是否被释放，可以通过 CAS 自旋实现

> 自旋锁不会进入阻塞状态以进入内核态，一直都是 Active 的，少了线程的上下文切换，执行速度快

缺点：不能持有太长时间的锁，且本身无法保证公平性和可重入性，需要进一步修改

#### 偏向锁

在大多数情况下，锁不仅不存在多线程竞争，甚至还总是由同一个线程获得，所以引入此偏向锁使得获得锁的代价更低

这个锁会偏向于第一个获取到它的线程，在接下来的执行过程中，如果没有被其他线程获取，此锁线程将永远不同步

#### 重量级锁与轻量级锁

`Mark Word` 运行时数据，在 JVM 堆中存储对象的**锁状态**、`Hashcode`、**GC 分代年龄**等

- 轻量级：利用线程栈帧存储锁记录（同样是根据在同步周期内**很难出现竞争**的思路）通过 `CAS` 进行加锁和释放锁

  当有多个线程争占此对象锁，轻量级锁会膨胀为重量级锁

- 重量级：互斥量同步

- 比较

1. 重量级锁不使用自旋，不消耗 CPU，但是会直接进入阻塞态（**用户态到内核态的切换**），同步时间长

2. 轻量级锁线程不会阻塞，通过自旋同步，不过会消耗 CPU，如果自旋失败会出现膨胀为重锁

3. 偏向锁基本只能有一个线程访问，且不会改变

#### 死锁

- 条件：互斥、占有保持、循环等待、不可抢占（**必须有多个锁、和互斥资源**）

- 排查：`jstack` 排查某进程的线程阻塞情况

- 预防：银行家算法、带时间的 tryLock

#### 线程池

目的是为了减少开辟新线程消耗的资源（使用线程池内的空闲线程，统一管理）

- 工作顺序

  如果线程池中线程数量不够（小于`corePoolSize`），新提交的任务会创建一个新线程执行

  如果已经达到指定上限`corePoolSize`，则需要放入任务队列中，等待线程空闲

  如果队列也满了（且`size < maximumPoolSize`），也会继续创建新线程来执行此任务

  如果空闲线程有一段的空闲时间，则关闭此线程

- Java 线程池 `ThreadPoolExecutor`
  用下面四种内置的线程池构造方法，往往不是最优解，需要自定义

1. `newSingleThreadExecutor` 单工作线程的线程池，任务按照指定顺序执行，适用于小程序、负载轻的服务器
2. `newFixedExecutor` 定长线程池，控制最大并发数，适用于长期任务
3. `newCachedThreadPool` 可缓存线程池，灵活回收线程
4. `newScheduledThreadPool` 可进行定期或延时任务的定长线程池

- Runnable 与 Callable

  有无返回值，可否抛出异常？

1. `(void)execute(runnable)` 无返回值
2. `(Future<T>)submit(callable)` 有返回值，能抛出异常 `Future.get()`
3. `(Future<T>)submit(runnable)` 无返回值

- 拒绝策略

1. 抛出异常 `RejectedExecutionException`
2. `DiscardPolicy` 直接弃掉
3. `DiscardOldestPolicy` 弃掉最老的任务
4. `CallerRunsPolicy` 直接由提交者线程处理

- 退出

1. `shutdown` 等待所有任务完成后退出
2. `shutdownNow` 强制退出，并将阻塞队列里面剩余的 Runnable 返回调用方便于后续处理

- 源码分析

1. `execute(runnable)` 按照工作顺序将任务放置到合适的 `worker` 中(`addWorker`)
2. `reject(runnable)` 按照拒绝策略拒绝任务
3. `addWorker(task, core)` 添加 worker

   一部分用 `双层自旋+乐观锁` 的方式直接增加 worker 的数量，但**并没有创建 worker**

   另一部分用 `悲观锁` lock **创建 worker**

4. 线程池执行单元 `(Worker) runWorker`

   内部`自旋`在阻塞队列中获取任务，并执行，如果阻塞队列为空，则此线程阻塞

   当自旋操作被退出，也就是当阻塞队列为空后，在 finally 中执行结束逻辑 processWorkerExit()

5. 线程池的退出，用全局加锁的方式进行处理

   > 注：线程池的状态变化 通过 CAS 和原子类进行处理，保证并发性

#### concurrent 包

1. ConcurrentHashMap 并发 map

   CAS + sync + Node + 红黑树

2. CountDownLatch 一次性计数器 await
3. CyclicBarrier 可循环屏障 await
4. Semaphore 信号量，可以控制同时访问资源的最大线程数；也类似于操作系统中的信号量，当最大线程数为 1 时可以实现互斥锁的功能
5. BlockingQueue 阻塞队列

   ArrayBlockingQueue 与 LinkedBlockingQueue

   一个基于数组实现，有限长，只有一把锁，出队与入队同一把锁，在入队高并发或出队高并发性能很高

   另一个基于链表是实现，无限长，两把锁，入队和出队不同锁，在入出队都高并发时性能高

### 泛型

泛型擦除：java 编译期擦除具体的类型

解决：

1. 先检查、再擦除、然后编译
2. 自动类型转换
3. 泛型擦除与多态的冲突

### 注解

#### 应用

面向`编译器/APT` 使用，用于测试代码 Junit、简化使用（Retrofit、ButterKnife）

#### 注解类型

1. 元注解(Android 内置注解)

   1. `@Retention` 保留注解，解释此注解的生命周期

      分为`RUNTIME`(运行时)、`CLASS`(编译进行时)、`SOURCE`(源码阶段)

   2. `@Documented` Javadoc 文档注解，略
   3. `@Target` 目标注解，限定了注解的作用范围
   4. `@Inherited` 继承注解，子类继承注解
   5. `@Repeatable` 可重复注解

2. Java 内置注解&自定义注解

   1. `@Override` 复写
   2. `@Deprecated` 废弃方法
   3. `@SuppressWarnings` 忽略警告
   4. `@SafeVarargs` 参数安全类型
   5. `@FunctionalInterface` 函数式接口（lambda）

### 依赖注入

从“外部”向客户端提供服务（注入）的行为，插件化？

1. 构造器注入
2. 方法注入
3. 字段注入

---

## Android

---

### Activity 活动 与 Fragment 碎片

#### 活动生命周期与状态

1. 失去焦点（Paused）、进入后台（Stopped）
2. 系统配置发生改变（Destroy 重建），如何避免（`android:configChange`）
3. `onRestart` 与 `onNewIntent`
4. `onSaveInstanceState()` 在系统 **未经你许可** 销毁此 `Activity` 之前

#### 活动启动模式与任务栈

1. standard
2. singleTop
3. singleTask
4. singleInstance
5. 任务栈 TaskAffinity 的使用

   任务共用性

   `taskAffinity` 必须配合 `singleTask` 使用或者设置 flag 为 `Intent.FLAG_ACTIVITY_NEW_TASK`

   `allowTaskReparenting` 允许此 Activity 重定父级，比如 browser 页面的 reparent

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

1. `add、hide、show` 除了首次加载，以后不会走生命周期方法，而是走 `onHiddenChanged` 方法
2. `replace` 会重新走一遍生命周期的创建，且页面只有一个
3. `addToBackStack()` 回退栈方法

- 通信问题

1. `Fragment` 中调用 `getActivity` 获取活动/推荐用接口形式调用(`onAttach` 和 `onDetach` 中绑定解除)

2. `Activity` 调用 `Fragment` 一般是直接通过方法，setArguments 进行传值

3. `Fragment` 互相调用，由 `Activity` 做中转站

- `FragmentPagerAdapter` 和 `FragmentStatePagerAdapter`

  前者会调用 `detach`，并没有回收内存；后者调用 `remove`，回收内存。

  所以前者适用于少量页面的情况，后者适用于大量页面的情况

### Service 服务

在托管进程的主线程进行，由系统进程托管，一般服务内开线程进行耗时操作

#### 重要回调

1. onBind()/onUnbind() 返回 IBinder 进行绑定/解绑服务
2. onCreate() 初始化创建一次
3. int onStartCommand() 返回三种 service 的运行策略，启动服务
   > `STICKY`（系统内存不够被 kill 掉后，过一段时间空闲时会进行重建，**不传递 intent**）、`NOT_STICKY`（被 kill 掉不会重建）、`REDELIVER_INTENT`（kill 掉后重建，且**传递 intent**）
4. onDestroy() 销毁

#### 状态

1. 启动状态 `startService(intent)`
2. 绑定状态 `bindService(intent,serviceConn,flag)` 转换问题？(启动服务稍微优先)

   > IBinder 实现（仅自己进程）、Messenger（串行 IPC）、AIDL（并行 IPC）三种方式

#### 前台服务和通知发送

`startForeground` 和 `stopForeground`

#### 优先级

1. onStartCommand 的返回值 START_STICKY
2. android:priority
3. onStartCommand 提升为前台服务级别

#### IntentService

一个异步的，会自动停止的服务，继承自 Service

会创建独立的 **worker 线程**来处理所有的 `Intent` 请求，处理 `onHandleIntent` 方法，处理完成后会 `stopSelf()`

> `HandlerThread` + `Handler` 构建成了一个带有消息循环机制的异步任务处理机制

### IPC 跨进程通信

为什么？

**性能方面**：Binder 的内存拷贝次数只有 1，通信效率高，传统 IPC 需要两次拷贝

**安全性**：通过 Binder 对安卓进程中 uid 做隔离，权限验证

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

> 基于 C-S 通信模式。跨进程通信需要在**序列化和反序列化**数据中不断操作，虽然跨进程中数据是多份的，但是他们底层的 Binder 是同一个对象

在 Android 开发中 Binder 主要使用在 Service 中，包括 AIDL 和 Messenger

基础：用户空间/内核空间与系统调用、管道/Socket、Binder 驱动加载在内核空间运行

Binder 驱动连接两个进程，实现了 mmap 系统调用，内存拷贝次数仅为 1

1. Binder 通信机制——类似于中转站

   对于 Server 进程，Binder 是本地对象，而对于 Client 进程，Binder 是指代理 Binder 对象

   `ServiceManager`(类似 DNS)、`Binder Client`(类似路由器)、`Binder Server` 与 `Binder驱动`

   -> `Server` 向 `ServiceManager` 注册，生成方法映射表

   -> `Client` 请求 `ServiceManager` 查找，由 `Binder驱动` 其返回一个 `Server Object` 的 `Proxy` 对象

   -> `Client` 调用 `Proxy` 对象的方法，`Binder驱动` 回传给 `Server` 进行调用返回给 `Client`

   > 注意：C/S 和 ServiceManager 的交互均**通过 binder 驱动**实现，他们之间**不可以直接进行交互**

2. Binder 请求的线程管理

   Server 默认最多有 16 个 Binder 线程处理 Binder 请求

   而 Binder 驱动自身是通过管理他自己的线程池来处理请求的

3. aidl 自动 Build 文件内容

   - 内部类 `Stub` 继承自 `Binder`
   - `Stub` 另一个进程的调用方
   - `Proxy` Binder 的内部代理实现类，调用方
   - `aidl` 接口方法

4. Binder 重要方法

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

1. 优先使用`Application`的 Context(`getApplicationContext()`)，减小内存开支

2. 与 UI 相关的尽量使用 Activity 的 Context

3. 内存泄漏引用问题：不要让生命周期长于 Activity 的对象持有到 Activity 的引用。

4. 尽量不要在 Activity 中使用非静态内部类(理由见 2)，如果硬要使用(如`Handler`)，则应该使用弱引用`WeakReference`

5. Dialog 的 context 必须为 Activity 的

   `Window Token` Binder 窗口令牌：Dialog 是应用窗口类型，要求必须为 Activity 的 token

---

### BroadcastReceiver 广播接收者

1. 广播接收器运行在主线程，不能进行耗时操作
2. 静态注册 Manifest(常驻广播) 与 动态注册(onResume/onPause)

> 广播可在应用程序之间传输数据，所以是可以基于多进程的通信，底层仍然是 `Binder` 实现的

#### 广播发送与类型

1. 普通广播 sendBroadcast
2. 系统广播
3. 有序广播 sendOrderedBroadcast()，按照 priority 以及动态与否排序
4. **应用内广播 Local**

   exported:false、权限验证、指定包名

   `LocalBroadcastManager` 本地广播，内部由 `Handler` 实现

5. 粘性广播 5.0 以上已失效

#### 实现机制

-> 自定义 `BroadcastReceiver`，重写 `onReceive` 方法

-> 通过 `Binder` 向 `AMS` 注册

-> 广播发送者向 `AMS` 发送广播

-> `AMS` 查找符合条件的接收器，发送到指定 Receiver 的消息队列中

-> 执行 `onReceive` 方法

---

### View 视图 UI

#### 层次模型

1. `Activity` 控制器，**虚拟** View

   作用：控制生命周期&处理事件

2. `Window` 视图的承载器 由 `PhoneWindow` 实现

3. `DecorView` 顶层 View，视图树根节点

   作用：显示&加载布局，分为 titlebar 和一个 content(`setContentView()`)

4. `ViewRoot` 根布局连接器，由 ViewRootImpl 实现

   作用：连接 DecorView 和 WindowManagerService(WMS)；并控制 View 的绘制

5. `Window Manager` 管理 DecorView 和 ViewRootImpl，将 Decor 交给 ViewRootImpl 中开始绘制的流程

#### 事件分发

应用层从 `Activity->Window->DecorView->View`

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

  注：先处理`ACTION_DOWN`之后是`UP & MOVE`(必须有 `onTouchEvent` 返回 **true** 后才会进行处理)

`View事件分发`(已经没有子 View 的 View) 按顺序执行，如果返回 `true` 不再传递

1. dispatchTouchEvent()
2. onTouch()
3. onTouchEvent()
4. performClick() / onClick() / onLongClick()

> 至此，xy 方向的滑动冲突的解决也就很简单了(如`ViewPager`和`ListView`)

#### 绘制流程

`Activity` -> `PhoneWindow` -> `DecorView` -> `TitleActionBar`/`ViewGroup` -> `View`

每个 View 负责绘制自己

- 步骤

1. 通过`WindowManager`将`DecorView`传入`ViewRootImpl`
2. `ViewRootImpl`中 `requestLayout()`

   ->`scheduleTraversals()`发送绘制的 Message

   ->`performTraversals()`执行下列方法

   -> 对于每个 ViewGroup 的所有子 View 进行如下操作

3. `Measure` 测量(大小)

   ViewGroup 开始，遍历子 View，测量出大小保存，之后根据结果测量自己，over

4. `Layout` 布局(位置)

   类似于 measure 过程，注意单一 View 是不会计算子 View 的位置的，因为没有子 View

5. `Draw` 绘制

   **绘制流程**

   -> `draw()` 绘制自身 View

   -> 自身背景 `drawBackground`

   -> 自身内容 `onDraw(canvas)`

   -> 子 View `dispatchDraw()`

   -> 显示效果&恢复图层 `onDrawForeground`

   -> 各种装饰物 `onDrawScrollBars`

- 关键类/方法

1. MeasureSpec 测量这个 View 的规格（包括 `测量方式 mode` + `测量大小 size`）

   > 测量方式 mode： `EXACTLY`(match_parent&具体数值)/`AT_MOST`(wrap_content)

   根据 `父View` 的**测量规格 MeasureSpec** 和 `子View` 的 **布局参数 LayoutParams** 来决定**子 View 的测量规格**

   - 当 `子 View` 是具体数值 `dp/px` 时，测量模式为 `EXACTLY`，大小为具体数值
   - 当 `子 View` 为 `wrap_content` 时，测量模式为 `AT_MOST`，大小不超过父 View 的大小
   - 当 `子 View` 为 `match_parent` 时，测量模式为父 View 的测量模式，测量大小根据父 View 的测量模式决定（如果为 `EXACTLY` 则和父 View 一样大小，如果为 `AT_MOST` 则不超过父 View 大小）

   > 举个例子：阿里面试题——父 View `wrap_content`，子 View `match_parent`，布局应该是：**子 view 的测量模式为父 View 的测量模式，而父 View 为 AT_MOST，则子 View 有多大，父 View 就有多大**

2. Measure 计算这个 View 的实际大小(`performMeasure()`)，`measure方法`最终的测量有`View`的回调`onMeasure`实现

3. Layout 用来确定 View 在父容器的布局位置(`performLayout`)，`layout方法`最终的测量由`View`的回调`onLayout`实现

   `layout()` 中测量`自身 View` 的位置，内部的 `onLayout` 方法中是测量`子 View` 的位置

   > 单一 View 是没有子 View 的，故其 onLayout 为空实现，而自定义的 ViewGroup 中**必须复写 onLayout**

4. Draw 用来将这个控件绘制出来，从`performDraw`开始，调用每个 View 的`draw(canvas)`方法

   > 无论是自定义 View 还是 ViewGroup，都**需要复写**

- 其他的东西

1. `getMeasureWidth` 和 `getWidth` 的区别与使用？

   getMeasureWidth 是测量的宽高，而 getWidth 是实际最终的宽高

   > 一般情况下，非人为设置时，两者的宽高总是相同的

   只有在测量过程和布局计算时，使用 getMeasureWidth；在 **Layout 之后** 才使用 getWidth 获取

2. 在 Activity 中获取 View 宽高的方式

   `view.post`/`ViewTreeObserver`/`onWindorFocusChanged`

3. onMeasure、onLayout、onDraw

   `onMeasure` 和 `onLayout` 分别是获取**子元素大小和位置的**

   `onDraw` 是绘制**自身内容**的，**包含**在 `draw` 方法中

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

- ListView

1. 通过自身重写 `getView()` 实现复用，仅有两层缓存机制（可见的和离开屏幕的）
2. 样式问题：只能实现垂直线性排列的布局；无增删动画、分割线仅支持 `android:divider`
3. 数据量小，应用场景少、样式简单

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

   > 注意：此 `View` 的 `padding` 和 `wrap_content` 属性将失效，请分别在 `onDraw`(主动获取 padding 值加入计算) 和 `onMeasure`(添加宽高默认值) 中做处理

4. 直接继承 ViewGroup

   可复写`onDraw`、`onMeasure`、`onLayout`，并轮训子 View 绘制（`measureChildren`与`setMeasuredDimension`），扩展性极强

---

### 多线程通信

#### Handler

跨线程通信

> 设计模式：Message 的享元模式

- 四个对象

1. Handler 发送和处理消息
2. Looper 从消息队列中取出消息，并且发送给 Handler
3. MessageQueue 存储消息，内部由**单链表**实现，底层通过 JNI 与 native 层交互，**epoll 机制**
4. Message 发送的消息本身，携带数据

- 基本工作流程

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

- 其他小问题

1. `handler` 中的 `post` 和 `sendMessage` 有什么区别？

   本质没区别。源码上，最终都调用`sendMessageAtTime` -> `enqueueMessage` -> ......`dispatchMessage`

2. `Looper.loop()`是一个死循环但是为什么没有阻塞？

   在 `ActivityThread` 中启动了一个主线程的 `Handler`，此 Handler 处理了 Activity 各种情况的信息，所以说其实这个 `Handler` 一直在处理消息，相当于没有阻塞，**只要不出现某个消息处理时间很长出现堵塞**

3. `ThreadLocal` 的原理

   目的：在多线程程序中，同一个线程在某个时间段只能处理一个任务，我们希望在这个时间段内，任务的某些变量能够和处理它的线程进行绑定，**在任务需要使用这个变量的时候,这个变量能够方便的从线程中取出来**

   > 此对象建议为`static`，保证不会产生很多`Entry`

   - `ThreadLocalMap` 存储与这个线程绑定的变量 `<ThreadLocal,Entry<Obj>>`，Android 中用类似数组实现的 Entry

     > **一个线程可以有多个 ThreadLocal 来存储多个变量**，一个线程所存储的多个变量全部存储到一个`ThreadMap`(`Values`)中

   - ThreadLocalMap 的弱引用

     弱引用存储 ThreadLocal，在 gc 时清除，防止长期存在的线程导致 `ThreadLocal` 无法回收

     但是 ThreadLocalMap 与对应线程生命周期相同，强引用链条引用 Value，导致无法清除对应的 Value 值，就可能引起内存泄漏的问题

     故 threadLocalMap 中的 set、get、remove 方法对 null 的 key 做了清除的工作，但是仍然不能保证绝对安全

     **最佳实践**：在 ThreadLocal 使用前后显式调用 remove 方法，注意异常的 finally 清理；且保证 ThreadLocal 为 static，防止对象重新创建

   - 在 `Looper.prepare()` 中，通过 set 方法将 `Thread` 和 `Looper` **绑定**起来

#### AsyncTask

无需使用 Handler+Thread 的复杂组合，采用线程池的缓存线程+复用线程，避免了创建和损毁的开销

`AsyncTask<Params,Progress,Result>`

两个线程池：任务队列线程池(`SerialExecutor`)、执行线程池(`THREAD_POOL_EXECUTOR`)

一个 Handler(`InternalHandler`)

- 流程

  -> `AsyncTask()`

  1）新建一个工作线程`WorkerRunnable`，内部进行 `doInBackground`，finally 中回调 `postResult`

  > 在 `postResult` 中通过 `InternalHandler` 发送一个 Message，接收后进行 `onProgressUpdate` 或 `onPostExecute`

  2）新建一个 `FutureTask(Worker)`，在 `Worker` 执行完成后，复查任务调用，将未被调用的任务结果通过 `InternalHandler` 传递给**主线程**

  -> `execute(params)` 手动触发异步任务 WorkerRunnable

  调用 `SerialRunnable` 的 `execute` 方法(`sync`)，内部维护一个双向任务队列，如果当前无任务执行，则从从队列中取出一个执行(任务的执行由 `THREAD_POOL_EXECUTOR` 进行)

  -> `onPreExecute()` 用于进行线程的初始化操作

  -> `doInBackground(params)` **后台线程**处理，进行耗时操作

  -> `publishProgress()` -> `onProgressUpdate(progress)`

  在主线程中显示任务进度（如果 Progress 为`Void`则无）

  -> `onPostExecute(result)` 接收执行结果，显示到 UI 组件

  -> `onCanceled()` 任务取消

- 注意点

1. `AsyncTask` 不与任何组件绑定生命周期流程，所以需要手动取消(`onDestroy` 中)

2. 内存泄漏问题，内部非静态类会持有外部类(`Activity`)的引用导致内存泄漏，需要声明为静态

3. 线程执行结果丢失，当 `Activity` **重新创建**时，`AsyncTask` 会失去引用，所以需要重新恢复

#### HandlerThread

- 优点：无需进行新建 `Thread+Handler` 的方式实现异步通信

- 通过 `HandlerThread` 新建工作线程，并注册此工作线程的 `Handler` 即可进行操作了

- 注意：**内存泄漏**问题 / **按序处理消息**

- 主要使用场景

  1. 向子线程传递消息，即构建`子线程的 Handler`（不需要进行 `Looper.prepare/loop`）

  2. 按序发送消息

### Framework

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

3. `C++ Framework` (Media) 与 `Java` 核心层通过 `JNI`(Android Runtime) 通信，同时启动 `MediaServer` 进程
4. `Native` 与 `kernel` 通信通过`系统调用 Syscall`

   用户守护进程(`daemons`)、初始化进程、`HAL 层`(和 Kernel 驱动相关)、开机动画等

   > HAL 硬件抽象层，包含多个库模块，每个模块为特定硬件组件实现一组接口，如 WIFI/蓝牙模块

5. `Kernel` 安卓 Linux 内核层，初始化进程、内存管理、各种驱动程序
6. `Loader` Boot Rom 以及 Boot Loader

#### 系统启动流程

1. `BootLoader`

   在操作系统内核运行之前运行，用于初始化硬件设备、建立内存空间的映射图，保证系统软硬件进入一个合适的状态

2. `Kernel` 初始化

   Kernel 进程，Linux 下有三个进程

   `idle` 进程 由系统自动创建，运行在内核态

   `init` 进程 由 idle 通过 kernel_thread 创建，完成系统的初始化

   `kthreadd` 进程 由 idle 创建，始终运行在内核空间，用于内核线程的调度管理

3. `init` 完成系统初始化，分裂出很多用户守护进程`daemons`

   > `fork` 孵化出 zygote 进程，启动 ServiceManager（Binder 的服务管家）、开机动画等重要服务

4. `Zygote` 孵化器初始化

   初始化第一个 VM，预加载 framework 和众多通用资源，便于孵化出新的 VM 进程来管理启动的 APP 进程

   > 由它孵化出的第一个进程是`Launcher`进程，在系统开机后启动

5. `SystemServer` 超级管理进程启动

   **负责管理启动整个 Java Framework**，包括下列四个服务`AMS、WMS、PMS、IMS`

   是 Zygote 孵化 fork 的第一个进程

   调整时间、设置语言

   初始化 `Looper`、装载库 libandroid_server.so

   初始化系统 `Context`

   创建 `SSM`(SystemServiceManager)负责系统 Service 启动，启动系统核心服务

   创建启用 java 服务

   调用 `Looper.loop()` 主线程循环

6. `MediaServer` 由`init`进程 fork 而来

   **负责管理启动整个 C++ Framework**，包括`AudioFlinger`、`CameraService`等服务

7. `AMS/PMS等服务` 启动
8. `Launcher` 启动 `Home` 进程

#### Syscall

`Native` 与 `Kernel` 间的系统调用

通过中断（中断向量表）实现，实现用户态到内核态的切换

#### JNI

`Java 层`与 `C++(Native 层)`的纽带

#### AMS

负责系统中`四大组件的启动、切换、调度`以及`应用程序间的管理和调度工作`

启动

1. 由 `SystemServer` 的 ServerThread 创建

2. 将 `SystemServer` 进程交由 `AMS` 管理

3. 将 `SettingsProvider` 放到 `AMS` 中运行

4. 内部保存 `WMS`

5. 准备完成后，调用 `systemReady` 初始化其他服务

`AMS.main()`
返回一个 Context 对象（上下文环境）

1. 启动 `ActivityThread`，应用程序 APP 的主线程，**其职责是调度运行在此线程的四大组件**

2. 获取并操作 `Application` 的资源、类

3. 获取用来管理 `Activity` 启动和调度的核心类

4. `startRunning()`

构造函数

1. 创建`广播队列`(前台和后台队列)、`Service`、`Provider`

2. 建立 `data/system` 的一些信息，配置信息初始化

3. 启动线程，负责检测 `CPU` 使用情况

`ActivityThread.systemMain()`

此方法为 `SystemServer 进程`搭建一个和应用进程一样的 `Android 运行环境`

> ActivityThread 可以把 Android 系统提供的组件之间的交互接口机制等扩展到 SystemServer 中使用

1. `thread.attach(true)`

   初始化 `ContextImpl`、`App`、`Instrumentation`（创建组件、系统与组件的交互工具类）、设置 `ViewRootImpl` 的监听回调

2. `getSystemContext()` 初始化资源信息

**_待写。。。太恶心了_**

#### WMS

#### PMS

#### IMS

### Android 操作系统

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

#### APK 打包流程

- 流程

1. `R.java/resources.arsc` 资源索引文件
2. `aidl`
3. 项目源代码 class 并混淆
4. 转化 class 为 `classes.dex`
5. 打包 APK
6. Jarsigner 加签名
7. APK 文件对齐处理

- 文件结构

1. `assets` 不被二进制化的资源文件
2. `META-INF` 签名&资源加密信息
3. `res` 二进制化的资源文件
4. `AndroidManifset.xml` 全局配置
5. `classes.dex` 编译字节码文件
6. `resources.arsc` 资源索引文件

#### 虚拟机

在 Android 中，每一个进程对应一个虚拟机，不同的虚拟机之间不会相互影响，同时也不会影响整个安卓系统。其负责对象的生命周期管理、堆栈与线程管理、安全与异常管理以及垃圾回收的工作

1. Dalvik 与 JVM

   `Dalvik` 运行的是 `dex` 文件，而 `JVM` 运行的是 `class 字节码`文件，dex 文件是在 class 文件基础上**压缩优化**形成的

   > `dex` **合并**了所有的 `class` 文件，使得各个 class 可以共享数据，减少了一部分的冗余

2. 孵化器——`Zygote` 进程

   见上章：`Framework`——应用的启动流程

3. 致命弱点——拖慢系统速度

   **先翻译再执行**的机制：当应用启动时，`dalvik虚拟机` 将 dex 文件通过 `JIT`（Just In Time 及时编译）翻译为机器码，然后再执行，这种机制**使得 Android 的电量消耗和运行流畅度不理想**

4. `ART` 虚拟机

   针对 Dalvik 的翻译再执行的机制，ART 在第一次安装应用后就进行`AOT`（Ahead Of Time）预翻译成机器码

   缺点：**安装时奇慢**

5. 优化

   Android N 使用 `AOT、解释、JIT混合模式` 进行处理，安装过程中不再进行预翻译，在运行过此应用后，在手机 idle 或者充电情况下再将程序翻译为机器码

#### 进程管理

在 Android 中，应用进程被尽可能的保留在内存中，一旦要超过内存，系统会选择性的杀掉一些进程，腾出内存

好处有二：提高内存利用率，以及提高再次启动的速度

1. 进程的五大等级

   **前台进程** Active

   **可见进程** Visible(onPause)

   **服务进程** Service

   **后台进程** Hidden(onStop)

   **空进程** 退出应用后的进程

   用作缓存，其能够记录一些程序的历史信息，也能加快下次启动的速度

2. 进程的**移除依据——阈值**
3. 多进程应用以及服务的进程转换

   一般来说，如果按 `home` 键，会使应用变为后台进程，除非有前台服务运行，比如 QQ 音乐播放器

   `back` 键退出应用程序后，变为空进程

4. 一些问题

   进程调度策略是一个很消耗资源的环节

   后台进程与空进程不消耗 cpu，自然不耗电，除非提升为前台服务（比如 QQ 音乐）

   应用太多，手机变慢，实际上和内存没有太大的关系

### Android 性能优化

#### ANR

只有主线程(UI)才会 ANR，发生了某些输入时间导致一段时间未响应

- 原因

1. 主线程中执行耗时操作——需开辟新线程
2. 其他程序进程占用 CPU 导致本进程无法获得 CPU 时间片(大量的数据读写)
3. 线程持有锁，等待超时，`join、sleep、wait` 等
4. service 忙无响应(应避免在 Service 中进行耗时操作，除非开辟线程)

- 定位与分析

  `Logcat` 日志或`/data/anr/traces.txt` 文件(通过 `AMS` 写入)

  log 分析：原因、进程 id、进程包名、CPU 使用率/IO wait

  traces 分析：线程的调用栈

- 严格模式？

#### 内存泄漏

根本原因：**短生命周期对象**释放时，被**其他对象一系列的引用**导致无法及时释放，长时间以来会出现 OOM(Out Of Memory)

- 主要情况

1. 监听器，注册/注销问题(比如`广播`、`listener`)
2. 数据/资源连接(如`数据库`，`IO`，`cursor`)
3. 非静态内部类(匿名)会持有对外部类的引用(如`Handler、Thread`)
4. 静态变量，因为静态变量的生命周期和应用的生命周期一样长(如`静态View、单例、静态Activity`)

> PS：静态内部类不持有引用，如果要使用外部类的方法，需要使用`WeakReference`

- debug/测试方法

1. `MemoryMonitor`
2. `LeakCanary`

- 避免

1. `非静态内部类`替换为`静态内部类+WeakReference`，尽可能不要在匿名内部类中进行异步操作
2. 尽量使用`Application`的`Context`
3. 在正确的时候(如`Activity`的`onStop`、`onDestroy`中)，及时清理关闭可能出现引用导致无法释放内存的资源
4. 为`WebView`开启另一个**进程**，通过`AIDL`通信

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

2. 避免使用 `Enum` 枚举

3. 减少 `Bitmap` 内存占用，**decode 方式以及压缩比**

4. 使用更小的图片

5. 避免在 onDraw 中进行对象的创建，因为 onDraw 需要频繁调用，会导致**内存抖动**

6. `StringBuilder` 拼接

7. 内存策略优化：合理设计 cache 大小，少用 static 对象，优化布局层次、珍惜 Service 资源，Proguard 对代码进行压缩、优化和混淆

#### Bitmap 大图片处理

1. 获取图片的宽高 `BitmapFactory.Options`
2. 按照压缩大小得到图片压缩比 `inSampleSize` 传入 `Options`（2 的幂）

   图片编码方式的改变，根据分辨率的决策

3. `BitmapFactory.decodeResource`

   > 内部核心方法 decodeStream()

#### MemoryMonitor

- Dump Java Heap

1. `Class Name`：byte[] 图片缓存、FinalizerReference 无法 gc 掉的引用

2. `Instance`：对象实例以及内容

3. `ReferenceTree`：引用关系树，可以看到哪些变量占用内存大，找出内存泄漏根本原因

4. `Analyzer`：检测内存泄漏

- 分析方法

  -> 内存曲线做出基本判断，有没有释放？内存突然减少，发生 gc

  -> `Analyzer` 分析哪些没有被回收，内存泄漏的地方

  -> 通过 `ReferenceTree` 找出内存泄漏的根本原因

  -> `ClassName` 中判断是图片缓存过大还是其他问题

#### 绘制优化

1. 降低 onDraw 复杂度

   不要在 onDraw 创建对象、减少耗时操作

2. 避免过度绘制

   移除默认的 Window 背景（`android:windowBackground=null`）

   移除不必要背景，如果颜色相同

   减少 View 层级，少用 wrap_content（增加计算量）

   自定义控件 View 优化：在抽屉布局中使用 clipRect、quickReject

3. `<include>`、`<merge>`、`<ViewStub>`

   include 是复用 View，根 View 保留

   merge 也是复用 View，根 View 移除

   ViewStub 的懒加载模式，依旧类似 include

#### 总结

1. 启动速度——异步加载、分部加载、延期加载

   - onCreate/onResume
   - 减小主线程阻塞时间
   - 布局 & 绘制优化
   - AdapterView 复用
   - 合理的刷新机制

2. 显示速度——布局&绘制优化
3. 响应速度——避免 ANR，多线程
4. 稳定性——避免 OOM、ANR
5. 资源节省（省电、内存、流量、安装包大小）

   - 内存，避免内存抖动和泄漏、Bitmap 相关
   - 安装包大小，混淆、资源优化、插件化
   - 减少流量，多级缓存复用
   - 电量，**_待写_**

### Android 设计框架

#### MVC

- `Model`(数据处理的操作，如**网络、数据库**)
- `View`(`XML`)
- `Controller`(`Activity`和`Fragment`)

> 缺陷：`Controller`业务逻辑繁琐，臃肿

#### MVP

- `Model` 数据操作
- `Presenter` 核心业务逻辑集中在此处，取消了 `View` 和 `Model` 间的耦合，作为 `View` 和 `Model` 沟通的媒介
- `View` 由 `Activity`/`Fragment`/某个 `View` 担任

  在 `View` 层中，有一个 `Presenter` 的成员变量，需要实现一个接口将 `View` 层的业务操作转交给 `Presenter` 层进行操作

- 使用建议

1. 接口规范化
2. 第三方插件生成（`Dagger`）
3. 简单的页面不使用 MVP
4. 根据复杂程度选择

#### MVVM

- `Model`
- `View`
- `ViewModel` 其中 `View` 和 `Model` 数据双向绑定

> `Google` 自带 `DataBinding` 框架，但是还不完善

---

### 数据持久化

#### SharedPreference

- 整体流程

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

- 读取操作

1. get 线程安全

   `awaitLoadedLocked方法` 锁 `loaded` 挂起，直到加载完数据(loaded 为 true，`notifyAll`后)才进行数据的获取，直接进行 `map.get(key)`

2. put、remove、clear

   `SharedPreferences.Editor`，实现类 `EditorImpl`

   均不是直接操作 `mMap` 的，而是将所有的操作放入 `mModified(newMap)`中，直到之后进行 apply/commit 方法才写入磁盘

3. 同步 `commit`/异步 `apply`

- `commit` 将 `mModified` **同步**到内存的 `mMap` 中(`commitToMemory`)，然后写入磁盘(`enqueueDiskWhite`)，**并直接 await 挂起**，同步完成后通知观察者，返回 true

  > `commitToMemory` 中 `clear` 会清空 `mMap`，而不会清空 `mModified`，按照流程 `mModified` 的内容仍然会赋值给 `mMap`，所以`putXXX().clear().commit()`是错误的

- `apply` 同样地，将 `mModified` **同步**到内存的 `mMap` 中(`commitToMemory`)，将写入磁盘的方法放入异步线程中

- 其他

1. `SharedPreference` 的线程安全，但不是进程安全
2. 首次 `getSharedPreference` 会开辟新线程异步加载，**同时阻塞所有 set/get 方法**，之后调用时直接从缓存中获取
3. get 操作均在内存中 mMap 上进行，同时 `commit/apply` 都是**同步到内存 mMap** 的，只是写入磁盘的方式不同
4. `MODE_MULTI_PROCESS` 多进程模式是通过时间戳和文件大小判断的，并不能保证多进程数据实时同步

> **一定不要在多进程环境中使用** `SharedPreference`，频繁的读写会导致损坏错误；而且**SP 文件不能过大**

#### SQLite

1. 索引 —— B 树索引

   聚集索引（键值的物理顺序）与非聚集索引（逻辑顺序）

   > 例如：字典中，拼音查询为聚集索引；部首查询为非聚集索引

   优缺点：

   1. 加快检索速度，加速表与表之间的连接，二分搜索
   2. 减少查询中分组和排序的时间
   3. 索引占用空间，且需要动态的维护

2. 在 SQLite 中使用索引

   SQLite 中不支持聚集索引，Android 默认需要一个 `_id` 字段，也就扮演了一个索引的角色，所以不要在声明了`INTEGER PRIMARY KEY` 的主键上声明索引

   索引的生效条件——前导列

   在 `WHERE` 子句中，前导列**必须使用等于或者 IN** 操作，**最右边的列可以使用不等式**，这样索引才可以完全生效

   覆盖索引 `O(logn)` 与 非覆盖索引 `O(2logn)`

3. B+树、B 树、红黑树

- 为什么用 B+/B 树？

  叶子节点多，树的高度比正常二叉搜索树低，在磁盘的读取上性能更好

- 为什么用 B+树？

  **B+树的所有内容都在最下面的叶子节点**中，这意味着查询的路径长度永远相同，**查询的时间十分稳定**

  **B+树的磁盘读写代价更低**，因为**非叶子节点不会存储像 B 树一样的具体信息的指针**，减少了存储压力

  B+树的叶子节点以**链表形式连接**，**范围查询的时候性能很高**（注意：**B 树对数据库范围查询的支持效率极低**）

#### 文件

用于存储简单的文本数据和二进制数据

### 动画

#### 动画类型

1. 视图动画：补间动画、逐帧动画
2. 属性动画

#### 补间动画 Tween

通过确定开始和结束，中间过程由系统补全

- 类型：平移、缩放、旋转、透明度变化

- 应用场景

1. 标准 `View` 视图的基础动画
2. `Activity/Fragment` 的页面切换效果，如淡入淡出、左右滑动等

- 使用

1. 核心类 `Animation`
2. 在 `res/anim` 静态创建或者 Java 代码中动态创建
3. `loadAnimation`获取 xml 动画 / 动态创建 `Animation` -> `startAnimation`
4. Activity/Fragment 页面的切换动画效果

- 高级用法

1. 组合动画 `<set/>` / `AnimationSet`
2. 监听动画 `setAnimationListener` 也可使用 `AnimatorListenerAdapter`

#### 逐帧动画 Frame

按帧播放动画，每一帧为一张图片，容易 OOM

- 不可作用于 View 组件的属性（如颜色、背景等）
- 用于较为复杂的个性化动画效果

- 用法 `AnimationDrawable`

#### 属性动画 Property

- 作用于任意 Java 对象，不再局限于视图 View
- 通过在一定间隔内，不断的改变属性值来实现动画效果（个人感觉像是补间动画的自定义版本）

- 使用

  定义初始值、结束值

  设置变化逻辑(估值器、插值器)

  通过 `ValueAnimator`(手动) 和 `ObjectAnimator`(自动) 进行赋值（`addUpdateListener`）

  刷新视图，`View.requestLayout()`

  1. `ValueAnimator` `<animator/>`

     ofInt，整型过渡；ofFloat，浮点型过渡；ofObject，对象过渡

  2. `ObjectAnimator` `<objectAnimator/>`

  自定义属性 property(get/set 方法) `ofFloat(Object, property, float... value)`

- 插值器 `Interpolator` 确定了过渡变化的模式（如匀速、加速等）

  主要用于非线性运动的动画效果

- 估值器 `TypeEvaluator` 初始值到结束值的过渡逻辑，即**协同插值器**确定变化的具体值

### 最新技术

#### 断点续传

#### 热更新

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

#### Okio

1. 核心基础类 ByteString 与 Buffer
2. Source 与 BufferSource 输入流
3. Sink 与 BufferSink 输出流

- 特点

  超时机制：Socket 的异步超时、普通流的同步超时保证稳定

  时间换空间，Segment 双向循环链表和 ByteString 不可变对象

  方便：Source 和 Sink，支持 Socket，实现均在 Buffer 中

### Retrofit

仅负责网络请求接口的封装，具体的请求仍由 Okhttp 实现

用注解和接口的形式简化网络请求的一系列配置

可扩展性：`请求适配器 CallAdapter` 和 `数据解析器 Converter` 的扩展

#### 初始化流程

1. 初始化 配置网络请求参数

   > 建造者模式、工厂模式、装饰者模式、策略模式、代理模式

   `Retrofit.builder().xxx.build().create(RestService.class)`

   `create()`方法：

   -> **动态代理** 我们自定义的调用接口类 (`InvocationHandler` 为代理实现类) 返回一个代理对象

   -> 加载 `serviceMethod` 对象，并缓存起来

   同时内部创建此方法的**请求适配器和解析器**（**工厂模式、策略模式**）

   -> 创建 `OkhttpCall` 对象，由`Okhttp3.Call` 封装

   -> `serviceMethod.callAdapter.adapt(OkhttpCall)` 根据 okhttpCall 对象**适配返回 call 或者其他类型**，同时内部用 `ExecutorCallbackCall` 包装（**装饰者模式**）

2. 网络请求执行与适配

   执行器 `OkHttpCall`、适配器 `CallAdapter`

3. Okhttp 底层请求数据

   **类似 Okhttp 的流程，具体见上**

   -> `(ExecutorCallbackCall)call.enqueue(callback)` 或 `execute()`

   -> `(OkhttpCall) call.enqueue` 或 `execute`

   -> `createRawCall()` 返回 Okhttp 的 call 对象

   1. `(OkhttpCall)serviceMethod.toRequest()`

   2. `callFactory.newCall(request).execute()/enqueue()`

   -> `okhttp` 通过 call 开始请求...略

4. 数据解析 Converter
5. 回调 Executor

#### 执行器与适配器

默认执行器 `OkhttpCall`

适配器 `CallAdapter` 将默认的执行器转换成不同平台的执行器（如 `RxJava 执行器`）

#### 解析器 Converter

> 工厂模式，数据转换器工厂

Gson、Scalars、etc

#### 回调执行器 Executor

默认 Executor 是获取了主线程的 handler 然后向主线程发送消息的

### Gson

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

线程池：`GlideExecutor`

**加载源文件**、**硬盘缓存**和**动画**三个线程池

#### 切换线程

图片异步加载成功，在主线程更新 View

在 Glide 中也是使用 Handler 进行线程的切换

#### 缓存问题

三级缓存机制：活跃资源、内存、硬盘三级缓存

当图片要加载时，**先从 active 中取，然后再从 cache 中取，还取不到就是重新加载**

1. `DiskCacheStrategy` 缓存策略

2. 通过**键值对**的方式进行缓存

- `ActiveResource` 是一个弱引用的 Map

  当图片加载时，会放入 `ActiveResource`，当图片的生命周期结束时，放入 `MemoryCache`，也就是内存缓存中

  > 之所以需要 `activeResources`，它是一个随时可能被回收的资源，`memory` 的强引用频繁读写可能造成内存激增频繁 `GC`，而造成内存抖动。

- 内存缓存 `LruCache`

  > 内部用 `LinkedHashMap` 实现

- 磁盘缓存 `DiskLruCache`

#### 生命周期管理

- ImageView 的内存泄漏问题

  在 `Glide` 中，用 `WeakReference` 修饰 `ImageView` 解决了此问题

  同时为了保证加载任务的及时取消，Glide 也进行了生命周期的管理(`with(context)`)

- 流程

  -> with 方法绑定

  -> **新建一个没有视图的 RequestManagerFragment**，持有一个 lifecycle，通过此 `Lifecycle` 通知 `RequestManager` 进行生命周期的操作

  -> `onStart` 继续加载/`onStop` 暂停加载/`onDestroy` 停止加载并清除

#### 图片加载 OOM

1. 软引用 `SoftReference`
2. `Glide` 中使用 `onLowMemory` 回调防止 OOM
3. 图片压缩方法，存储格式
   > `ALPHA_8`（每个像素 1 字节，无颜色信息）、`ARGB8888`（ARGB 分别 1 字节）、`ARGB4444`（ARGB 分别 4 位，半字节）、`RGB565`（分别 565 位，共两字节，无透明度信息）
4. 基于 `Bitmap` 的存储位置

   压缩图片，将像素数据不放入`Java堆`中，转而放入`native堆`中（`Android 8.0` 以上的 Bitmap）

### EventBus

发布订阅模式（观察者模式)

#### 三大角色

1. `Event` 发布的事件
2. `Subscriber` 订阅者，处理者
3. `Publisher` 事件发布者

#### 线程模型

1. `POSTING` 默认，发布者和处理者在同一个线程
2. `Main` 处理者在主线程
3. `Background` 处理者在后台线程
4. `Async` 无论如何处理者都将新建一个线程执行
5. `MainOrdered` 按顺序执行，也是在主线程

#### 流程

-> `EventBus.getDefault()` 获取单例，双重校验锁

-> `register(context)` 注册，获取所有订阅的方法 `SubscribeMethod`

> 先通过缓存，再通过反射查找类的订阅方法 `findUsingReflectionInSingleClass()`

-> `subscribe(subscriber,method)` 将方法订阅，得到下面两个 map

`subscriptionsByEventType` 为 `Map<EventType,Subscription>` 发送事件、释放资源时要用

`typesBySubscriber` 为 `Map<Subscriber,List<EventType>>` 释放资源时要用

> 和注册同理，`unregister`就是要将两个 map 的缓存清掉

PS：最后部分有**粘性事件的处理和分发**

-> `post(event)` 发送消息

将 event 放入消息队列，循环出队列处理

-> `postSingleEvent()` -> ...通过 `subscriptionsByEventType` 找到对应的订阅者 `subscription`

-> `postToSubscription()` 通过线程模式判断在哪个线程执行事件的处理

将事件入队等待 `Handler` 处理(`threadPoster`) 或者 直接反射处理(`invokeMethod`)

#### 粘性事件

和普通事件不同的是，我们可以先发送事件，之后再订阅注册事件，这样也是可以**在注册的时候接收的**

`postSticky()` 将事件放入`粘性事件的 Map` 中，如果此事件不粘性（或者已经被注册了），内部也是直接调用 `post()` 进行处理的

#### 索引优化

在**项目编译时**使用**注解处理器**保存事件订阅信息的索引类，这样在注册时可以直接查找取出进行最后的注册，避免了反射造成的性能损耗
