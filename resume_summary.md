#Java相关
##1、几种排序算法

###快速排序
* 时间复杂度: O(nlogn)
* 原理：   
  1、 取基准值（一般为第一位）、左侧第一位（start）、右侧第一位（end）  
  2、 从右侧第一位开始跟基准值比较，直到比基准值小，调换位置；  
  3、 然后将左侧第二位跟基准值比较，知道比基准值大，调换位置；  
  4、 重复步骤2
  5、 将基准值两侧的数重新调用该方法，重新排序  
  
###冒泡排序
* 时间复杂度:n*n
* 步骤：     
  1、从第一个位置开始，将其前面的元素逐个与该位置元素比较，当大于该位置元素进行位置交换  
  2、每一轮循环得到第i个位置前的所有元素是有序的   
  3、循环1、2直到比较的位置为最后一位，则所有元 素排序成功    
注：当出现交换顺序后，此时的a[i]就会更改
###插入排序

* 时间复杂度:n*n  
* 原理：把当前待排序的元素插入一个已经排好序的列表中
* 步骤：  
1、从第2个元素命名为key开始，与其前面的元素逐个比较  
2、当key小于前面的元素时，前面元素后移，该元素插入到该位置  
3、一直比较到位置为0的元素结束  

###选择排序  

* 原理：每次循环找到待排序元素中最小元素，顺序放在已经排好序的序列最后  

###归并

* 原理:将两个或两个以上的有序序列合并为一个
* 时间复杂度：O（nlog(n))

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
 
* 普通索引：alter table stu add index name1(name);  
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


##1、 ps（process status）：查看系统当前运行的进程（非动态，是进程快照，执行ps时的进程状态爱）

PID TTY TIME CMD

* PID ：process identifier。进程标识符。即各进程的身份标识。当程序一运行，系统就会自动分配给进程一个独一无二的PID。进程终止后，PID被回收，可能继续分配给新的进程
* PPID：父进程id
* TTY：Teletype。启动进程的终端名。不是从终端启动的进程显示为 ？
* TIME：进程使用CPU的时间总计，单位秒
* CMD：command。执行的命令  

常用参数  

* ps -A ：显示所有进程
* ps a：显示现行终端机下的所有进程，包括其他用户进程
* ps -a：显示同一终端下的所有异常
* ps -t<终端机编号>：指定终端机编号，并列出属于该终端机的进程的状况
* ps -u:以用户为主的格式显示进程状态
* ps e :列出进程时，显示每个进程使用的环境变量

常用命令

* ps -aux：列出目前所有的正在内存中的进程。包括无终端的（x），和针对用户（u）的进程
* ps -aux >procces.txt :把所有进程显示出来，并输出到文件中
* ps -ef：显示所有进程信息，连同命令行
* ps -ef |grep  mysql：查找mysql进程的pid

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
ps -ef|grep *.sh|grep -v grep |awk '{print "kill -9 " $2}' 
* xargs
ps -ef|awk '/*.sh/{print $2}'|xargs kill -9



##2、awk
见java_issue
#其他
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
###1、Mysql索引类型有哪几种？对数值类型和字符串类型column分别加索引，哪种查找的效率更高？
###2、MySQL存储过程
###3、Java连接数据库做CURD是的步骤
###4、Spring特性
###5、Java解析JSON、Java解析XML用到的方法及如何实现
###6、HttpClient使用，如何上传文件

## IQY 11-3
###1、linux常用命令？

* 查询文件内容中包含test的行？
* 查询进程名为test的进程
* 查看日志常用命令
  * tail -n 100f 什么意思？
  * cat 文件名(实时的滚动显示请求)  
* grep -E的使用场景
 
###2、数据库相关
* 查询a表和b表id相关联的内容

###3、归并的实现，以及该接口的测试case

###4、接口测试点（关注返回code的覆盖）
###5、用例覆盖率如何保证
###6、性能测试相关
* 关注的指标
* 各项指标代表的意思
  * 吞吐量？
* 如何确定性能的极值或者瓶颈？异常率达到多少表示有问题

###7、视频卡顿的原因？
###8、项目相关
* 底层如何实现

## Meituan 11-3
###1、进程相关
* ps -ef 和ps -aux区别 
* 查看cpu占用率最高的进程

###2、性能测试相关
* 性能测试如何开展？场景设计？
* cpu占用率高的的原因有哪些？如何解决？
* 1个人请求和100个人请求，请求处理时间变慢的原因是什么
* cpu占用率下降，但处理时间变长什么原因？

###3、接口测试相关
* 接口请求没有结果的原因？  
除了中间传输中断，主要可能是链接超时timeout
* get和post区别

###4、数据库相关
* 多表联查常用关键字
* like模糊匹配
* 得到查询结果的10条记录，Mysql和SqlServer分别如何实现
* delete和drop的区别

###5、java相关
* interface和abstract类的应用场景
* list和Arraylist的区别
* 单向链表如何反转
* 5的阶乘
* jdbc连接数据库过程（代码层面）
* 数组和链表的区别及优缺点
* TestNG和Junit的区别？Junit是否可以生成报告
* TestNG中@test和@beforetest等的使用
* 在所有测试case开始前（不是某个case开始之前）进行一些操作（如清库等），怎么处理？

###6、linux相关
* 常用linux命令
 less、more、head、tail、cat、pwd、ls、top、cp、grep、mv、kill
* vim下常用命令，如查找关键字
* 如何创建文件夹

###7、git相关
* 常用命令
* 如何处理冲突
* 如何创建分枝


###8、协议相关
* 协议都有哪些层？http、tcp分别属于哪层？
* tcp／ip和udp的区别？
* http和hppts的区别？端口号分别是多少？
* https如何加密的？
* 如何将抓取的请求指向本地？

###9、jmeter相关
* jmeter可以处理那种类型的协议？ftp？tcp/ip?可以处理吗

###10、Selenium相关
* 常用识别页面控件的属性有哪些？
* xpath如何拼接？
* 



