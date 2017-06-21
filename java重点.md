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
* runable：可执行的。当线程start后处于该状态（不管线程是否已经运行）
* blocked：被阻塞。当多个线程同时访问有限的资源时，部分线程会被阻塞。
* waiting：等待。线程无限期等待，直到被其他线程唤醒，notify（）激活
* timed-waiting：计时等待。线程等待指定时间，超过时间后，自动运行
* terminated：被终止。
  * 线程执行完成，正常终止
  * 出现异常，非正常终止
###sleep()和wait()区别

*  sleep()是线程Thread类的静态方法。不能改变对象的机锁。线程虽然休眠，但是对象的机锁并没有释放，其他线程无法访问该对象
*  wait()方法是Object()类的方法。当线程执行该方法时，进入该对象的等待池中，同时释放对象的机锁，其他线程可以访问该对象（wait(long timeout)超时时间到后，要返还对象锁）
###进程和线程的区别

* 每个运行的程序就是一个进程，而线程是进程中的顺序执行流
*  一个程序运行至少一个进程，一个进程里面至少包含该一个线程，线程是进程的组成部分
###进程与线程的优缺点

* 进程是系统中独立存在的实体，它可以拥有自己独立的资源，每个进程都拥有自己的私有地址空间
* 进程之间不能共享内存，单线程之间共享内存非常容易
* 系统创建线程代价小，多线程实现多任务并发比多进程实现并发的效率高

##4、Collection和Collections的区别

* Collection是集合框架底层的接口，定义了一些集合的规范、标准。（接口里的方法都是抽象的，除了default修饰的方法）
* Collections是一个工具类，提供一套操作集合的方法。该类不能实例化
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
* 防止页面被刷情况下的大访问量，设置一个ip规定时间内的访问上线
##8、Error和Exception区别

* Error表示系统级的错误和程序不必处理的异常
* Exception表示需要捕捉或者需要程序处理的异常
##9、数组和String都有length（）方法吗？

* 数组有length属性
* String有length（）方法
##10、int和Integer区别

* int是基本数据类型，Integer是int的包装类。二者可以自动装箱\拆箱机制，相互转换
* java为每个基本类型提供了包装类型。boolean--Boolean、char--Character、byte--Byte、short--Short、int--Integer、long--Long、float--Float、double--Double
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
##13、静态变量和实例变量区别

* 静态变量是类变量，属于类，一个类不管创建多少个对象，静态变量在内存中只有一个拷贝
* 实例变量依存于某个实例，需要先创建对象，然后通过对象访问
##14、抽象的方法可以同时是静态方法吗？
* 不可以。因为抽象方法需要子类重写，静态方法是不需要重写的
