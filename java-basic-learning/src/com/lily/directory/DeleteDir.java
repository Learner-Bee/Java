package com.lily.directory;

import java.io.*;

/**
 * ɾ��Ŀ¼ ��ԭ��ɾ����Ŀ¼����Ϊ�գ�����Ҫ�����ɾ��Ŀ¼�µ������ļ�
 *
 * 
 * @author Administrator
 *
 */
public class DeleteDir {

	public static void main(String[] args) {

		// 1.����ļ����ڵĻ���ȥִ��ɾ��
		// 1.1 �жϵ�ǰfile�ǲ���һ��Ŀ¼��
		// 1.1.1 �����һ��Ŀ¼�Ļ���Ӧ���ȱ����ļ���������ļ���ɾ����Ȼ����ɾ��������ļ��У�
		// 1.1.2 ���ǵĻ���˵�����������һ���ļ���ֱ��ɾ��
		// 1.2 ͨ���ж����file�ǲ��ǻ����ڣ������ڵĻ���˵���Ѿ�ɾ���ɹ�
		// 1.3 ���file�����ڣ�ɾ�����ɹ�
		// 2�������ڵĻ���˵��·������Ŀ¼�����ڣ�Ӧ�����������ʾ

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
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		} else {
			System.out.println("Ŀ¼������");
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
		// System.out.println("ɾ��Ŀ¼�ɹ�");
		// } else {
		// System.out.println("ɾ��Ŀ¼ʧ��");
		// }
		// }
		// } catch (Exception e) {
		// System.out.println("Ŀ¼����ʧ��");
		// }

	}
}
