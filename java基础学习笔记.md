#java教程
##java简介
java分为三个体系：  

* JavaSE（J2SE）：Java平台标准版
* JavaEE（J2EE）：Java平台企业版
* JavaME（J2ME）：Java平台微型版
###主要特性

* Java语言是简单的
* Java语言是面向对象的
* 分布式的
* 健壮的
* 安全的
* 体系结构中立的
* 可移植的
* 解释型的
* 高性能的
* 多线程的
* 动态的
##Java基础语法

* 对象：对象是类的一个实例，有状态和行为
* 类：类是一个模板
* 方法：就是行为
* 实例变量：每个对象都有独立的实例变量，对象的状态由实例变量的值决定
###基本语法

* 大小写敏感
* 类名：**类名首字母应该大写**。若类名由多个单次组成，那每个单次首字母都应大写，如：MyFirstJavaClass
* 方法名：所有**方法名都应由小写字母开头**。若含有多个单次，则后面的每个单次首字母大写。
* 源文件名：必须和类名相同。文件名后缀.java（文件名和类名不相同会编译错误）
* 主方法入口：所有的java程序由public static void main (String args[])方法开始执行
###Java标识符
类名、变量、方法都叫标识符

* 所有标识符必须由**字母（A-Z或a-z）、$、下划线（_）3种**可能开始
* 关键字不能用作标识符
* 大小写敏感
###接口
在Java中，接口可以理解为对象相互通信的协议。接口在继承中扮演着重要角色。  
接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类
##Java对象与类
###Java中的类
一个类可以包含以下类型变量

* 局部变量：在方法、构造方法、语句块中定义的变量。变量声明初始化在方法中，方法结束后，变量会自动销毁
* 成员变量：定义在类中，方法体之外。成员变量在创建对象时实例化
* 类变量：也声明在类中、方法外，但必须声明为static类型
###构造方法
每个类都有构造方法。如果没有显示地为类定义构造方法，Java编译器会为该类提供一个默认构造方法  
在创建一个对象的时候，至少要调用一个构造方法。**构造方法的名称必须与类名相同**，一个类可以有多个构造方法  
例：  
public class Puppy{  
 public Puppay(){  
}  
public Puppy(String name){  
//  这个构造器仅有一个参数：name   
}  
}  
###创建对象
使用关键字new创建一个对象。步骤：  

* 声明：声明对象，包括对象名和类型
* 实例化：使用关键字new来创建一个对象
* 初始化：创建对象时，会调用构造方法初始化对象  

### 源文件声明规则

* 一个源文件只能有一个public类
* 一个源文件可以有多个非public类
* 源文件名应和public类名相同
* 若类定义在包中，package语句应在源文件首行
* 若源文件中包含import语句，应放在package和类定义之间
###Java包
包主要用来对接口和类进行分类  
##Java基本数据类型
java两大数据类型：  

* 内置数据类型
* 引用数据类型
###内置数据类型
java提供八种数据类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，一种布尔型。  

* byte 
* short
* int
* long
* float
* double
* char
* boolean ：两个值true 、false。默认是false
###引用类型

* 引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定类型。如Employee和Puppy。
* 对象、数组都是引用数据类型
* 所有引用类型的默认值都是null
###Java常量
使用final修饰常量，声明方式和变量类似：  final double PI=3.1415926   
**注：**常量名可以用小写，但为了便于识别，通常使用大写字母表示常量  
###自动类型装换
低------------>高  
byte,short,char->int->long->float->double  
数据类型转换必须满足：  

* 不能对boolean类型进行类型转换
* 不能把对象类型转换成不相关类的对象
* 把容量大的类型转为容量小的类型时必须使用强制类型转换
* 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入
* 转换过程可能导致溢出或损失精度：int i=8;byte b =(byte)i;
##Java变量类型
java语言支持的变量类型有：

* 类变量：独立于方法之外的变量，用static修饰
* 实例变量：独立于方法之外的变量，不过没有static修饰
* 局部变量：类的方法中的变量  

例：
public class Variable{  
 static int a=0;  //类变量  
 String str="hello world" //实例变量  
public void method(){  
 int b=1;//局部变量  
}  
}  
###Java局部变量

* 局部变量声明在方法、构造方法、语句块中
* 在方法、构造方法、语句块中被执行时创建，当被执行后，变量将会被销毁
* 访问修饰符不能用于局部变量
* 只有在声明他的地方可见
* 在栈上分配的
* 局部变量没有默认值。所以**局部变量被声明后，必须初始化后才可使用**

###实例变量

* 声明在一个类中，但在方法、构造方法、语句块之外
* 当一个对象被实例化后，每个实例变量的值就跟着确定
* 实例变量在对象创建时创建，在对象被销毁时销毁
* 实例变量的值应该至少被一个方法、构造方法、语句块引用，使得外部能通过这些方式获取实例变量的信息
* 实例变量可以声明在使用前或使用后
* 访问修饰符可以修饰实例变量
* 实例变量对于类中的方法、构造方法、语句块是可见的，一般应该把实例变量设为私有，通过使用访问修饰符可以使实例变量对子类可见
* 实例变量具有默认值。数值型变量的默认值是0，布尔型变量默认值是false，引用类型变量默认值是null，变量的值可以在声明时指定，也可以在构造方法中指定
* 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：objiectReference.VariablleName
###类变量（静态变量）

* 类变量也称静态变量。在类中以static关键字声明。但必须在方法、构造方法、语句块之外。
* 无论一个类创建多少对象，类只拥有静态变量的一个拷贝
* 静态变量除了被声明为常量外很少使用。常量是指声明为public/private,final、static类型的变量。常量初始化后不可改变
* 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量
* 静态变量在程序开始时创建，在程序结束是销毁
* **静态变量可以通过Class.VariableName方式访问**
* 静态变量被声明为public static final 类型时，变量名一般建议大写。

**全局变量和静态变量区别：**

* 静态变量属于类，该类不生产对象，通过类名就可以直接调用静态变量。
* 全局变量属于该类的对象，必须产生该类对象，才能调用全局变量 

**实例变量必须创建对象后才可以通过对象调用，静态变量可以直接使用类名来引用** 
##Java修饰符
主要分为两种：

* 访问修饰符
* 非访问修饰符
###访问控制修饰符

* public ：当前类Y；同一包内Y；子孙类Y；其他包Y
* private：当前类Y；同一包内N；子孙类N；其他包N
* protected：当前类Y；同一包内Y；子孙类Y；其他包N
* default：当前类Y；同一包Y；子孙类N；其他包N
###非访问修饰符

####static修饰符

* 静态变量：static用来声明独立于对象的静态变量。无论一个类实例化多少个对象，它的静态变量只有一个拷贝。**局部变量不能声明为静态变量**
* 静态方法：静态方法不能使用类的非静态变量。
* 对类变量和方法的访问，可以直接用classname.variablename和class.methodname方式访问
####final修饰符

* final变量

 * 可以被初始化一次。被声明为final对象的引用不能指向不同对象。但final对象里的数据可以被改变。即：final对象的引用不能改变，但是里面的值可以改变  
 * final修饰符一般和static修饰符一起使用来创建类常量
* final方法

 * 类中的final方法可以被子类继承，但是不能被子类修改
 * 声明final方法的主要目的是防止该方法中的内容被修改
* final类

 * final类不能被继承，没有类能够继承final类的任何特性
####abstract修饰符

*  抽象类

 * 抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充
 * 一个类不能同时被abstract和final同时修饰。**如果一个类包含抽象方法，那么该类一定要声明为抽象类**，否则将出现编译错误
 * 抽象类可以包好抽象方法和非抽象方法
* 抽象方法

 * 抽象方法是一种没有任何实现的方法，他的具体实现由子类提供
 * 抽象方法不能被声明为final和static
 * 任何**继承抽象类的子类必须实现父类的所有抽象方法**，除非该子类也是抽象类
 * **如果一个类包含若干个抽象方法，那么该类必须声明为抽象类**。抽象类可以不包含抽象方法
####synchronized修饰符

* synchronize声明的方法同一时间只能被一个线程访问
####transient修饰符

* 序列化的对象包含被transient修饰的实例变量时，java虚拟机（JVM）跳过该特定变量
* 该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型
####volatile修饰符

* volatile修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。
##Java运算符

* 算术运算符：+、-、*、/、%（取模）、++（自增）、--（自减）
* 关系运算符：==、！=、>、<、>=、<=
* 位运算符:
  * &（相对应为都为1，结果为1，否则为0）
  * |（相对应为都是0，结果为0，否则为1）
  * ^(相对应位值相同，结果为0，否则为1)
  * ~（按位补运算符，翻转操作位的每一位，即0变为1,1变为0）
  * <<(按位左移。A<<2：按位左移2位) 
  * >>（按位右移）
* 逻辑运算符：
  * &&（与）（也称短路逻辑运算符，当&&左边的结果为false时，结果直接为fasle，不会执行&&右边）
  * ||（或）
  * ！（非）。
* 赋值运算符
  * =
  * += (加和赋值操作符。c+=a等价于c=c+a)、-=、*=、/=
  * (%)=(取模和赋值操作符。c%=a等价于c=c%a)
* 条件运算符：（？：）
  * variable x = (expression) ? value1 :value2
  * 判断表达式的布尔值，如果为true，x=vaule1，如果为false，x=value2
* instanceof 运算符
  * 用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）
  * （object reference variable）instanceof （class/interface type）
  * 如果运算符左侧变量所指的对象类型，是右侧类或接口的一个对象返回true
  * 如果	被比较的对象兼容于右侧类型，运算结果仍未true
##Java循环结构
###while循环
whlie（布尔表达式）{  
循环内容  
}  
**只要布尔表达式内容为true，循环就一直执行下去**
###do...while循环
do{  
代码语句  
}while（布尔表达式）；
**该循环至少执行一次**
###for循环
for（初始化；布尔表达式；更新）{  
代码块  
}  
###Java增强for循环
for（声明语句：表达式）{  
循环语句  
}

* 声明语句：声明新的局部变量。**该变量类型必须和数组元素的类型匹配**，其作用域限定在循环语句块，其值与此时数组元素值相等
* 表达式：表达式是要访问的数组名，或者是返回值为数组的方法
###break关键字

* break主要用在循环语句或者switch语句中，用来跳出整个语句块
* break跳出最里层循环，并继续执行循环下面的语句
###continue关键字

* 作用是让程序立刻跳转到哦下一次循环迭代
##Java分支结构
###switch
switch(expression){  
case value：  
语句；  
break；//可选   
default：//可选  
语句   
}   
##Java Number & Math类
所有包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类Number的子类  
Math的方法都被定义为static形式，通过Math类可以在主函数中直接调
###Number & Math类方法
* xxxValue() ：将Number对象转换为xxx数据类型的值并返回
* compareTo（）：将number对象与参数比较
* equals（）：判断number对象是否与参数相等
* valueOf（）：返回一个number对象指定的内置数据类型
* toString（）：以字符串形式返回值
* abs（）：返回参数的绝对值
* min()：返回两个参数最小
* max()：返回两个参数最大的
* pow（）：返回第一个参数的第二个参数次方
* sqrt（）：求参数的算术平方根
* random（）：返回一个随机数
##Java Character类
Character类用于对单个字符进行操作  
Character类在对象中包装一个基本类型char的值
###转义序列
前面有反斜杠\的字符代表转译字符。

* \t：插入tab键
* \b:插入退格键
* \n：该处换行
* \r：该处插入回车
* \'：该处插入单引号
* \\：该处插入\
###Character方法

* isLetter（）：是否是一个字母
* isDigit（）：是否是一个数字字符
* isWhitespace（）：是否是空格
* isUpperCase()：是否是大写字母
* isLowerCase（）：是否小写字母
* toUpperCase（）：指定字母的大写形式
* toLowerCase（）
* toString()：返回字符的字符串形式，字符串长度仅为1
##Java String类
###创建字符串
在java中字符串属于对象 ，Java提供了String类来创建和操作字符串 
String  name = "lily";  
String类有11中构造方法。这些方法提供不同的参数来初始化字符串。  
**注意：String类是不可改变的，一但创建了String对象，那它的值就无法改变了**
###字符串长度
用于获取有关对象的信息的方法称为访问器方法  
length（）：返回字符串对象包含的字符数
###连接字符串

* string1.concat（string2）；  返回string2连接string1的新字符串  
* “myname is”.concat("lily"); 也可以对字符串常量使用  
* "hello"+" world" 更常用的是用+连接
###String 方法

* char charAt（int index）：返回指定索引处的char值
* compareTo()方法
 * int compareTo（Object o）：字符串与对象比较。o是要比较的对象
 * int compareTo（String anotherString）：按字典顺序比较字符串  
返回值：  
  * 如果参数字符串等于次字符串，返回0
  * 如果此字符串小于字符串参数，则返回小于0的值
  * 如果此字符串大于字符串参数，则返回大于0的值
* boolean endWith（ String suffix）suffix指定的后缀：   
   String  str=new String("www.baidu.com");   
   boolean  ret=str.endsWith("com");
* boolean startsWith()
* boolean equals（Object anObject）：将次字符串与指定对象比较
* indexOf（）：返回指定字符在字符串中第一次出现的位置 。str.indexOf('a')
* lastIndexOf（）：返回指定字符在此字符串中最后一次出现处的索引。
* trim()：删除字符串的头尾空白。用法：str.trim()

##Java StringBuffer类和StringBuilder类
当对字符串进行修改时，会使用以上两个类  
和String类不同，以上两个类的对象可以被多次修改，并且不产生新的未使用对象。  
两个不同在于StringBulider的方法不是线程安全的（不能同步访问）  
由于StringBuilder比StringBuffer有速度优势，所以大多数情况下建议使用StringBuilder类。  
但是在程序要求线程安全的情况下，则必须使用StringBuilder类  
###StringBuffer方法 

* public StringBuffer append(String s) ：将指定的字符追加到此字符序列
* public StringBuffer reverse（）：将此字符序列用其反转形式取代
* public delete（int start ，int end）：移除此序列的子字符串的字符
* public insert（int offset，int i）：将int参数的字符串表式形式插入此序列中
* replace （int start ，int end ，String str）：使用给定的String中的字符替换此序列的子字符串中的字符  

下面方法和String类的方法类似  

* int capacity()：返回当前容量
*  char charAT（int index）：返回此序列中指定索引处的char值
* int indexOf（String str）：返回第一次出现指定字符串在此字符串中的索引
* int indexOf（String str，int fromIndex）：从指定索引开始，返回指定字符串第一次出现的索引
* ing lastIndexOf（String str）：返回最后出现指定字符串位置
* int length（）：返回长度（字符数）
* String toString（）：返回此序列中数据的字符串表达式
##Java数组
###声明数组变量
必须先声明数组变量，才能在程序中使用数组
  
dataType[] 数组名；首选方法  
例：double[] myList;
###创建数组
变量名 = new dataType[arraySize]; 

* 使用dataType[arraySize]创建数组
* 把新创建的数组的引用赋值给变量  

数组变量声明和创建可以一起写：  
dataType[] 数组名= new dataType[arraySize];
###foreach循环
JDK5.1引用了一种新循环类型，被称为foreach循环或者加强循环，他能在不适用下标的情况下遍历数组  
###多维数组
多维数组可以看成是数组的数组。  
String str[] []=new String [3] [4];  //3行4列数组  
多维数组的动态初始化

* 直接为每一堆分配空间，格式如下：
type arrayName=new type[arraylength1] [arraylength2];  
* 从最高维开始，分别为每一维分配空间  
###Array类
java.util.Arrays类能方便操作数组，他提供的所有方法都是静态的  
具有以下功能：  

* 给数组赋值：通过fill方法  
  public static void fill()（int[] a,int val）  
* 对数组排序：通过sort方法。按升序  
  public static void sort(object[] a)
* 比较数组：通过equals  
  public static boolean equals(long[] a,long[] b)
* 查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找排序


