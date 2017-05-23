package com.lily.senior;

import java.util.HashMap;
import java.util.Map;

/**
 * Map小测
 * @author Administrator
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		//创建map对象，应该实例化HashMap对象，不能实例化new Map()
		Map map = new HashMap();
		map.put("zara", 1);
		map.put("hm", 2);
		map.put("uniq", 3);
		//输出的map映射顺序有什么规则？为什么看不出规律
		System.out.println("map的映射为："+map);

	}

}
