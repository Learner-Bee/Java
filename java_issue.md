#Java相关
##1、InputStream和OutStream理解  
1. 定义：  
   InputStream：任何有能力产生数据流（源）的java.io对象就可以看作是InputStream对象。能产生数据，那就可以读数据，java对其封装的方法有read（）。  
   OutputStream：任何有能力接受数据（源）的java.io对象可以看作是OutputStream对象。它能接受数据，我们就可以调用它的write（）方法，来让它接收数据。
2. java.io包中提供了根据实际情况封装出的不同机制的输入、输出流。  
   * 基于字节流的stream：  
     DataOutputStream--DataInputStream  
     FileOutputStream--FileInputStream
   * 基于字符流的stream
     FileWriter--FileReader
     StringWriter--StringReader
3. 输出数据：  
   void write(int b)往流中写一个字节b  
   void write(byte b[])往流中写一个字节数组b  
   void write(byte b[],int off,int len)
   
##2、Java输入输出流
1. 字符流：
  * Reader:BufferedReader/InputStreamReader
  * Writer:BufferedWriter/OutputStreamWriter
2. 字节流：
  * InputStream:FileInputStream--
  * OutputStream:FileOutputStream

**要点：**

* 字节流InputStream类和OutputStream类是抽象类，不能创建对象，可以通过子类来实例化


##InetAdress类的一些方法
### getHostName()方法
定义：public String getHostName() 获取主机名   
根据创建InetAdress对象的不同方式，getHostName的返回值是不同的

 * 用getLocalHost()方法创建是InetAdress对象  
   此时返回的是本机名  
   InetAdress adress=InetAdress.getLocalHost();  
   system.out.print(address.getHostName);//返回本机名
 * 用域名创建InetAdress  
   指定域名，无需访问DNS服务器，直接使用该域名 
 * 用IP地址创建  
   InetAddress address=InetAddress.getByName("141.146.8.66");    
   System.out.println(address.getHostName());//需要访问DNS服务器才能得到域名  
   InetAddress address=InetAddress.getByName("1.2.3.4");//IP地址不存在  
   System.out.println(address.getHostName());//直接返回IP地址 
   
 
##3、Thread线程
###线程状态

* new：新建
* runable：（也叫就绪状态）可执行的。当线程start后处于该状态（不管线程是否已经运行）
* blocked：被阻塞。当多个线程同时访问有限的资源时，部分线程会被阻塞。
* waiting：等待。线程无限期等待，直到被其他线程唤醒，notify（）激活
* timed-waiting：计时等待。线程等待指定时间，超过时间后，自动运行
* terminated：被终止。
  * 线程执行完成，正常终止
  * 出现异常，非正常终止
  
###sleep()和wait()区别

*  sleep()是线程Thread类的静态方法。调用该方法时线程会暂定执行指定时间，将CPU让给其他线程。但是对象的锁依然保持，其他线程不能访问该对象，休眠时间结束后会线程会自动恢复。
*  wait()方法是Object()类的方法。调用对象的wait方法导致当前线程放弃对象的锁。进入该对象的等待池中，只有调用对象的notify或notifyall方法时才能唤醒等待池中的线程进入等锁池，如果线程重新获得对象的锁就可以进入就绪状态

###sleep()和yield()方法区别

* sleep()方法给其他线程运行机会时不会考虑优先级；后者只会给相同优先级或者更高优先级的线程运行机会
* 线程执行sleep方法后进入阻塞状态（blocked），后者进入就绪状态（runnable）
* 前者声明时抛出InterruptedException，后者没有声明异常
* 前者较后者有更好的移植性

###进程和线程的区别

* 每个运行的程序就是一个进程，而线程是进程中的顺序执行流
*  一个程序运行至少一个进程，一个进程里面至少包含该一个线程，线程是进程的组成部分

###进程与线程的优缺点

* 进程是系统中独立存在的实体，它可以拥有自己独立的资源，每个进程都拥有自己的私有地址空间
* 进程之间不能共享内存，单线程之间共享内存非常容易
* 系统创建线程代价小，多线程实现多任务并发比多进程实现并发的效率高

##4、Collection和Collections的区别

* Collection是集合框架底层的接口，定义了一些集合的规范、标准。（接口里的方法都是抽象的，除了default修饰的方法）
* Collections是一个工具类，提供一套操作集合的方法。该类不能实例化(接口也不能实例化)
##5、equals和==的区别

* 首先，equals是方法，==是一个算术表达式
* ==只比较变量内存地址是否相等，如果相等则为true，不等则为false
* equals首先比较内存地址是否相等，相等返回true，不等的话，在比较值是否相等，如果相等，则返回true ，不等返回false

##6、重写和重载的区别

* 首先都是对方法的一种操作
* 重写指在继承中，子类对可以访问的方法的实现过程进行重新编写，来定义属于自己的方法。
* 重载指具有相同方法名，不同参数列表

###重写规则
* 方法名、返回类型、参数列表必须相等。
* 访问权限必须大于父类中方法的访问权限。
* 重写方法不能抛出新的检查异常或更宽泛的异常
* 父类中声明为final、private（因为其修饰的方法作用域为类中）、static的方法不可以重写。但是static方法可以重新声明
* 构造方法不能被重写

###重载规则
* 重载指是有方法名相同，参数列表必须不同，包括个数、类型、顺序
* 被重载的方法访问修饰符可以不同
* 方法可以在同类中或者子类中被重载

##7、如何处理高并发

* 使用缓存，提高查询效率
* 使用远程调用中间件
* 使用集群，多个tomcat，多个节点，
* 页面限流。设置页面最大访问量，超过最大访问量的请求跳转到等待页面
* 防止页面被刷情况下的大访问量，设置一个ip规定时间内的访问上

##8、Error和Exception区别

* Error表示系统级的错误和程序不必处理的异常。如内存溢出
* Exception表示需要捕捉或者需要程序处理的异常，是一种设计和实现问题。如果程序运行正常，从不会发生的

##9、数组和String都有length（）方法吗？

* 数组有length属性
* String有length()方法

###9.1 8种基本数据类型

整型：  byte（1个字节）、 short（2个字节）、int（4个字节）、long（8个字节）    
浮点型： float（4个字节）、 double（8个字节）（双精度）  
逻辑型： boolean   
字符型：char（2个字节）

其他都是引用类型

浮点型：float f=3.4是错误的  
正确：float f= 3.4F或者float f= (float)3.4 

###9.2 数据类型之间转换

* 如何将String为int?  
1、 通过基本类型的包装类型调用parseInt(s)方法。（如 int i=Integer.parseInt("111"))  
2、 通过基本类型的包装类型调用valueOf(s).intValue()返回基本数据类型（如：int i=Integer.valueOf(str).intValue()）

* 如何将int转化为String？  
1、String a=Integer.toString(int i)  
2、String.valueOf(int i)  
3、String a=i+"";

##10、int和Integer
###10.1 int和integer区别
* int是基本数据类型；
* 为了能够将基本数据类型当对象操作，Java为每一个基本数据类型引入了包装类型。即Integer是int的包装类型。二者可以自动装箱\拆箱机制，相互转换
* Integer整型字面量在-128到127间不会new新的Integer对象，而是直接引用常量池中的Integer对象。但是超过这个范围，Integer就会new一个新的对象 

* java为每个基本类型提供了包装类型。boolean--Boolean、char--Character、byte--Byte、short--Short、int--Integer、long--Long、float--Float、double--Double  

###10.2 int和Integer的拆箱装箱

1、赋值  

* 当把int型赋值给Integer型时，即Integer a=3。会将int型进行自动装箱成Integer型。内部实现是调用了Integer类的ValueOf()。即在-128到127之间不会new新的对象，直接引用常量池中的Integer对象，否则，返回new Integer（int i）
* 当把Integer型赋值给int时，即int b=a;会将Integer自动拆箱成int行。内部实现调用intValue（）方法。即返回Integer类型的value值

2、比较==

integer类型会自动拆箱成int型，进行值的比较。

##11、String、StringBuffer、StringBuilder区别

* String是只读字符串，其引用的字符串是不可以修改的
* StringBuffer/StringBulider表示的字符串对象可以直接修改
* 后两个方法完全相同，区别在于StringBulider是在单线程环境下使用的，所以它的效率比StringBuffer高  

##12、抽象类和接口的异同

**相同点**

* 都不能被实例化
* 继承抽象类，实现接口，就必须实现其中的所有抽象方法  

**不同点**

* 接口中的方法全部是抽象方法，抽象类中可以有非抽象方法
* 抽象类中的访问修饰符何以是任意的，接口中只能是public
* 抽象类中可以有构造函数，接口中不可以
* 有抽象方法的类必须定位为抽象类，但是抽象类中不一定有抽象方法

##13、静态变量和实例变量区别

* 静态变量是类变量，属于类，一个类不管创建多少个对象，静态变量在内存中只有一个拷贝
* 实例变量依存于某个实例，需要先创建对象，然后通过对象访问  
* 静态变量可是实现让多个对象共享内存

##14、抽象的方法可以同时是静态方法吗？
* 不可以。因为抽象方法需要子类重写，静态方法是不需要重写的

##15、jdbc操作数据库时，如何提升读取数据和更新数据的的性能

* 要提升读取性能，可以通过结果集（ResultSet）对象的setFetchSize（）方法指定每次抓取的记录数
* 要提升更新数据的性能可以使用PreparedStatement（预处理）语句构件批处理，将若干SQL语句置于一个批处理中执行

##16、throws和throw区别

* throws使用在函数声明时。后面跟的是异常类。可以跟多个，用逗号隔开
* throw使用在函数内。后面跟的是异常对象
##17、二叉树
**先、中、后都是针对根节点**

* 先序遍历：先输出根节点，再输出左子树，最后输出右子数
* 中序遍历：先输出左子树，再输出根节点，最后右子数
* 后续遍历：先输出左子树，再输出右子数，最后输出根节点

##18、面向对象的特征有哪些方面？

* 抽象
* 继承
* 封装
* 多态
##19、类成员访问修饰符（即类中方法和变量的修饰符）

* public :4。当前类；包内；子类；包外
* protected:3
* default:2
* private:1

**类的访问修饰符**

* public：一个类中必须有且仅有一个public修饰的类
* default：默认
* abstract：抽象类
* final：final类，即不能被继承



##20、&和&&区别

* &  是逻辑与
* && 是短路与。只要运算符左侧为false就不进行后侧运算

##21、内存中栈（stack）、堆（heap）和方法区（method area）的用法

* 通常定义基本数据类型、对象的引用、函数调用的现场保存都使用JVM的栈空间
* 通过new 关键字和构造器创建的对象放在堆中。堆是垃圾收集器管理的主要空间
* 方法区和堆都是各个线程共享的内存区域，用于存储已经被JVM加载的类信息、常量、静态变量
* 程序中的字面量（如直接赋值的100，“hello”和常量）都是放在常量池。常量池是方法区的一部分
* 栈空间用光了会已发StackOverFlowError，堆和常量池不足会引发OutOfMemoryError

例：String str =new String（“hello”）；  
str放在栈中；new创建的字符串对象放在堆中；“hello”字面量放在方法区

##22、math.round(f)  
返回最接近参数的int型整数。即四舍五入  
负数：可以想象是在坐标轴上，进行运算时，得到离负数最近的整数。math.round(-12.2)=-12；math.round(-12.6)=-13;math.round(-12.5)=-12

##23、静态嵌套类（static nested class）和内部类（inner class）

###23.1 不同   
静态嵌套类就是在类中被声明为static的内部类，它可以不依赖于外部类的实例被实例化。而内部类必须在外部类被实例化后才能实例化

###23.2　内部类可以引用它的包含类（外部类）的成员吗？有没有限制？

内部类对象可以引用外部类的成员。包括私有的private

##24、接口是否可以继承接口？抽象类是否可以实现接口？抽象类是否可以继承具体类？

答案都是可以的。接口可以继承接口，而且可以多继承。

##25、java语言如何进行异常处理？关键字try、catch、throw、throws、finally分别如何使用？

* java通过面向对象的方法处理异常。把各种异常进行分类，并提供良好的接口。在java中，每个异常都是一个对象，它是throwable和其子类的实例。当出现异常时，会抛出异常对象，该对象中包含异常信息，调用这个对象的方法可以捕获这个异常并可以对其进行处理

* 如果下一级的try语句没有对某种异常进行处理，异常栈就会执行出栈操作。知道遇到处理这种异常的try语句或者最终异常抛给JVM（如果上一级的try中抛出异常，并且没有对异常进行处理，那么在其下一级的try中必须通过try、catch捕获并处理异常，不然就直接抛给JVM处理该异常（不建议））

##26、synchronized同步的用法？

* 方法声明时使用  
 放在public之后返回值类型（void）之前。表示一次只能有一个线程进入该方法。其他线程只能等待当前线程执行完成后才能进入
public synchronized void synMethod() {//  方法体}

* 对某一代码块  
synchronized后面跟括号，括号内为变量。也表示一次只能有一个进程进入该代码块
*　后面是（对象），此时线程获得的是对象锁
此时，别的线程在该类所有对象上的任何操作都不能进行
synchronized（this|object）{}
* 后面是类
则线程在该类中所有操作不能进行，包括静态变量和静态方法
##27、构造函数的执行顺序

* 存在继承关系时，当执行子类中的构造函数时，首先会引用父类中的构造函数，然后再执行子类中的构造函数
* 父类没有重写构造函数时，JVM会自动添加调用无参构造函数
* 父类有有参和无参两个构造函数，子类构造函数中不引用时，执行时会默认调用无参构造函数
* 如果父类不写构造函数，JVM会自动添加一个无参的构造函数，但是如果写了构造函数（无论是有参还是无参），那么JVM都不会自动添加构造函数
* 父类中只有有参构造函数时，子类中必须显示的用super()调用该构造函数。因为不显示调用有参构造函数，会默认调用无参构造函数，但是这时候父类中没有无参构造函数，所以会报错
* 子类中显示调用父类中的构造函数的super()必须放在子类构造器中的第一句

##28、静态、非静态代码块的执行顺序 

* 静态代码块为static{//代码块}；非静态代码块为{ //代码块} 
* 静态代码块在执行main方法前就要执行。且每次运行只执行一次
* 静态代码块的执行顺序也是先找到最上级的父类中的代码块，然后再向下执行子类中的静态代码块
* 非静态代码块每次new Class()都会执行一次
* 静态、非静态代码块、构造函数的执行顺序：静态代码块（只执行一次）-->非静态代码块（每次实例都执行一次）-->构造函数

##29、什么是线程池（thread pool）?

在java面向对象编程中，创建和销毁对象是很费时间的，因为每次创建对象都要获取内存资源，而且JVM虚拟机也会试图跟踪每一个对象，一遍能够在对象销毁时进行垃圾回收。所以提高程序效率的一个手段就是减少创建和销毁对象的次数。   
线程池顾名思义就是事先创建若干个可执行的线程放在一个池中，需要时直接获取池中的线程，无需创建，使用完后放回线程池，也不用每次销毁。从而减少每次创建和销毁对象的开销

##30、什么是DAO模式？
DAO故名思议（Data Access Object）是一个为数据库或其他持久化机制提供了抽象接口的对象，在不暴露底层持久化方案实现细节的前提下提供了各种数据访问操作。

##31、事务的ACID指什么？

* 原子性（Atomic）：事务中各项操作，要么全做要么全不做，任何一项操作的失败都会导致整个事务的失败
* 一致性（Consistent）：事务结束后系统状态是一致的
* 隔离性（Isolated）：并发执行的事务彼此无法看到对方的中间状态
* 持久性（Durable）：事务完成后所有的改动都会被持久化，即使发生灾难性的失败。
 
**只有存在并发数据访问时才需要事务**  
**当多个事务访问同一数据时，可能会存在五类问题。包括3类数据读取问题（脏读、不可重复读、幻读）和2类数据更新问题（第1类丢失更新和第2类丢失更新）**

##32、获得一个类的类对象方法

*　类型.class。如：String.class
*　对象.getClass() 如：hello.getClass()
*　Class.forName()

##33、如何通过反射创建对象？

* 通过类对象方法：String.class.newInstance()
* 通过类对象的getConstructor()或getDeclaredContructor()方法获得构造器对象，并调用newInstance()方法创建对象

##34、简述了解的设计模式？

所谓设计模式，就是一套被反复使用的代码设计经验的总结。使用设计模式是为了可重用代码、让代码更容易别他人理解、保证代码可靠性

###34.1 工厂模式
工厂类可以根据条件生成不同的子类实例，这些子类有一个公共的抽象父类并且实现了相同的方法，但是这些方法根据不同的数据进行了不同的操作（多态方法）。当得到子类的实例后，开发人员可以调用**基类**中的方法而不用考虑到底是哪一个子类的实例

###34.2 代理模式
给一个对象提供一个代理对象，并由代理对象控制原对象的引用.在实际开发中，按照使用目的不同，代理可分为：远程代理、虚拟代理、保护代理、Cache代理、防火墙代理、同步化代理、只能引用代理

###34.3 适配器模式
把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起使用的类能够一起工作。

###34.4 模板方法模式
提供一个抽象类，将部分逻辑以具体方法或构造器的形式实现。然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，从而实现不同的业务逻辑

###34.5 单例模式
单例模式主要作用是保证在Java应用程序中，一个类Class只能有一个实例存在。使用单例模式的好处在于可以节省内存，因为它限制了实例的个数，有利于垃圾回收
  
**特点:**

* 确保自己只有一个实例
* 单例类必须自己创建自己的实例
* 单例类必须为其他对象提供唯一的实例

**单例模式的实现方式**  

* 懒汉式单例类   
该单例类非常懒，只有在自身需要时才会运行，从来不提早准备。在需要对象的时候，才判断是否已有对象，如果没有就立即创建一个，然后返回。如果已有对象就不再创建，立即返回  
**注：**懒汉模式只在外部对象第一次请求实例的时候才会创建  
优缺点：运行时获得对象的速度比较慢，但加载类的时候比较快。它在整个应用的声明周期中只有一部分时间在占用资源  
例子：  
public class Singleton{  
private static  Singleton instance=null;  
private Singleton(){}   
public static synchronized Singleton getInstance(){  
if (instance ==null)    
instance =new  Singleton();    
return instance;}  
}


* 饿汉式单例类  
饿汉模式在类加载的时候就立即创建对象  
优缺点： 运行时获得对象的速度快，加载类的时候慢。它在加载到应用结束会一直占用资源
例子：  
public class Singleton{  
private static  Singleton instance=null;  
private Singleton(){}   
public static synchronized Singleton getInstance(){      
return instance;}  
}


**实现单例有两点注意事项：**

* 将构造器私有，不允许外界通过构造器创建对象  
* 通过公开的静态方法向外界返回类的唯一实例


# Java Web和Web Service相关  
##1、阐述Servlet和CGI区别  
servlet处于服务器进程中，它通过多线程方式运行其service方法。一个实例可以服务于多个请求，并且实例不会销毁。而CGI对每个请求都产生新的进程，服务完成后就销毁，所以效率上低于Servlet
