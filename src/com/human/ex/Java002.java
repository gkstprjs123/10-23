package com.human.ex;

public class Java002 {

	public static void main(String[] args) {
		String str1="ȫ�浿";
		String str2="ȫ�浿";
		//String��  equals �޼ҵ�� ����ִ� ���ڿ� �����͸� ���Ѵ�.
		//str1,str2�� ���� ���� ����ҷ� ����
		//str3,str4�� ���� new�� �����Ǿ� �ٸ� ����ҿ� ����
		String str3=new String("ȫ�浿");
		String str4=new String("ȫ�浿");
		
		//String �� ==�� �ּҰ� ���� equals�� �ȿ� �����Ͱ� ����
		if(str1==str2) {
			System.out.println("����");
		}
		if(str1==str3) {
			System.out.println("����");
		}
		if(str1.equals(str2)) {
			System.out.println("����");
		}
		if(str1.equals(str3)) {
			System.out.println("����");
		}
		


		
	
		
	}

}
