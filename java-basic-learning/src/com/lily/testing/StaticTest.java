package com.lily.testing;

/**
 * �ȽϾ�̬������ʵ����������������
 * @author Administrator
 *
 */

public class StaticTest {
	//������̬����
    private static int staticint=2;
    //����ʵ������
    private int random=2;
    public StaticTest(){
    	staticint++;
    	random++;
    	System.out.println("staticint="+staticint+" random="+random);
    }
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StaticTest st1=new StaticTest();
		//st1ִ�к󣬾�̬�����Դ��ڣ�����ʵ��������������ٶ�����
		//��ִ��st2ʱ����̬����������ʹ�ã����Ǵ�ʱ��ʵ������Ϊ�·���ģ����г�ʼֵ����Ϊ2
		@SuppressWarnings("unused")
		StaticTest st2=new StaticTest();

	}

}
