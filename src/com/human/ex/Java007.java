package com.human.ex;

public class Java007 {
    //�Ű������� ���� ���ϰ��� �ִ� �Լ�
	public static int function() {
		int returnValue=10;
		returnValue+=11;
		return returnValue;
	}
	//�Ű������� �ְ� ���ϰ��� �ִ� �Լ�
	public static int function2(int a,int b,int c) {
		int result=0;
		result=a+b-c;
		return result;
	}
    
	public static void main(String[] args) {
		int a=function();
		System.out.println(a);
		System.out.println(function());
		System.out.println(function2(5,3,6));
	}
	

}
