package com.lily.senior;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ö��С��
 * @author Administrator
 *
 */
public class EnumerationDemo {

	public static void main(String[] args) {
		Enumeration days;
		Vector day=new Vector();
		day.addElement("Sunday");
		day.addElement("Monday");
		day.addElement("Tuesday");
		day.addElement("Wednesday");
		day.addElement("Thursday");
		day.addElement("Friday");
		day.addElement("Saturday");
		days=day.elements();
		while(days.hasMoreElements()){
			System.out.println(days.nextElement());
		}

	}

}
