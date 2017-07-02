package com.lily.util;

public interface AnimalIF {
	//接口中的方法为隐式的抽象方法，不用abstract关键字修饰
	//接口中的方法没有方法体，必须在实现的类中实现该方法
    public void eat();
    public void travel();
}
