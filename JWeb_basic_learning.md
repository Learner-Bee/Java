#1、Java Web开发需要学习什么？

##TCP/IP协议
###客户端-服务器（Client-Server）模型
当多台计算机需要相互通信传输数据时，他们必须遵循相同的协议（Protocol）

* 客户端：向服务器请求提供服务（request）
* 服务器：提供计算服务（response）
###IP地址
在Client-Server模型中，第一个要解决的就是---客户端向服务器请求服务，服务器的地址在哪，即服务器的IP地址
###TCP协议
当客户端知道服务器的IP地址后，接下来就是如何通信。TCP协议正是解决数据传输层的通信协议  
计算机操作系统将TCP连接抽象为套接字（Socket）,应用程序通过使用Socket接口完成TCP连接。通过TCP连接，客户端可以向服务器发送一个个的数据包（Packet）
###端口（Port）
计算机的操作系统中同时运行着多个进程，当操作系统收到与其他计算机建立TCP连接后，如何知道收到的数据包应该交给哪个进程呢？就是通过端口（Port）。（端口的取值范围0-65535，不同进程不可以使用同一个端口）（也叫作应用程序监听（Listen）端口）

##访问一个页面时发生了什么？

* 浏览器访问google.com,首先，浏览器拿到网址后，先要到DNS服务器查询，DNS服务器会将网址转为IP地址。（万维网是运行在TCP/IP协议之上的，所以要先知道Web服务器的IP地址）
* 有了IP地址，浏览器就可以基于HTTP协议，向远程Web服务器发送请求了。此时谷歌的Web服务器收到请求，它会调用后端的一系列功能组装成HTML页面，通过HTTP协议返回给浏览器
* 浏览器把返回的HTML文本渲染成一个美观的可读页面，此时就可以看到谷歌的页面了。（整个过程在TCP/IP协议之上）
##了解Java Web开发
###开发者角度，一个请求处理的流程：

1、 监听web服务器某网络端口，如，80  
2、 从网络端口读http请求信息  
3、 根据http请求信息进行处理，生成http相应内容  
4、 将响应内容通过网络I/O接口返回  
5、 返回第二步，重复  
基于java开发，只要关注第三步。我们的主要工作就是编写处理请求的java servlet代码
#3、Servlet简介
##什么是Servlet？
Servlet技术用来创建Web应用程序。本质上---Servlet是运行于服务器端的java程序。能够接受客户端发起的http请求，并动态的生成页面内容。  
Serblet会应用在如下场景：

* 处理从浏览器页面提交的html表单数据
* 根据http请求信息，动态生成http响应数据。
* 使用Cookie或URL重写技术在无状态的http协议之上，实现对客户端状态的管理。如，用户登录一次后，可以访问站点内的所有页面，而不用重复登录、电商网站的购物车功能
##第一个Serlet程序
程序体现几个要素：

* 在程序实现角度，一个Servlet是继承了javax.servlet.http.HttpServlet的子类
* doGet()方法中定义了处理http get请求的动作，
* HttpServletRequest对象中封装了http请求信息。通过该对象可以访问http请求信息
* HttpServletResponse可以生成http相应内容
* @WebServlet("/HelloWorld")注释表明请求路径
##Servlet容器
Servlet容器是Web服务器和Servlet进行通信的主要构件，主要职责：

* 管理Servlet程序的生命周期
* 将URL映射到指定的Servlet进行处理
* 与Servlet程序合作处理http请求————根据http请求生成HttpServletRequest对象并传递给Servlet进行处理，将Servlet中的HttpServletReponse对象生成的内容返回给浏览器
* 并发请求的多线程处理，线程池管理
* Session管理，http缓存等
##通过HttpServletResponse生成返回内容
四种处理相应的方法：

* 直接返回html内容：使用PrinterWriter对象  
 例：response.getWriter().append("hello");  
* 返回二进制数据（文件下载）：使用OutputStream对象   
 例：resopnse.getOutputStream().write();　  
* 重定向到另一URL：使用sendRedirect方法   
 例：response.sendRedirect("index.html");
* 返回错误信息：使用sendError方法  
 例：response.sendError(404,"Resource not found");
##Servlet生命周期
Servlet依托于Servlet容器运行，它包含三个方法，分别在特定的时机被容器调用

* init()：当Servlet第一次被容器加载进入内存后调用，一般用于载入一些特定的资源和配置
* service()：一旦有对应URL的http请求访问即被调用。它会根据http请求中的method信息将请求分发至相应的方法进行处理（doGet()/doPost()）,service()方法一般不需要开发重写
* destory():Servlet被销毁时调用。一般用来释放、清理资源
#4、处理请求数据
##HTTP请求
一个Servlet就是一段将HTTP请求信息转换为HTTP相应内容（一般为HTTP页面）的程序。
##通过Requeat对象获取信息
获取请求参数，使用getParameter()方法  
如：浏览器输入地址https://www.tianmaying.com/search?key=jsp  
后台：String key =request.getParameter("key")//拿到key后在后台搜索包含关键字的内容，然后返回  
##获取http请求参数  
如：访问localhost:8080/add?a=1&b=2
Servlet代码：  
int a=Integer.parseInt(request.getParameter("a"));  
int b=Integer.parseInt(request.getPameter("b"));  
response.getWriter().append(a+b);
##Request对象  
javax.servlet.HttpServletRequest类用于表示一个http请求。当一个http请求到达时，Servlet就会产生一个HttpServletResquest对象来描述请求  
该类提供了一系列方法来获取http信息头  

* Cookie[] getCookies()：返回客户端所有的cookie数据  
* Enumeration getAttributeNames()：返回request对象的所有属性名称的集合 
* Enumeration getHeaderNames()：返回所有http头的名称集合
* Enumeration getParameterNames()：返回请求中所有参数聚合
* HttpSession getSession()：返回request对应的session对象，如果没有，则创建一个
* Locale getLocale()：返回当前页面的locale对象，可以在response中设置
* Object getAttribute(String name)：返回名称为name的属性值，不存在返回null
* ServletInputStream  getInputStream()：返回请求的输入流
* String getAuthType()：返回认证方案的名称，用来保护servlet，如“BASIC”或“SSL”，null（JSP没有设置保护措施时）
* String getCharacterEncoding()：返回request的字符编码集名称
* String getContentPath()：返回request中致命的上下文路径
* String getHeader(String name)：返回指定name的信息头
* String getMethod()：返回request中的Http方法。如get、post、put
* String getParameter（String name）：返回request中name的参数，没有返回null
* String getRemoteAddr()：返回客户端的IP地址
* String getRemoteHost()：返回客户端的完整名称
* String getRequestURL()：返回request的url地址
* String getServletPath()：返回所请求的servlet路径
* boolean isSecure()：返回request是否使用了加密通道，如https
* int getServerPort()：返回服务器端口号
#5、Post请求与表单处理
##创建表单
form class="creat-blog" action="./creat">  
其中重要的是action属性。它决定了表单数据交给服务器的哪一个URL进行处理（就是对应的Servlet）。同时表单包含type="submit"的button>,按下这个按钮的默认行为是提交表单，向指定的URL发出http请求 
##HTTP Post方法 
默认提交表单发送http请求的方法是get。  
对于get请求，数据会以name/value对的格式附加在URL之后  
**注意：其中name由表单输入对象（如，标签input）的name属性决定的。**
**参数的命名由name属性决定，而不是id属性**  
一种更好的选择是使用POST：  

* 虽然http协议没有对url的长度进行限制，但现代浏览器以及web服务器都会存在一定限制。如果太长的话就会超过浏览器的限制
* 从安全性方面考虑，也应该使用post提交表单数据。如用户登录的表单，如果用get请求，密码就会以明文的形式附加到url上，不安全
* 如果需要通过输入框上传文件到服务器，必须使用post方法  
在表单中指定http请求的方法，在form表单中设置method="post"
#6、常用表单控件处理
##在servlet中获取表单控件的值
* 单选按钮：与普通文本输入框在http请求中的编码方式一样。  
<input type="radio" name="gender" value="male" checked>男  
http请求中表单数据编码格式为name=value（都对应input标签属性的值）：gender=male    
在Servlet中通过request.getParameter("gender")就可以获取表单数据
* 复选框：会有多个被选中，所以name会有多个值（被选中的值才会被拿到）   
<input type="checkbox" name="lang" value="java" checked >java  
<input type="checkbox" name="lang" value="shell"  checked >shell  
 表单数据编码：lang=java&lang=shell  
在servlet中获取：String [] values=request.getParameter("lang");
* 下拉列表  
与单选按钮处理相同
#JSP简介（java server page）
##JSP基本语法
在jsp中嵌入java代码的三种形式：java表达式、java语句、java定义

* java 表达式 <%= %>  
语法标记对通常用于在页面中展示某一个变量，或者一个表达式的值
* java语句  
jsp支持任意执行任意多行java代码，使用语法标记对<% %>
* java定义  
在jsp中同样可以定义一些临时变量或函数，他们相当于局部变量/函数。仅仅在本jsp页面中可以被引用，通过语法标记对<%! %>定义   
<%!   
String makeStringUpper(String data){  
return data.toUpperCase()  
}  
%>  
<%= makeStringUpper("test")%> 
##调用Java类 
* 在JSP中调用类需要使用全名：  
<%= com.lily.utils.toUpperCase("test")%>  
* 可以通过引入包，然后调用其中的方法
<%page import="com.lily.HelloWorld"%>
##内置对象
JSP内置的对象包括  

* request：封装了http请求信息----header、form等
* response：封装http响应信息，可以修改相应内容
* out：输出jsp页面最终的html内容
* session：当前请求对应的用户session信息
* application：整个web应用对象，可以在所有用户之间共享数据
* pageContext：页面上下文，保存当前页面的一些属性
* config：提供一些配置信息，常用的方法有getInitParameter和getInitParameterNames，已获得servlet初始化时的参数
* exception：JSP文件运行所产生的例外对象。只能在使用了<% 	@page isErroePage="true"%>的jsp文件中使用
要实现空行，out.println("<br>")
##JSP访问
localhost/工程名/jsp文件名  
jsp中引用action中的servlet路径：  
1、相对路径：直接输入servlet名，如action=“TestTool”
#编写JSP页面
##让页面动起来
拿到前端设计的html页面，转化为jsp：  

* 直接将文件后缀名改为JSP，然后添加一些必要的代码，
* 新建jsp文件，将html内容拷贝到jsp中