package com.human.ex;

import java.util.Arrays;

public class Java008 {
     //배열을 매개변수로 가지는 함수
	public static void arr1(int a) {
		a=10;
	}
	public static int arr2(int a) {
		a=10;
		return a;
	}
	public static void arr3(int a[]) {
		a[0]=10;
	}
	public static int[] arr4(int a[]) {
		a[0]=10;
		return a;
	}

	public static void main(String[] args) {
		int a=5;
		int arr[]= {1,2};
		arr1(a);
		System.out.println(a);
		int rValue=arr2(a);
		System.out.println(a);
		System.out.println(rValue);
		System.out.println(arr2(15));
		arr3(arr);
		
		System.out.println(Arrays.toString(arr));
		int rArr[]=arr4(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
		rArr[1]=9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));

	}

}
