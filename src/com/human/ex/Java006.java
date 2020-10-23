package com.human.ex;

public class Java006 {
	public static int money(int a) {
		int c=a*1161;
		return c;
	}
	public static int cup(int a,int b) {
		int c=a*b;
		return c;
	}
	public static int min(int a,int b) {
		int c=a*b;
	     return c;
	}
     public static int mul(int a,int b) {
    	 int c=a-b;
	     return c;
	}
    public static int div(int a,int b) {
	     int c=a/b;
	     return c;
    }

	public static void main(String[] args) {
		
		System.out.println(money(6));
		System.out.println(cup(6,1500));
		System.out.println(min(5,3));
		System.out.println(mul(57,41));
		System.out.println(div(15,3));
		
	}

}
