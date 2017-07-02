package com.lily.directory;

import java.io.*;

/**
 * 删除目录 ：原则删除的目录必须为空，所以要先逐个删除目录下的所有文件
 *
 * 
 * @author Administrator
 *
 */
public class DeleteDir {

	public static void main(String[] args) {

		// 1.如果文件存在的话，去执行删除
		// 1.1 判断当前file是不是一个目录，
		// 1.1.1 如果是一个目录的话，应该先遍历文件夹下面的文件并删除，然后再删除这个空文件夹，
		// 1.1.2 不是的话，说明它本身就是一个文件，直接删除
		// 1.2 通过判断这个file是不是还存在，不存在的话，说明已经删除成功
		// 1.3 如果file还存在，删除不成功
		// 2，不存在的话，说明路径有误，目录不存在，应该输出错误提示

		String dir = "/Users/Lily/learn/Java/java-basic-learning/src/com/lily/directory/test/";
		File f = new File(dir);
		if (f.exists()) {
			if (f.isDirectory()) {
				String[] file = f.list();
				for (int i = 0; i < file.length; i++) {
					File f1 = new File(file[i]);
//					File f1 = new File(dir + file[i]);
					f1.delete();
				}
			}
			
			f.delete();

			if (!f.exists()) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		} else {
			System.out.println("目录不存在");
		}

		// try {
		// if (f.createNewFile()) {
		// if (f.isDirectory()) {
		// String[] s = f.list();
		// for (int i = 0; i < s.length; i++) {
		// File f2 = new File(s[i]);
		// f2.delete();
		// }
		// }
		// if (f.delete()) {
		// System.out.println("删除目录成功");
		// } else {
		// System.out.println("删除目录失败");
		// }
		// }
		// } catch (Exception e) {
		// System.out.println("目录创建失败");
		// }

	}
}
