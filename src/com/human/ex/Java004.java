package com.human.ex;

public class Java004 {

	public static void main(String[] args) {
		int a[]= {0,1,2,3};
		int b[];
		b=a;
		b[1]=10;
		System.out.println(a[1]);
		//공유돼서 10이 나온다
		// a 0,1,2,3
		// b 0,10,2,3
		
//		int a[]= {0,1,2,3};
//		int b[]=new int[4];
//		b[1]=a[1];
//		b[1]=10;
//		System.out.println(a[1]);
		
		int c[]=new int[4];
		for( int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		c[1]=20;
		System.out.println(a[1]);
		
		//두개배열
//		int d[][]= {{1,2},{3,4}};
//		for(int i=0; i<d[0].length; i++) {
//			for(int j=0; j<d[1].length; j++) {
//				System.out.println(d[i][j]);
//			}
//		}
		
		
		

	}

}
