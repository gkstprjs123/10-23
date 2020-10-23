package com.human.ex;



import java.util.Arrays;

import com.human.dto.Human01;
public class Java001 {

	public static void main(String[] args) {
		//int arr1[]=new int[3];
		int arr1[]= {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]);
		
		double arr2[]= {1.1,2.1,3.1};
		arr2[0]=195959.1248;
		System.out.println(arr2[0]);
		
		String arr3[]= {"°­¾ÆÁö","°í¾çÀÌ","ºØ¾î"};
		arr3[0]="ÄÚ³¢¸®";
		for(int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		Human01 arr4[]=new Human01[3];
		arr4[0]=new Human01();
		arr4[0].name="È«±æµ¿";
		arr4[0].age=15;
		arr4[0].height=154.1;
		
		arr4[1]=new Human01();
		arr4[1].name="È«±æ³²";
		arr4[1].age=25;
		arr4[1].height=157.1;
		
		arr4[2]=arr4[0];
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
		//[com.human.dto.Human01@15db9742, com.human.dto.Human01@6d06d69c, com.human.dto.Human01@15db9742]
		System.out.println(arr4[0]);
		
		arr4[1].name="È«±æµ¿";
		arr4[1].age=15;
		arr4[1].height=154.1;
		
		
//		arr4[0]=new Human01();
//		arr4[0].name="È«±æµ¿";
//		arr4[0].age=15;
//		arr4[0].height=154.1;
		//»ı¼ºÀÚ ÇÔ¼ö
		arr4[0]=new Human01("È«±æµ¿",15,154.1);
		System.out.println(arr4[0]);
		
		System.out.println(arr4[0]==arr4[1]);
		System.out.println(arr4[0].equals(arr4[1]));
		

	}

}