package com.lily.method;

/**
 *��������д��
 *1.������вι��캯�������������ഴ�����캯������super���ò�����
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
		System.out.println("ͼ�������");
		return(x*y);
	}
	
}
class Square extends Figure{
	Square(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("���ε������");
		return(x*y);
	}
}
