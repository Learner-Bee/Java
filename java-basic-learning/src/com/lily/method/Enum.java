package com.lily.method;

/**
 * ö�����͹��캯���ͷ�����ʹ��
 * @author Administrator
 *
 */
public class Enum {
	public static void main(String[] args) {
		for(Info c:Info.values()){
			System.out.println(c+"����Ϊ��"+c.getSalary());
		}

	}

}
enum Info{
	lily(15000) , mk(25000);
	private int salary;
	//���캯��û�д�ֵ��Ϊʲô�ܻ��salary�أ�
	Info(int s){
		salary=s;
	}
	int getSalary(){
		return salary;
	}
}
