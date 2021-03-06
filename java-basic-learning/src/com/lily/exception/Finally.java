package com.lily.exception;

public class Finally {

	public static void main(String[] args) {
		Finally f=new Finally();
		f.doTheWork();

	}
	public void doTheWork(){
		Object o=null;
		for(int i=0;i<5;i++){
		 try{
				o=makeObj(i);
			}
		catch(IllegalArgumentException e){
				System.err.println("Error:"+e.getMessage());
			}
		finally{
			System.out.println("执行finally");
			if(o==null)
				System.exit(0);
		}
		 System.out.println(o);
		}
	}
	public static Object makeObj(int i) {
		if(i==1)
			throw new IllegalArgumentException("不是指定的类型："+i);			
		
		return  new Object();
	}

}
