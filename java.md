##InputStream和OutStream理解  
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
   
##Java输入输出流
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
   
 
##Thread线程
###线程状态

* new：新建
* runable：可执行的
* blocked：被阻塞
* waiting：等待
* timed-waiting：计时等待
* terminated：被终止