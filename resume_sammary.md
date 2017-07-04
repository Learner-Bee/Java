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
* equals先比较的是内存地址，相等返回true，不等，再比较值是否相等，相等返回true，不等返回false
##4、什么情况下会内存溢出？为什么有内存回收机制，还会发生？
理论上java有内存回收机制（GC）不会存在内存泄露。但是在实际开发中存在**无用但可达？？？？？？**的对象，这些对象不能被GC回收
##5、内存模型？
##6、为什么要重写hashcode和equals？
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
##9、jdbc
##10、什么是空间复杂度和时间复杂度
##12、如何自定义异常
##13、列出一些常见的运行时异常

* ArithmeticException 算术异常：
* ClassCastException 类转化异常：
* IllegalArgumentException 非法参数异常:
* IndexOutOfBoundsException 下标越界异常
* NullPointerException 控制值异常：操作值为null的参数时
* SecurityException 安全异常：

##14、java反射？？

###什么是反射？
java程序能够运行，就要让java类被java虚拟机加载。如果类不被虚拟机加载是不能正常运行的。所以我们运行的所有程序在编译时就知道了你所需要的类已经被加载了。  
java反射机制是指在编译时，并不确定哪个类被加载了，而是在程序运行的时候才加载、探知、自审。  
使用在编译期并不知道的类，这样的特点叫反射

java反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法。这种动态获取信息以及动态调用对象方法的功能称为java的反射机制

###反射有什么作用？

* 在B类没有完成时，A类调用B类，此时A类编译时不通过的。利用JAVA反射机制，就可以在A类没有得到B类的时候，完成自身编译
* 提高程序的灵活性
 在eclipse中通过输入点，就可以匹配方法和属性供用户选择，这就是利用了Java反射原理。



##15、JDBC操作数据库的步骤

* 加载数据库驱动：Class.forName("com.mysql.jdbc.Driver");
* 建立连接：Connection conn = DriverManger.getConnection(connectionURL);  
String connectionURL="jdbc:mysql//"+ip+":"+"port"+"/"+dbName+"?user="+userName+pwd
##16、如何自定义异常



#数据库相关
##1、union和unionall的区别
##2、常用关键字的使用

* group by
* order by
* not in
* like
* left join/right join

##3、having的使用
##4、索引的使用？
##5、数据库数据量大的查询，如何提高查询效率

* 建立索引
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