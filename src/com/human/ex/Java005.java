package com.human.ex;

import com.human.dto.Human01;
public class Java005 {

	public static void main(String[] args) {
		Human01 arr1[]=new Human01[2];
		arr1[0]=new Human01("ȫ�浿",10,155.5);
		arr1[1]=new Human01("ȫ�泲",10,155.5);
		Human01 arr2[]=arr1;
		Human01 arr3[]=new Human01[2];
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=arr1[i];
		}
		//ȫ�泲 ���� 10�� 20���� �����غ���.
		arr1[1].age=20;
		System.out.println(arr1[1].age);//20
		System.out.println(arr2[1].age);//20
		System.out.println(arr3[1].age);//20
		//arr1�� arr3�� �ٸ����� ������ �ֵ��� �����غ���. 1��° ���
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=new Human01();
			arr3[i].name=arr1[i].name;
			arr3[i].height=arr1[i].height;
			arr3[i].age=arr1[i].age;
		}
		arr3[1].age=99;
		System.out.println(arr1[1].age);//20
		System.out.println(arr2[1].age);//20
		System.out.println(arr3[1].age);//99
		
		//arr1�� arr3�� �ٸ����� ������ �ֵ��� �����غ���. 2���� ���
//		Human01 arr1[]=new Human01[2];
//		arr1[0]=new Human01("ȫ�浿",10,155.5);
//		arr1[1]=new Human01("ȫ�泲",10,155.5);
//		Human01 arr2[]=arr1;
//		Human01 arr3[]=new Human01[2];
//		arr3[0]=new Human01("ȫ�浿",10,155.5);
//		arr3[1]=new Human01("ȫ�泲",10,155.5);
//		arr1[1].age=20;
//		System.out.println(arr1[1].age);//20
//		System.out.println(arr2[1].age);//20
//		System.out.println(arr3[1].age);//10

		
//		int a[]= {1,2,3,4,5};
//		int b[]=new int[5];
//		b=a;               //b��a�� ���� ������
//		b[1]=5;
		//a��b�� �ٸ����� ���� ��
//		for(int i=0; i<a.length; i++) {
//			b[i]=a[i];
//		}
//		System.out.println(a[1]);
	}

}

