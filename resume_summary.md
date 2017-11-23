#Java相关
##1、几种排序算法

###快速排序
* 时间复杂度: O(nlogn)
* 步骤：   
  1、 取基准值（一般为第一位）、左侧第一位（start）、右侧第一位（end）  
  2、 从右侧第一位开始跟基准值比较，直到比基准值小，调换位置；  
  3、 然后将左侧第二位跟基准值比较，知道比基准值大，调换位置；  
  4、 重复步骤2
  5、 将基准值两侧的数重新调用该方法，重新排序  
  
###冒泡排序
* 时间复杂度:n*n
* 原理：依次比较相邻的两个数，将小数放在前面，大数放在后面
* 步骤：     
  1、从第一个位置开始，将其前面的元素逐个与该位置元素比较，当大于该位置元素进行位置交换  
  2、每一轮循环得到第i个位置前的所有元素是有序的   
  3、循环1、2直到比较的位置为最后一位，则所有元 素排序成功    
注：当出现交换顺序后，此时的a[i]就会更改
###插入排序

* 时间复杂度:n*n  
* 原理：把当前待排序的元素插入一个已经排好序的列表中，其余元素后移
* 步骤：  
1、从第2个元素命名为key开始，与其前面的元素逐个比较  
2、当key小于前面的元素时，前面元素后移，该元素插入到该位置  
3、一直比较到位置为0的元素结束  

###选择排序  
* 时间复杂度：n*n
* 原理：每次循环找到待排序元素中最小元素，顺序放在已经排好序的序列最后  

###归并  
* 时间复杂度：O（nlog(n))
* 原理:将两个或两个以上的有序序列合并为一个


##2、一定需要捕获的异常有哪些

**一定要捕获的异常，指的是检查异常，在编译时要求必须处理的异常，也是除运行时异常以外的Exception的子类都属于检查异常**  

* 操作文件时，捕获IOException（如：EOFException，FileNotFoundException）
* jdbc连接时，可能存在连接地址错误要捕获异常
* 通过jdbc执行sql命令时，要捕获SQLException
* 线程等待Thread.sleep(),捕获中断异常InterruptedException



* 中断异常：Interrupted Exception
* 字符串转化为数字异常：NumberFormatException

RuntimeException：


* 数组下标越界异常：ArrayIndexOutOfBoundsException
* 空指针异常：NullPointerException
* 指定类不存在异常:ClassNotFoundException
* 方法参数异常：IllegalArgumentException
* 算术异常：ArithmeticException
* 资源找不到异常：MissingResourceException（如路径不存在，）


##3、equals和==区别？两个类的实例用equals比较的是什么？

* ==比较的是物理内存地址是否相等，相等返回true，不等返回false
* Object类中的equals方法就等于==。判断两个实例的内存地址是否相等（是否指向同一个对象）
* 而String类中的equals方法是重写后的方法。重写后的equals先比较内存地址是否相等，相等返回true，不等，再比较值是否相等，相等返回true，不等返回false

##4、为什么要重写equals？为什么同时一定要重写hashcode？

* 重写equals方法是为了重定义比较内容，否则都是继承Object类中的该方法，相当于==（即只比较内存地址）  
* 重写equals一定要重写hashcode。因为如果不重写hashcode，那么当在集合中（set、map涉及到不可重复的集合中）操作该类的实例时，就会出错，如，添加重复的数据或key  

**详解：**  

* 当两个新建的实例通过重写的equals方法比较时（如，String a=new String(“abc”)；String b=“abc”），由于内存地址不等，但是值相等，返回true。
* 当在集合中操作该实例时（如，集合中添加a后，在添加b时），由于set集合和map中key的唯一性，会拿实例和集合中元素或key进行比较，首先会比较hashcode值是否相等，如果不重写hashcode方法，那么调用Object类中的hashcode方法，得到的hashcode值可能相等可能不等（不等几率很大）（因为Object类中的hashcode值跟内存地址有关），不等时，返回不等，所以添加b成功，那么集合中就会存在重复元素
* 如果重写hashcode方法（一般都会跟重写的equals有关），调用重写的hashcode计算值得到a和b的hashcode值相等，**然后再通过equals比较，首先比较内存地址不等，再比较值，相等，返回true，**此时集合添加元素就不会成功

**注：**

1、java机制，当hashcode不等时，不会比较equals方法  ； 当hashcode相等时，才会比较equals方法  
2、 Object类中的hashcode方法特点：  
内存地址不等——hashcode值可能相等、可能不等；  
内存地址相等——hashcode值一定相等；  
hashcode值相等——内存地址不一定想等；  
hashcode值不等——内存地址一定不等  
3、equals返回true，hashcode则必为true；equals返回false，hashcode则必为false



##5、什么情况下会内存溢出？为什么有内存回收机制，还会发生？

理论上java有内存回收机制（GC）不会存在内存泄露。但是在实际开发中存在**无用但可达**的对象，(即新建后占用内存空间但暂时没有被使用的对象)。这些对象不能被GC回收   
请求垃圾收集，可以调用方法：system.gc()或Runtime.getRunning.gc()
##6、内存模型

##7、接口和抽象类的区别

* 接口中的类必须都是抽象方法，抽象类中的可以有非抽象方法  
* 接口中的修饰符必须是public，抽象类中的修饰符可以包含任意（因为抽象方法必须用public修饰，而抽象类中可以有非抽象方法，也就可以使用其他修饰符）
* 可以实现多个接口，但只能继承一个抽象类
* 抽象类中可以定义构造器，接口中不可以

相同点：  

* 都不能被实例化

##8、final、finally、finaize区别

* final是修饰符。修饰类：表示该类不能被继承；修饰方法：表示方法不能被重写；修饰变量：表示变量只能一次赋值以后不能被修改
* finally是捕获异常时总会执行的语句块。且其会在try中的return前执行，如果返回值被修改，那么返回修改后的值
* finaize是Object类中定义的方法。在GC回收对象之前，先调用该方法来完成一些清理工作 

##9、什么是空间复杂度和时间复杂度

* 时间复杂度：就是程序循环次数
* 空间复杂度：即程序执行过程中新建的内存地址数量  

##10、如何自定义异常

？？？？？？
##11、Java异常机制

###Throwable
Throwable类是所有异常类或错误的超类。其包含两个子类Error和Exception，分别表示错误和异常。  
也称为不检查异常和检查异常（Checked Exception）
###Error
程序无法处理的错误。  
一般指java虚拟机相关的问题。如内存溢出、系统崩溃、虚拟机出错、动态链接失败等。这种错误无法恢复或不可能捕获，将导致应用程序中断。通常应用程序无法处理这些错误。
###Exception
程序本身可以处理的异常  
Exception分为运行时异常（RunTimeException）和非运行时异常。


* ArithmeticException 算术异常：
* ClassCastException 类转化异常：
* IllegalArgumentException 非法参数异常:
* IndexOutOfBoundsException 下标越界异常
* NullPointerException 控制值异常：操作值为null的参数时
* SecurityException 安全异常：

所有异常或者错误可以分为两大类：检查异常（除了运行时异常和error以外的异常类）和非检查异常
##12、java反射

###什么是反射？
java程序能够运行，就要让java类被java虚拟机加载。如果类不被虚拟机加载是不能正常运行的。所以我们运行的所有程序在编译时就知道了你所需要的类已经被加载了。  
java反射机制是指在编译时，并不确定哪个类被加载了，而是在程序运行的时候才加载、探知、自审。  
使用在编译期并不知道的类，这样的特点叫反射

java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法。这种动态获取信息以及动态调用对象方法的功能称为java的反射机制

###反射有什么作用？

* 提高程序的灵活性
私有方法通过反射可以被调用
 

##13、JDBC操作数据库的步骤

* 加载数据库驱动：Class.forName("com.mysql.jdbc.Driver");
* 建立连接：Connection conn = DriverManger.getConnection(connectionURL);  
String connectionURL="jdbc:mysql//"+ip+":"+"port"+"/"+dbName+"?user="+userName+pwd




#数据库相关
##1、union和unionall的区别
联合查询
区别 

* UNION：用于合并两个或多个select语句的结果集，并消去表中任意重复行、同时进行默认规则排序
* UNIONALL：查询的结果集，不消除重复行，不排序

使用规范

* UNION结果集中的列名总是等于第一个select语句中的列名
* UNION内部的select语句必须拥有相同数量的列，且列的顺序必须相同

##2、常用关键字的使用

* group by
* order by
* not in
* like
* left join on 
例：select A.* ,B.* from A left join B on a.name=B.name ：以左边表为基准，匹配两个表中的name
* right join on 
* having
* union/unionall
* inner  join：得到两个表的交集 

##3、having的使用？和where的区别？

* having用在聚合函数（max、min、count、avg、sum）查询时，聚合函数是对多条数据进行操作的，having子句限制的是组
* group by是先排序后分组，所以一般与having组合使用
* having子句中的每一个元素都必须出现在s	elect语句中
* where关键字在聚合函数时不可使用，因为where子句限制的是行

##4、索引的使用？	
###选择标识符

* 整型：通常作为标识符的最好选择。因为整型是有序的，处理更快，可以设置成auto_increment(自增)
* 字符串：尽量避免使用，处理时间比较慢。因为字符串是随机的，所以在索引的位置也是随机的，访问效率非常低

###索引类型。根据数据库的功能，可以在数据库设计器中创建四种索引

* 普通索引：最基本的索引类型，没有唯一性的限制，可以添加重复索引值  
* 唯一索引：不允许其中任何两行具有相同索引值（unique关键字）
* 主键索引：数据库表中一列或列组合的值唯一标识表中的一行，该列称为主键。(primary key)
   * 在数据库中定义表的主键会自动创建主键索引，主键索引是唯一索引的特定类型。
   * 尽管唯一索引有助于定位信息，但为获得最佳性能结果，建议改用主键索引
* 聚集索引：在聚集索引中，表中行的物理顺序和键值的索引顺序相同，一个表只能包含一个聚集索引（clustered）

###索引增删查(表明stu,列名id，name,sco)

####1、查看表的索引
   show index from stu
####2、添加索引(括号内为列名)
 
* 普通索引：alter table stu add index indexname(column—name);  
 添加多个普通索引：alter table stu add index (name,sco);
* 唯一索引：alter table stu add unique(sco);//给sco列加唯一索引，索引名默认为列名
 添加多个唯一索引：alter table stu add unique(name,sco);
* 主键索引：alter table stu add primary key(id); 

####3、删除索引

* 普通\唯一索引：alter table stu drop index indexname;
* 主键索引：alter table stu drop primary key;(因只有一个主键，索引不用指定index名)
###创建索引的缺点

* 增加了数据库的存储时间。因为索引需要占据物理空间
* 在插入、修改和删除数据时索引也会随之变动，要花费较多的时间

###创建索引的原则及优点

* 在经常需要搜索的列上添加索引，可以加快搜索速度
* 在作为主键的列上，强制该列的唯一性和组织表中数据的排列结构
* 在经常用在连接的列上（主要是一些外键），可以加快连接速度
* 在经常需要排序的列上创建索引，因为索引已经排序，在查询时可以利用索引的排序，加快排序查询时间
* 在经常使用在where子句中的列上面创建索引，加快条件的判断速度

###不创建索引的列

* 在查询中很少使用或者参考的列不需要
* 很少数据值的列不需要创建索引
* 对于定义为text、image、bit数据类型的列不应增加索引，因为这些列的数据量要么相当大，要么取值很少


##5、数据库数据量大的查询，如何提高查询效率

* 建立索引（index）
* 语句优化。select * 改为具体的参数
* 分库／表。同时操作多个库去查找  

##6、Sql实例

学生成绩表（id、name、score、date）

* 查询最大分数：select max(score) from table group by score
* 查询每门成绩大于80的人：select name ,min(score) from table group by name having min(score)>=80
* 查询有至少三个成绩想同的人：select name , count(name) from table group by score having count(name)>=3
* 查询当天记录了10人以上的日期：select date ,count(name) from table group by date having count(name)>=10

学生表B（Tid，Sna，score）

select B.*   
from B  
inner join (select max(score),Tid from B group by Tid)as A   
on  B.score=A.score and B.Tid =A.Tid
##7、增删改列
* 查看表信息 desc tablename
* 增加列：alter table stu add column 列名 char(10);
* 删除列：alter table stu drop column 列名；
* 修改表名：alter table stu rename stu1
* 修改列名：alter table stu change name name1 char;

 
#Linux／Shell相关


##1、 ps（process status）：查看系统当前运行的进程（非动态，是进程快照，执行ps时的进程状态）

PID TTY TIME CMD

* PID ：process identifier。进程标识符。即各进程的身份标识。当程序一运行，系统就会自动分配给进程一个独一无二的PID。进程终止后，PID被回收，可能继续分配给新的进程
* PPID：父进程id
* TTY：Teletype。启动进程的终端名。不是从终端启动的进程显示为 ？
* TIME：进程使用CPU的时间总计，单位秒
* CMD：command。执行的命令  

常用参数  

* ps -A ：显示所有进程
* ps a：显示现行终端机下的所有进程，包括其他用户的程序（同-A）
* ps -a：显示同一终端下的所有进程
* ps -t<终端机编号>：指定终端机编号，并列出属于该终端机的进程的状况
* ps -u:显示指定用户名下的进程
* ps -e:同 -A
* ps e :列出进程时，显示每个进程使用的环境变量
* ps x:显示所有进程，不以终端机来区分
* ps -l :较长较详细的将属于自己的这次登入的PID与相关信息列出来
* ps -o pid,comm :显示指定的字段
* ps:不加参数，表示查看当前进程
常用命令

* ps -aux：列出目前所有的正在内存中的进程。包括无终端的（x），和针对用户（u）的进程（显示所有包含其他使用者的进程）
* ps -aux >procces.txt :把所有进程显示出来，并输出到文件中
* ps -ef：显示所有进程信息，连同命令行
* ps -ef |grep  mysql：查找mysql进程的pid
* ps -u root 显示用户名root下的所有进程
* ps -au:显示较详细的资讯

##2、top 动态显示进程信息，对进程实时监控
##3、kill 杀死进程
Linux上进程的5中状态  
1、R ：（runnable）正在运行或在运行队列中等待  
2、S：（sleeping）中断（休眠中、受阻）  
3、D：（uninterruptible sleep）不可中断。收到信号不唤醒和不运行，进程必须等待直到中断发生  
4、Z:(zombie)进程已终止。但进程描述符存在，知道系统调用wait()后释放  
5、T：进程收到sigstop、sigstp、sigtin、sigtou信号后停止运行  


* kill <pid>：杀死指定进程
* kill -9 <pid>：强制杀死指定进程
* killall  -9  mysql：杀死所有以mysql命名的进程（在不知道进程pid时，通过名字杀死进程）
**注：kill 后面可以使用进程号、进程名字**

**3.1 批量杀死后缀名为sh的进程**  

* shell命令形式   
ps -ef|grep .sh|grep -v grep |awk '{print  $2}' |xargs kill -9
* xargs
ps -ef|awk '/sh/{print $2}'|xargs kill -9



##2、awk
见java_issue
#前端问题
##1、post和get的区别  
##2、url测试点
##3、如何判断问题属于前端问题还是后端问题?

通过F12开发者工具实时监控请求

* 如果某个操作，Network里面有请求，且请求参数正确，说明前端请求发送没问题
* 请求发送后，点开Network里的请求查看详细信息，Status Code表示后端接口处理结果，如果500开头，则确定接口出错。
* 200或其他，再看Response结果，如果数据与预期或者条件不一致，说明接口问题，如果结果没问题，页面显示不对，那就是前端问题
* 还有一种是前后端状态码不匹配，后端返回的状态码与前端显示信息不匹配  

#新一轮总结
##一、GD 2017-10-30
##1、数据库相关
###1、 Mysql索引类型有哪几种？  
一般索引、唯一索引、主键索引、聚集索引
###2、  对int型和字符串类型column分别加索引，哪种查找的效率更高？   
int 型是有序的，可以设置自增，查找方便；    
string 是随机的，处理较慢  
###3、 MySQL存储过程

##2、java相关  

###1、Java连接数据库做CURD是的步骤
###2、 Spring特性
###3、 Java解析JSON、Java解析XML用到的方法及如何实现
###4、 HttpClient使用，如何上传文件


##二、Sina 2017-11-2
##1、radiobutton相关属性

* 隐藏 ：isEdit==0不可编辑状态，isEdit==1可编辑状态
* 默认勾选 ：checked
* 不可点击、输入 ：input type="radio" disabled

##2、前端传入数据库的值是放在哪个参数下的？
通过jsp页面传的参数，都是以name--value 成对出现的，通过servlet中request.getparamater("name")得到页面的参数，是获取页面中name属性的value值。一般input输入框，value为输入内容。radiobutton的value是写死的。
##3、将String str=“436bcs”存储到int[ ]数组中，并输出
##4、测试相关
###1、 微博关注流的测试要点
 * 排序，即消息更新的显示顺序，如是按时间还是热度
 * 消息必达性要高。消息推模式。关注的人更新了状态，粉丝是否收到提醒，且什么样的粉丝会收到提醒。如在线用户，非在线用户不会提醒，下次登录时会更新提醒
 * 拉模式。用户主动刷新，是否遍历关注人的动态，将最新的动态显示出来。不关注的人的状态是不显示给用户的
 * 用户操作体验。如常用操作位置是否合理，内容展示是否正常
 * 每次刷新，列表展示多少条动态，对服务器或者对用户端的压力和体验更好
 * 
###2、移动端兼容测试如何处理

##5、性能测试相关
### 关注的指标
 * 并发用户数：系统用户数指可使用系统的用户数，如注册用户数；同时在线用户数，指同时登陆系统的用户。
 并发用户数=同时在线用户*用户平均在线时长/总工作时长
 * 响应时间：服务端系统处理时间
 * 吞吐率：单位时间内网路上传输的数据量（三个常用指标可表示吞吐率）
     1. TPS(每秒事务数)
     2. HPS（每秒点击数）
     3. Throught/s（每秒系统处理的用户请求数量）
 * 系统资源（CPU、内存、网络、磁盘）
   1. CPU使用率：报告中显示
   2. 内存使用率：报告中显示可用内存，用（测试服务器的总物理内存-可用内存）/总内存=内存使用率
  
## IQY 11-3
##1、linux常用命令？

###1、查询文件内容中包含test的行并显示行号？   
cat |grep -n test 文件名   
注：查询内容 test 、'test'、"test"都可以执行
###2、查询进程名为test的进程   
ps -ef|grep  "test"|grep -v grep
###3、查看日志常用命令
  * tail -f 文件名 
  循环查看文件内容。
  * cat 文件名(实时的滚动显示请求) （命令实现同上）
   
###4、grep -E的使用场景  
开启正则表达式匹配模式（在查询内容和文件名中涉及到正则表达式匹配的时候要使用-E）
 
##2、数据库相关
* 查询a表和b表id相等的记录(内连接)  
 select * from a inner join b on a.id=b.id

##3、Java相关
* 归并的实现，以及该接口的测试case

##4、接口测试用例设计（关注返回code的覆盖）
### 接口通用测试用例设计
   * 通过性测试：保证接口功能能正常使用
   * 异常测试：参数传入不按规定，如必填、参数组合、参数有无和null、参数顺序、个数、参数类型、特殊字符	
   * 接口安全：如Sql注入、敏感参数是否加密、
   * 业务逻辑测试：接口之间的逻辑设计测试用例。如登录5次失败，等15分钟；下单购买时，需用户是登录状态
   * 返回code的覆盖
  
##5、用例覆盖率如何保证
##6、性能测试相关

### 如何确定性能的极值或者瓶颈？异常率达到多少表示有问题
 * 判断CPU瓶颈:  
    1.处理器时间 平均值大于95  
    2.处理器队列长度大于2
    3.CPU空闲时间为0  
    4.过高的用户占用CPU时间（表示耗费CPU的数据库操作，该值高，可考虑添加索引）  
    5.过高的系统占用CPU时间（长期大于90%或95%） 
 * 判断内存瓶颈与内存泄露  
    1.如果可用物理内存的值很小（4MB或者更小），则说明计算机总内存不足，或某程序没有释放内存
 * 定位磁盘瓶颈  
    1.磁盘每秒的读写时间大于20ms，可能出现磁盘瓶颈  

##7、视频卡顿的原因？
##8、项目相关
* 底层如何实现

## MT 11-3
##1、进程相关
###1、 进程相关命令  
 ps 、top、kill、 man ps(显示ps命令的详细介绍) 
nice（sudo nice 优先值 进程名 ）改变进程的优先级范围-20到19，值越低，优先值越高，进程以0启动
###2、ps -ef 和ps -aux区别   
  ps -ef 显示所有进程信息，连同命令行  
  ps -aux（和ps aux查询结果一样）： 列出目前所有的正在内存中的进程。包括无终端的（x），和针对用户（u）的进程（显示所有包含其他使用者的进程） 
  
###3、查看cpu占用率最高的进程   
top 然后按下大写P，按照CPU排序 ；按下大写M，按内存排序  

##2、性能测试相关
* 性能测试如何开展？场景设计？
* cpu占用率高的的原因有哪些？如何解决？
* 1个人请求和100个人请求，请求处理时间变慢的原因是什么
* cpu占用率下降，但处理时间变长什么原因？

##3、接口测试相关
### 接口请求没有结果的原因？  
除了中间传输中断，主要可能是链接超时**timeout**

##4、数据库相关
###1、多表联查常用关键字   
**笛卡尔积：A=（a，b）B=（1,2,3） ，两个集合的笛卡尔积为（a，1）(a,2)(a,3)(b,1)(b,2)(b,3)** 

 * 内连接（A inner join B on 连接条件）：返回连接表中符合连接条件和查询条件的数据行（连接表就是数据库在做查询时形成的中间表）  
  隐式内连接：Select * from 表1，表2 where 表1.id=表2.id  
  显示内连接：Select * from 表1 inner join 表2 on 表1.id=表2.id  
  区别在于隐式的中间表显示的是两表的笛卡尔积，而内连接的中间表为on 条件过滤的笛卡尔积（结果是一样的）
 * 左（外）连接(A left join on B on 连接条件 where 查询条件)：根据on连接条件过滤两个表的笛卡尔积，但是会以A中的连接条件列全部显示，不管B中有没有该记录
 * 右（外）连接：与左连接相反。结果集以B中连接条件为主 
 
###2、 like模糊匹配   
* % ：代表0个或多个任意字符  like ‘%ab’以ab结尾的任意长度的字符串   
* _ ：代表任意一个字符  like ‘a_b’ 匹配长度为3的头尾为ab的字符串    
* [0-9]或[abcd]: 表示匹配括号内任意一个字符  
* [^a]:匹配不是括号中内容的字符  

###3、 得到查询结果的10条记录，Mysql和SqlServer分别如何实现  
 * mysql：查询表中id前三大的数据  
 select * from table order by id desc limit 3   
 limit m,n (m是偏移量(从0开始)，n是返回的行数)    
 limit 5，10 表示从第6行开始，输出10行  
 limit 10，-1 表示输出第11行到结尾的数据
 * sqlserver：select top 10 from table
 后10行：select top 10 from table order by id desc
 * oracle：select * from table where rownum<=10;

###4、delete和drop的区别  
delete from 表名 删除表中的所有数据  
drop table  表名 从数据库中删除该表

##5、java相关
###1、 interface和abstract类的应用场景
  * interface作为一个统一规范，用来定义一系列方法的规范，方便在不同类中实现同样的方法时，有一个统一的定义
  * abstract class 作为一个公共的模板，定义一系列公共方法的实现，以及一些抽象方法，来方便子类在继承后，不用再实现公共方法，而是重写抽象方法来实现自己的特性，提高效率
 
###2、单向链表的一些列操作？
###3、 5的阶乘（递归）
  首先判断参数是否==1，true return  
  实现递归调用：return  i*method(i-1) 
###4、jdbc连接数据库过程（代码层面）  
  * 加载驱动 Class.forName("");
  * 定义数据库地址，及用户名：  
    String url ="jdbc:mysql://10.0.11.224:3306/数据库名字；  
    String username="user-center";String password="";
  * 建立链接：Connection conn =DriverManager.getConnection(url,username,password);
  * 定义SQL语句：String sql=“”；
  * 创建容器：Statement stat=conn.createStatement();
  * 将sql放到容器中执行：state.excuet(sql)
###5、 list和Arraylist的区别
 * List（列表）是接口，不能实例化，定义了一些方法，ArrayList是实现了List接口的类
 * ArrayList是数组列表，不是一种数据结构
###Array和ArrayList（列表）区别
 * Array在初始化时必须定义大小，后者则不需要，容量可动态增长
 * Array只能存储类型相同的对象，如int[]只能存整型数据；ArrayList可以存放不同类型的数据（因为里面存放的是被装箱的Object对象）
 * Array不能随便删除和增加其中的项，ArrayList可以利用arraylist.remove(“a”)方法删除数据 
 
###6、数组Array和链表link的区别及优缺点？ （数组和链表都是一种数据结构）
  数组在内存中给出了连续的空间，链表在内存地址上可以是不连续的   

  * 内存利用率。  
  数组需要连续的内存空间，所以内存利用率低，链表内存可以是分散的空间地址，内存利用率更高  
  * 扩展性。  
   链表长度不固定，可扩展性强；数组建立时必须是固定的长度，没办法扩展
  * 查询效率。  
   因为数组在内存空间是连续的，所以可以随机访问，查找效率更高；链表不能随机访问，必须得通过上一节点才能找到下一节点，访问效率低；  
  * 插入删除效率  
   链表的插入和删除效率更高，链表只需要更改要插入和删除的节点的信息接口，其他节点不受影响；数组中插入和删除元素时，其他的元素的位置都要移动

###7、TestNG和Junit的区别？Junit是否可以生成报告
  * TestNG是Junit的升级，基本涵盖了Junit的特性
  * Junit4依赖测试不友好，在前一个测试用例执行不成功后，后续所有的测试都会失败。TestNG使用@Test（dependOnMethods={"method1"}）实现依赖测试。在method1执行成功后，执行该方法，否则依赖的方法将会被忽略，不被执行，而不是标记为失败 
  * 都支持参数化测试（@Parameter），但是Junit的限制更多，没有TestNG灵活。TestNG的参数化数据可以维护在XML文件中，也可以写在类里面注释，可以使用复杂的参数类型，没有限制
  * Junit4中如果使用@BeforeClass和@AfterClass，那么该测试方法必须声明为static静态方法
  * TestNG套件测试引入了组的概念，在XML文件中配置来实现，Junit声明在类内部
  * 两个都生成报告
  
###8、TestNG和Junit中@test和@beforetest等注释的使用
  * @Test ：标注为测试方法或类
  * @BeforeSuite：测试套件在执行之前需要执行的
  * @BeforeTest：在测试之前执行
  * @BeforeGroups：在一个测试方法所属的任意一个groups的第一个方法被调用前执行
  * @BeforeClass：当前类的第一个测试方法之前执行
  * @BeforeMethod：在每次测试方法之前执行
  * @Test（enable=false）；Junit中@Ignore忽略测试
  * @Test（timeout=100）：测试超时时间，测试执行时间超过设置的时间，标记为失败  
  
###9、 在所有测试case开始前（不是某个case开始之前）进行一些操作（如清库等），怎么处理？
  * 在XML文件中配置
  * 使用@BeforeSuite??

##6、linux相关
###1、 常用linux命令  
 * 文件内容查看：  
 head( -n 20 显示文件前20行)、tail、cat(显示整个文件)、more 文件名（显示文件的一页，按space键翻页）、less(比more多了向上查找？) 、grep
 * 文件和目录管理：  
 pwd、ls(显示文件和目录)、touch、mkdir（-p dir1/dir2 创建目录dir2时连同上级目录一起创建）、rmdir(-p 连同上级目录一起删除)、 cp、rm（-f 强制删除）、mv 原文件名 新文件名（修改文件名）、
 * 磁盘查看：  
 df 、du  、fdisk（磁盘分区）
 * 进程相关
 见MT1  
 
###2、 vim下常用命令，如查找关键字  
／要查找的内容   回车定位查找的字符  
 ？查找内容 从文件末尾网上搜   
 查找下一个字符按下小写n，上一个大写N  
###3、如何创建文件夹  
mkdir 文件夹名
###4、 查看磁盘使用情况  
df  显示磁盘的使用情况  
du  默认显示当前目录下的文件及目录所占的磁盘空间

##7、git相关
###1、git常用命令  
* 代码提交相关：  
git status \git add \git commit -m\git push\git pull\
git log (列出历史提交记录)  
* 分支管理：   
git branch (列出分支)\git checkout(切分支)\git merge(合并分支)\git branch -d dev(删除dev分支)

###2、如何处理冲突  
  * git pull 后出现 CONFLICT 关键字说明有冲突，且会自动merge冲突（将修改合并在一起）
  * 在文件或代码中会出现<<<<<<<HEAD  之间是自己本地修改的内容======中间是别人修改的内容>>>>>>>
  * 直接编辑文件，将冲突的标记删除，并把冲突解决好
  * 然后直接add,commit,push编辑好的冲突文件，完成解决 
###3、如何创建分支  
git branch 分支名

##8、协议相关
###1、 协议都有哪些层？Http、TCP分别属于哪层？
 * 物理层
 * 数据链路层：WIFI、
 * 网络层协议：IP
 * 传输层协议：TCP、UDP
 * 应用层协议：HTTP、FTP、DNS
 
###2、 TCP和UDP的区别？
 * TCP面向连接；UDP是无连接的，即发送数据之前是不用建立连接的
 * TCP提供可靠，稳定的服务，通过TCP连接传送的数据，无差错、不丢失、不重复、有序到达；UDP不保证可靠交付，数据传输时可能丢包
 * TCP面向字节流，UDP面向报文
 * TCP占用系统慢、占用系统资源高
 * 每一条TCP连接只能时点到点的；UDP支持一对一、一对多、多对一和多对多点交互通信

 **备注：当对网络质量有要求时候，如要求数据能准确无误的传递，如浏览器、邮箱；UDP：对网络质量要求不高时，要求网络通讯速度尽量快，如QQ语音、视频等**
 
###3、 Http和Https的区别？端口号分别是多少？
  * Http协议是明文传输的，安全性低；Https是在Http的基础上加了SSL加密协议，更加安全
  * Https协议握手阶段比较耗时；连接缓存不如Http效率高，会增加数据开销和功耗
  * Http端口是80，Https端口是443
  
###4、Https的加密过程是如何实现的？
 * 客户端发送Https的协议请求到服务端，要求建立SSL连接
 * 服务器收到请求后，会将网站的证书（包含公钥）传给客户端
 * 客户端与服务器开始协商SSL等级，客户端会根据协商好的等级产生随机对称秘钥，然后利用公钥将对称秘钥加密，并传送给服务器
 * 服务器利用自己的私钥解密出会话秘钥（只有对称密钥匹配成功才可以处理请求）
 * 服务器利用会话秘钥加密与客户端的通信
 
###5、Http1.1和Http1.0有什么区别？
  * Http1.1默认支持长连接和流水线处理。  
   Http1.0规定浏览器与服务器只保持短暂的连接，浏览器的每次请求都与服务器建立一个TCP连接，服务器完成请求处理后关闭连接。（页面中含有较多图像URL地址时，每次获取图片都要建立TCP连接）。  
   HTTP1.1允许客户端不用等待上一次请求结果，就可以发出下一个请求
  * 节约带宽  
   Http1.1增加了新的状态码100（continue），且支持只发送带有Header的请求，如果服务器返回100，则客户端继续发送带有实体body的完整请求；如果服务器返回401，表明服务器因为权限拒绝访问，此时客户端就不用发送请求了。
  * Http1.1支持Host参数，Http1.0没有Host域  
   Http1.0中认为每台服务器都绑定一个唯一IP，因此请求中并没有传递hostname。但是随着虚拟主机技术的发展，一台物理服务器上可以存在多个虚拟主机，并且共享一个Ip地址。  
   Http1.1请求和相应消息都支持host域，且请求中没有host头域会报400的错  
   
###6、Http1.1和Http2.0有什么区别？
   * 多路复用  
   Http2.0使用了多路复用技术，做到同一个连接并发处理多个请求，并且并发请求的数量比Http1.1大了好几个量级
   * 数据压缩  
   Http1.1不支持header的数据压缩，Http2.0使用Hpack算法对header的数据进行压缩，这样数据体积小了，在网络上传输就更快
   * 服务器推送  
    当对支持Http2.0对的webserver请求数据时，服务器会顺便把一些客户端需要的资源一起推送到客户端，免得客户端再次创建连接发送请求到服务器获取。非常时候加载静态资源。（服务端推送的资源会存在客户端的某个地方，客户端直接从本地加载这些资源就可以了，不用走网络）

###7、如何将抓取的请求指向本地？
###8、 get和post区别
 * get是从服务器获取数据，post是向服务器传数据
 * get是将参数直接添加到请求的url中，post是将表单内各个字段及内容放在html header内传到请求中，用户看不到这个过程
 * 参数数据类型post只接受ASCII字符，post没有限制
 * get请求参数会被完整保留在浏览器的历史记录里，get安全性非常低；post安全性高。
 * get的执行效率更高。get产生一个tcp数据包（httpheader 和data一起发送出去），post产生另个，浏览器先发送httpheader ，服务器相应100 continue,浏览器再发送data，服务器返回200。


##9、jmeter相关
### jmeter可以处理那种类型的协议？ftp？tcp/ip?可以处理吗

##10、Selenium相关
###常用识别页面控件的属性有哪些？
 * id：dom元素首选
 * name：表单（input）定位首选
 * class：代表某种样式属性，很可能重复、不能精准定位
 * xpath：元素的一个相对地址
 * LinkText：连接内容定位
 * css：
###id和class属性识别上有啥区别
class定位元素没有id精准
### path如何拼接？

Xpath使用路径表达式来选取XML文档中的节点。Xpath中有七种节点：元素，属性，文本，命名空间，处理指令，注释，以及文档节点（根节点）

* nodename:选取此节点的所有子节点
* /：从根节点选取
* //：从匹配选择的当前节点选择文档中的节点，不考虑它们的位置
* . ：选取当前节点
* ..：选取当前节点的父节点
* @ ：选取属性  

例子：
<bookstore>

<book>
  <title lang="eng">Harry Potter</title>
  <price>29.99</price>
</book>

<book>
  <title lang="eng">Learning XML</title>
  <price>39.95</price>
</book>

</bookstore>

* bookstore：选取bookstore的所有子节点
* /bookstore：选取根元素bookstore
* bookstore/book：选取bookstore下的所有book元素
* //book：选取book元素，不管其位置
* bookstore//book：选取输入bookstore后代的所有book元素，不考虑其位置
* //@lang：选取名为lang的所有属性
####谓语 用来查找某个特定的节点或者包含某个指定值的节点
* /bookstore/book[1]：选取bookstore子元素的第一个book元素
* /bookstore/book[last()]:最后一个book [last()-1]倒数第二个元素
* /bookstore/book[position()<3]：选取前两个book元素
* //title[@lang]：选取所有属性名为lang的title元素；[@lang='eng']所有属性值=eng的title元素
####选取未知节点

* *：匹配任何元素节点。/bookstore/* 选取bookstore所有子节点
* @*：匹配任何属性  //title[@*]选择所有带有属性的title元素
* node()：匹配任何类型节点
* //book/title | //book/price ：选取book元素的所有title和price节点

##11、测试环境相关
* 环境部署及要装的软件

##Di 11-8
##1、Java相关
###代码实现字符串a是不是字符串b的循环子串  
见String包-substring2类
###代码实现将字符串转换为int型，尽量多考虑情况，且不适用内函数
###快排的时间复杂度和实现  
nlongn  

##2、Linux进程相关
###xargs什么意思  
将前一个的结果作为后一个操作的参数
###awk是否使用过？用在什么时候
匹配打印，对查询结果的某行数据进行打印及操作
###查询进程号为123的进程  
ps -ef|grep 123|grep -v grep

##3、项目相关 
### 有review代码吗？主要关注点？出现频率比较高的问题有哪些？
 

##MT11-15
##1、Java相关
###数组奇数放在左面，偶数放在右面
参照arrays-Ji_OuArray
###输入出生年月日，计算总天数
###如何判断链表是环
###栈和堆的区别
* 堆（Heap）：堆内存中存放由new创建的对象和数组，由java的GC（垃圾自动回收器）来管理。堆的优势是可以动态的分配内存大小；缺点是由于动态分配内存存取速度慢。
* 栈（Stack）：函数中定义的一些基本类型（8种基本数据类型）的变量和对象的引用变量存在栈内存中。栈的优势是存取速度比堆快，仅次于寄存器，栈数据可以共享；缺点是存在栈中的数据大小与生存期是固定的，缺乏灵活性。（栈是先进后出）  
* 方法区:存储已经被JVM加载的类信息，常量和静态变量  
如int a=2; String str=new String("abc");  
a 和str在栈中；new String 在堆中； 2和abc在数据区的方法区
##2、数据库相关
###事务
###delete和什么的区别
###什么是索引？在哪些地方添加索引
###慢查询的原因

##3、进程相关
###让进程在后台运行
通过远程连接到服务器时，如果网络中断或关闭连接时，执行的进程会中断，如果想让进程不受连接中断影响继续执行，则要让进程在后台执行  

* nohup：让提交的命令忽略hangup（中断）信号。由于连接的中断已经关闭，所以一些输出到屏幕上的内容和一些日志会保存到nohup.out文件中。一般在末尾加上&来将命令放在后台执行  
nohup ping 10.1.1.23 &
* setsid：如果进程不属于接收hup信号终端的子进程，自然不会收到hup信号影响。此时用setsid  
setsid ping 10.1.1.23 

##4、Shell相关
###关闭循环的操作是什么
done
###Vim和vi的区别
vim是从vi发展出来的一个文本编辑器。编程功能比较丰富，被广泛应用  
vi是老式的字处理器
###Shell常用基本操作
####变量名直接定义 yourname="lily" 

* 首个字符必须为字符（a-z,A-Z）
* 中间不能有空格，可以使用下划线
* 不能使用标点符号
* 不能使用bash里的关键字  
变量使用

* 使用变量，只要在变量名前加$
* 只读变量 readonly yournmae
* 删除变量 unset yourname

##5、Web相关
###Css中selctor的使用语法
CSS基础语法：selector{属性：值；属性：值；。。。}  
选择器分组：h1,h2,h3{声明}

* 派生选择器：依据元素在其上下文的关系来定义样式   
li strong{color:red} 只有li元素中的strong元素的样式变为红色
* id选择器（以#来定）：可以为标有特定id的html元素指定特别的样式  
 #side{color：red}将id=side的元素显示为红色
* 类选择器（以点号来定义类选择器）
 .center{text-align:center} 所有拥有class=center的元素定义为居中
* 属性选择器[属性]
 [title]为带有title属性的元素

###JS的node 框架？
###Web主要测试点

* 界面检查：title，页面排版、字段、文字格式是否统一、浏览器窗口大小对页面样式的影响
* 输入框校验：必填、位数以及安全性校验（输入特殊字符）等
* 页面操作提交：操作后的页面指向，页面数据是否刷新
* 不同控件间的相互关系：点击某个按钮，其他按钮置灰等
* 搜索功能及数据增删改的一系列操作

##6、协议相关
###一次完整的HTTP请求过程
在浏览器中输入URL，请求主页，到页面展示，这中间的内部实现是怎样的？

* 首先，浏览器会解析（www.meituan.com）(主机)域名对应的IP地址
* 知道主机地址后，发起TCP3次握手，建立连接
* 连接成功后，发送http请求
* 服务器响应请求，并将html文件传给浏览器
* 浏览器解析html代码，并请求html代码中的资源（如图片、地址）
* 请求完资源后，浏览器进行渲染，将结果展示给用户

**解析过程**  

* 通过DNS解析域名，如果本地hosts文件存有解析过的ip地址，那么不用再解析，直接访问；如果没有，进行解析
* 解析的IP地址是一个跟域名绑定的唯一ip地址。该ip地址的主机通过负载均衡，将请求就近分配到不同的IP地址的主机上，分配的主机IP即为页面请求解析后访问的IP地址

###如何判断是分配到哪个服务器上
通过浏览器的域名解析，解析出主机的IP地址
###常见状态码
**4xx（请求错误。表示请求可能出错，妨碍了服务器的处理）**  

* 400错误请求：服务器不理解请求的语法
* 401未授权：请求要求身份验证。对于需要登录的网页，服务器可能返回此响应
* 403禁止：服务器拒绝请求
* 404未找到：服务器找不到请求的网页
* 405方法禁用：禁用请求中指定的方法
* 408请求超时：服务器等待请求时发生超时

**5xx（服务器错误。服务器在处理请求时发生内部错误）**

* 500服务器内部错误：服务器遇到错误，无法完成请求
* 501尚未实施：服务器不具备完成请求的功能。如，服务器无法识别请求方法时
* 502错误网关：服务器作为网关或代理，从上游服务器收到无效响应
* 503服务不可用：服务器目前无法使用（由于超载或停机维护）
* 504网关超时：服务器作为网关或代理，没有及时从上游服务器收到请求
* 505（HTTP版本不受支持）：服务器不支持请求所用的HTTP版本

###页面刷新加载时间很慢的原因？
* 页面加载时请求数量过多
* 页面加载时请求的数据过大，如加载较大的图片或css等（可以通过图片压缩，缩小JS/CSS方式解决）
* JS阻塞请求，某个JS性能问题，解析JS时间过长，导致资源加载被阻塞
* 服务器处理时间比较慢，导致页面没有响应
* 网络原因
* 自己电脑的硬件原因

**解决页面加载时间过慢点办法**

* 合并请求，将多个请求合并为一个请求
* 图片、JS、Css压缩
* 页面的静态资源放在cdn上访问，不放在服务器上

##7、测试相关
###线上常见或典型的问题
清缓存操作，线下是一台服务器，所以可以清除；但是线上是多个服务器，每次请求随机分配到不同服务器上，所以清缓存的操作，会有的成功有的失败，没有将其他的服务器加入到清缓存的目录里
###扫码支付的测试点
###移动端兼容性测试怎么做

* 在以后的设备中去覆盖
* 引入移动端兼容性测试工具Spider

##8、Selenium相关
###页面变动特别大的元素如何定位
###参数如何处理
###selenium中判断元素是否存在？

* 添加验证函数isExist  
public boolean isExist(WebDriver driver ,By locator) {  
  
  try  {  
  driver.findElemnt(locator);  
  return true;}  
  catch(Exception e)  
  return false;  
  }
* 判断页面是否有某个元素（如判断是否登录成功，可以判断登录后的某个元素是否显示）
WebElement a=driver.findElement(By.);  
a.isDisplayed();true,说明存在，false说明不存在

##9、Jmeter相关
###1、如何连接数据库
###2、如何设置断言

##SG11-16
##1、Java相关
###数组中奇数放在左面，偶数放在右面，并且将奇偶分别排序
见Ji_OuArray
##2、测试相关
###登录功能的测试用例设计
###如何做Web兼容测试
目前有很多浏览器兼容的软件，可供选择  

* Browsershots：免费开源的在线WEB应用程序。可以提供网页在不同操作系统和浏览器中的显示的屏幕截图 

##DD11-17
##1、协议相关
###TCP的三次握手详细过程？且传到服务端的是什么包？
ACK：TCP协议规定，只有ACK=1时说明连接有效，也规定连接建立后所有发送的报文的ACK=1  
SYN（synchronization）：在连接建立时用来同步序号。当SYN=1，ACK=0说明是一个来接请求的报文，若对方同意连接后，则应在响应报文中SYN=1且ACK=1

* 第一次握手：客户端发送SYN=1(ACK=0)的包到服务器，并进入SYN_SEND状态，等待服务器确认
* 第二次握手：服务器收到SYN包，必须确认联机信息（即客户的SYN），同时发送一个SYN+ACK (SYN=1,ACK=1)的包
* 第三次握手：客户端收到服务器发送的SYN+ACK的包，向服务器发送确认包，然后建立连接    
握手过程中的包不包含数据，三次握手完毕后，客户端和服务器才正式开始传送数据

###长连接和短连接的区别

* 长连接，指TCP连接建立后，可以不断的发送请求
* 短连接，指每次建立连接后只发送一个请求，然后处理完请求后就断开连接，下次想再发送请求时，还要重新建立TCP连接

##2、测试相关
###接口的底层实现
###测试用例设计方法
###如何保证项目质量
###如何快速熟悉一个老系统


##3、项目相关
###查看log的方式发现的比较严重的问题，以及如何解决
###如何规避线上可能发生的问题
* 线下尽量多考虑各种异常情况，用例设计覆盖全面
* 上线后，可以先进行小范围的灰度，监控数据，将影响范围尽量减小
###航班接口的主要测试点

##4、Java相关
###如何提高tomact的性能？
###jdbc连接数据库过程？写的工具是多线程吗？支持并发吗？
单线程，因为代码中每次都是new一个对象，不支持并发
**创建线程的方法**
###HashMap和HashSet的区别
**HashMap：**   
实现了Map接口，是以键值对的形式存储。Map中不允许有重复的Key。HaspMap允许key和value为null。  
put（Object key，Object value）方法添加元素

**HashSet：**  
HashSet实现了Set接口，Set中不允许有重复的值,且无序（每次输出的顺序会不一样）。  
add(Object o)方法添加元素，元素存在返回false，添加成功返回true


##5、Linux相关
###将文件夹下所有子文件中出现的abc替换成xyz
grep abc -rl /root/test2 | xargs sed -i 's/abc/xyz/g'   
先查询某目录及其子目录下所有包好abc的文件，然后将这些文件作为要替换的参数
###查询test2文件夹下所有包含abc的文件
grep lily -rl /root/test2   
-r：表示遍历子目录  
-l：表示显示匹配的文件（不加l，显示查询匹配的行）


##163 11-20 
##Java相关
###cookie和session的区别

**cookie**
第一次访问网站的时候本地不会有cookie。当第一次访问的时候，服务器会生成一个cookie对象，cookie中会存储一些对需求有用的信息，服务器在response相应头中添加set-cookie并将cookie信息存储在响应头。客户端接收到服务器的请求后，会将cookie存储在本地，当客户端再次向服务器发送请求时，会在请求头中添加cookie。服务器就会拿到cookie  

* name属性，用来确认cookie的唯一值
* domain属性：用来确定在什么域名下可以取得cookie。如domin为.baidu.com。那么www.baidu.com和m.baidu.com都能取得cookie
* maxage属性：确定cookie的有效时间，单位为秒。  
  * 默认为-1，负数表示客户端不会把cookie存储在本地硬盘中，而是存在浏览器内存中，关闭浏览器 后cookie失效，为临时cookie；  
  * 正数。浏览器会将maxage正数的cookie持久化，即写到对应的cookie文件中，无论关闭电脑或浏览器，在maxage之前，cookie都有效
  * 0。表示删除cookie。cookie机制没有提供删除方法。通过设置maxage0即使失效实现删除cookie。失效的cookie会被浏览器从cookie文件或内存中删除

**session**  
客户端访问浏览器时，服务器把客户端信息以某种形式记录在服务器上，这就是session。Seeeion机制决定了当前客户只会获取自己的session。session使用比cookie方便，但是过多的session存储在服务器内存中，会对服务器造成压力。只有访问JSp，servelet等程序时才会创建session，只访问html等静态页面并不会创建	

**区别**

* cookie创建于服务器，但是存储在客户端，session存储在服务器上
* seeeion因为存储在服务器上，所以会增加服务器压力
* cookie是明文存储在客户端上，所以安全性较低
* cookie会传递消息给服务器，session本身存在服务器上，不会有传送量
* cookie为多个用户浏览器共享，session是一个用户浏览器独享

##Linux相关
###查看网络状态的命令
netstat

##测试相关 
###黑盒测试的用例设计方法

* 等价类划分法  
 等价类指某个输入域的子集合。在该子集合中，各个输入数据对于揭示程序中的错误都是等价的。   
 从各个子集合中选取代表性的测试数据   
 不考虑程序内部结构，指针对程序的规格说明来设计测试用例。  
 * 有效等价类：指符合程序的规格说明，可以检测程序是否实现了规格说明规定的功能（如输入正常的5位数字，如00000）
 * 无效等价类：即不符合规格说明的输入(如，用户名规定5位数字。输入小于5位或6位，或者非数字都属于无效等价类)
* 边界值分析法
* 错误推测法：基于经验和直觉推测程序中可能存在的错误
* 因果图方法：考虑输入条件之间各种组合。根据逻辑模型，最终生成判定表  
  * 分析软件需求，找出哪些是原因（即输入条件），哪些是结果（即输出结果）
  * 找出原因与原因之间，原因与结果之间对应关系，画出因果图
  * 把因果图转为判定表，再把判定表中的每一列拿出来作为依据，设计用例
* 判定表法：适合与逻辑判断复杂的场景。（类似于创元时的用例设计）
* 正交实验法

##BD 11-21
##Java相关
###什么是线程安全？HashMap和ArrayList等数据结构是线程安全的吗？

* 线程安全：就是线程同步的意思。即被synchronized修饰的方法和语句块。当一个程序访问一个线程安全的代码块或方法时，其他的线程不能访问，必须等到这次访问结束之后才能对这个方法代码块访问  
* ArrayList、HashMap、StringBuilder、String、int都是非线程安全的，没有synchronized关键字修饰
* Vector、HashTable、StringBuffer是线程安全的，其中的方法都有synchronized关键字修饰
###HashMap可以同时存取和读取吗
###Static关键字的使用？以及为什么Static修饰的变量等可以直接调用呢？
只要类被加载，Java虚拟机就能根据类名在运行时**数据区的方法区**内定找到他们。因此，static对象可以在任何对象创建之前访问。  
类的所有实例共享同一个static变量  
static变量被private修饰时，表示该变量不可以在其他类中通过类名的方式引用该变量。私有只在类内

**static 和 final一起使用**  
static final 用来修饰成员变量和成员方法，简单理解就是“全局常量”  
**注：static final 修饰的容器类型的实例变量，不可以改变容器变量本身，但可以修改容器中存放的对象**  
static final List<String> array=new ArrayList<>();  
array.add("a");//是可以的

###接口和抽象类的区别？为什么设计这两个呢？
###final和finally区别
###Java的三大特性？
* 继承:是一种行为动作
* 多态：是一种表现形式。通过继承和实现接口的方式来达到多态效果 

```java
public class Animal{

 int age = 1;
 
 void eat(){
  // blah blah blah
 }
}

class Horse extends Animal{
 
 int age = 2;

 @override
 void eat(){
  //grass
 }
}

class Tiger extends Animal{

 int age = 3;

 @override
 void eat(){
  //meat
 }
}


 // 不具备多态特性
Animal a  = new Animal();
Horse h = new Horse();
Tiger t = new Tiger();

//

void eat(String animalName){

 Animal animal1 = null;

 if(animalName.equals("Horse")){
  animal1 = new Horse();
 }else if (animalName.equals("Tiger")) {
  animal1 = new Tiger();
 }
 animal1.age;
 animal1.eat();
}

```

* 封装：是一种编码的思想  
即信息隐藏。将不想暴露给别的类的方法和变量设成private，将内部实现隐藏起来，只提供给别的类一些公共方法。  
 因为：避免耦合性，减少多个类之间相互调用，因为修改其中一个部分，就要涉及牵扯的所有类的修改。实现自己使用的部分自己定义，将属于自己的方法和变量独立起来 ；缺点，代码复用性低


###重写和重载的区别



#Java常见操作
##1、常见排序算法实现和时间复杂度

##2、数组Array的常见操作（增删改查等）
###合并数组或者扩充数组
System.arraycopy(str,strposition,dest,destposition,copylength)  
 数组扩充\拷贝原数组的部分内容到新数组的指定位置
###Arrays.fill(数组名，fromindex，toindex，value)  
 填充数组，将数组值从开始位置到结束位置设置统一值（不修改结束位置的值）  
  Arrays.fill(数组名，value)将数组所有值设置为统一value
###判断数组中是否包含某个元素  
 * 将数组转换为ArrayList：List<> list=Arrays.asList(array)，然后利用ArrayList的contains方法list.contains(targetValue)
 * 循环遍历数组，与目标值比较x.equals(目标值)
 * 使用Arrays.binarySearch()方法(前提数组是有序的)  
  int a=Arrays.binarySearch(array,targetvalue)(查找数组中某个元素的index)
 
###Arrays.sort()将两个有序、无序数组合并成一个有序数组  
 * 两个有序数组合并为一个有序数组：归并
 * 两个有序或者无需数组合并为一个为一个有序数组：先利用System.arraycopy()将连个数组复制到一个数组中，然后再利用Arrays.sort(新数组名)进行排序;Arrays.sort(array,fromindex,toindex),排序的数组不包括toindex
 
###判断两个数组中的数据是否相等  
array1.equals(array2)
##3、数组列表（ArrayList）常见操作  
List 《String》 arraylist=new ArrayList《String》();
### ArrayList反转，Collections.reverse(arraylist)。
 数组反转，可以先将数组转化为ArrayList，然后利用该方法进行反转
###删除元素	arraylist.remove(targetvalue)；arraylist.remove(index)删除某个位置的元素
###Array和ArrayList之间的相互转换
* Array->Arraylist  

	int[] a=new int[]{2,4,3};  
	List<int[]> arraylist=Arrays.asList(a);  
	
* ArrayList-->Array  
    
	List《String》 arraylist=new ArrayList《String》();  
	arraylist.add("bll");  
	
	String[] str=new String[arraylist.size()];   
	arraylist.toArray(str);  
	OR  
	String[] str=(String[])arraylist.toArray();
	

###Arraylist的sort()方法
通过定义比较器

##4、字符串的常用方法和操作，
###字符串和基本数据类型之间的转换
* String->int String str="123";  
int a=Integer.valueOf(str).intValue();   
int b=Integer.parseInt(str)
* int->String int m=34;  
String str1=String.valueOf(m);  
String str2=Integer.toString(m);	

###字符串和数组之间的转换
* String str="hello"; char[] array=str.toCharArray();
* String str2=Arrays.toString(array) 

###判断子串是否在字符串中,和子字符串最后出现的位置
* B.indexOf(A)=-1说明不存在A子串
* B.contains(A)	有返回true
* B.lastIndexOf(A)=-1说明没有该子串，否则返回具体值

###字符串反转（字符串倒序输出）
1、利用subString()+charAt()方法，实现递归

* 定义方法reverse（String str）
* 先判断字符串是否是一个，一个则不用反转， if (str.length()<=1) return str;  
* 否则，进行递归 return reverse(str.subString(1))+str.charAt(0)

2、将String转换成StringBuffer，然后利用StringBuffer的reverse()方法

String a="hello";  
StringBuffer sb=new StringBuffer(a);  
system.out.print(sb.reverse().toString());
###修改可变字符串（StringBuffer）
StringBuffer sb=new StringBuffer（“hello”）；  

* 字符串后面追加 ：sb.append（字符串、字符等）
* 在字符串中间插入：sb.insert(index,内容)
* 改变某个位置所在的字符：sb.setCharAt(index,'b')

##集合HashMap和HashSet常用操作
###定义与添加值
```
Map<String,String> map=new HashMap<String,String>();  
map.put("name1","lily");  

Set<String>set=new HashSet<String>˙();  
set.add("mk");
```

###判断set集合中是否有某个值  
set.contains(“abc”)；有返回true，没有false
##5、链表(Linked List)的常见操作（增删改查等）
单链表每个节点包含两个域：值域和指针域
###单链表反转
###单链表

##7、连接数据库代码实现步骤
##8、Httpclient使用


