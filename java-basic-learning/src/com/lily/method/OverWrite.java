package com.lily.method;

/**
 *方法的重写。
 *1.父类的有参构造函数，必须在子类创建构造函数中用super调用并传参
 * @author Administrator
 *
 */
public class OverWrite {

	public static void main(String[] args) {
		Figure f=new Figure(2,3);
		Square s=new Square(3,4);
		System.out.println(f.area());
		System.out.println(s.area());
	}
	

}
class Figure{
	double x,y;
	Figure(double a,double b){
		x=a;
		y=b;
	}
	double area(){
		System.out.println("图形面积：");
		return(x*y);
	}
	
}
class Square extends Figure{
	Square(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("方形的面积：");
		return(x*y);
	}
}
