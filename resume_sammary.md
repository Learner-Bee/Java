 #Java相关
##1、几种排序算法

###快速排序
* 原理：取第一个元素为基准值，然后拿最后的元素high跟其比较，比基准值大的话不动，比基准值小跟其交换位置，然后拿最左的元素low跟基准值比较，比基准值小不动，大的话交换位置。最后实现基准值左侧的数都比其小，右侧的数都比基准值大。然后再将左右两侧的组合分别重复以上操作 

###冒泡排序
###插入排序
###选择排序
###二分查找
###归并
##2、一定需要捕获的异常有哪些
* 操作文件时，捕获IOException
* jdbc连接时，可能存在连接地址错误要捕获异常
* 通过jdbc执行sql命令时，要捕获SQLException
* 

##3、equals和==区别？两个类的实例用equals比较的是什么？

* ==比较的是物理内存地址是否相等，相等返回true，不等返回false
* Object类中的equals方法就等于==。判断两个实例的内存地址是否相等（是否指向同一个对象）
* 而String类中的equals方法是重写后的方法。重写后的equals先比较内存地址是否相等，相等返回true，不等，再比较值是否相等，相等返回true，不等返回false

##4、为什么要重写hashcode和equals？

* 重写equals方法是为了重定义比较内容，否则都是继承Object类中的方法，相当于==（即只比较内存地址）
* 重写equals一定要重写hashcode？？？
##5、什么情况下会内存溢出？为什么有内存回收机制，还会发生？

理论上java有内存回收机制（GC）不会存在内存泄露。但是在实际开发中存在**无用但可达？？？？？？**的对象，这些对象不能被GC回收
##6、内存模型？

##7、接口和抽象类的区别

* 接口中的类必须都是抽象方法，抽象类中的可以有非抽象方法  
* 接口中的修饰符必须是public，抽象类中的修饰符可以包含任意（因为抽象方法必须用public修饰，而抽象类中可以有非抽象方法，也就可以使用其他修饰符）
* 可以实现多个接口，但只能继承一个抽象类
* 抽象类中可以定义构造器，接口中不可以？？？？？？？

相同点：  

* 都不能被实例化

##8、final、finally、finaized区别

* final是修饰符。修饰类：表示该类不能被继承；修饰方法：表示方法不能被重写；修饰变量：表示变量只能一次赋值以后不能被修改
* finally是捕获异常时总会执行的语句块。且其会在try中的return前执行，如果返回值被修改，那么返回修改后的值
* finaize是Object类中定义的方法。在GC回收对象之前，先调用该方法来完成一些清理工作
##9、什么是空间复杂度和时间复杂度
##10、如何自定义异常
##11、列出一些常见的运行时异常

* ArithmeticException 算术异常：
* ClassCastException 类转化异常：
* IllegalArgumentException 非法参数异常:
* IndexOutOfBoundsException 下标越界异常
* NullPointerException 控制值异常：操作值为null的参数时
* SecurityException 安全异常：

##12、java反射？？

###什么是反射？
java程序能够运行，就要让java类被java虚拟机加载。如果类不被虚拟机加载是不能正常运行的。所以我们运行的所有程序在编译时就知道了你所需要的类已经被加载了。  
java反射机制是指在编译时，并不确定哪个类被加载了，而是在程序运行的时候才加载、探知、自审。  
使用在编译期并不知道的类，这样的特点叫反射

java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法。这种动态获取信息以及动态调用对象方法的功能称为java的反射机制

###反射有什么作用？

* 在B类没有完成时，A类调用B类，此时A类编译时不通过的。利用JAVA反射机制，就可以在A类没有得到B类的时候，完成自身编译
* 提高程序的灵活性
 在eclipse中通过输入点，就可以匹配方法和属性供用户选择，这就是利用了Java反射原理。



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
* left join/right join
* having
* union/unionall

##3、having的使用？和where的区别？

* having用在聚合函数（max、min、count、avg、sum）查询时，聚合函数是对多条数据进行操作的，having子句限制的是组
* group by是先排序后分组，所以一般与having组合使用
* having子句中的每一个元素都必须出现在select语句中
* where关键字在聚合函数时不可使用，因为where子句限制的是行

##4、索引的使用？

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

###根据数据库的功能，可以在数据库设计器中创建三种索引

* 唯一索引：不允许其中任何两行具有相同索引值。保证数据唯一性
* 主键索引：在数据库关系图中为表定义主键将自动创建主键索引，主键索引是唯一索引的特定类型。
* 聚集索引：表中行的物理顺序与键值的索引顺序相同，一个表只能包含一个聚集索引。聚集索引提供更快的数据访问速度

索引结构利用的是B-Tree

###索引操作
**创建索引**

1、 使用alter table：

*  普通索引：alter table table_name add index index_name (column_list)
*  唯一索引：alter table table_name add unique(column_list)
*  主键索引：alter table table_name add primary key(column_list)  
注：column_list指添加索引的列，多列时，可以用逗号隔开；index_name可以省略

2、 使用cteate index:

* create index index_name on table_name (column_list)
注：不能用create index 创建primary key 索引 

**删除索引**

1、使用drop index：drop index index_name on table  
2、使用 alter table：alter table table_name drop index index_name   
alter table table_name drop primary key(因表只有一个主键索引，所以不用指定索引名)


##5、数据库数据量大的查询，如何提高查询效率

* 建立索引（index）
* 语句优化。select * 改为具体的参数
* 分库／表。同时操作多个库去查找  

##6、Sql语句

学生成绩表（id、name、score、date）

* 查询最大分数：select max(score) from table group by score
* 查询每门成绩大于80的人：select name ,min(score) from table group by score having min(score)>=80
* 查询有至少三个成绩想同的人：select name , count(name) from table group by score having count(name)>=3
* 查询当天记录了10人以上的日期：select date ,count(name) from table group by date having count(name)>10
 
#Linux／Shell相关
##1、进程操作

* 杀死后缀名为.sh的进程
* kill -9      

##2、awk
#其他
##1、post和get的区别  
##2、url测试点