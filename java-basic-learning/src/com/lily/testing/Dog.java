package com.lily.testing;

/**
 * Dog��̳�Animal�࣬����animal�еķ���
 * @author Administrator
 *
 */
public class Dog extends Animal {
	public Dog(String myname, int myid) {
		super(myname, myid);
		
	}
	//��дeat����

	public void eat(){
		super.eat();
		System.out.println(name +" eat  gouliang");
		super.sleep();//ͨ��super�ؼ��ֵ��ø����еķ���
	}
	public void bark(){
		System.out.println("�����Խ�");
	}

	public static void main(String[] args){
		//Animal�Ĺ��췽���в��������Դ˴�ʵ��������ҲҪ����
		//Animal a=new Animal("animal",2);//Animal����
		Dog b=new Dog("dog",3);//Dog����
		//a.eat();//ִ��Animal�෽��
		b.eat();//ִ��Dog�෽��
		b.bark();
		
	
	}
}