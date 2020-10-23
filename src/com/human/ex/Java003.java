package com.human.ex;

public class Java003 {

	public static void main(String[] args) {
		
		for(int i=0; i<6; i++) {
			int z=i;
			int x=1;
			if(i==0) {
				for(int j=0; j<6; j++) {
					System.out.print(j+" ");					
				}
				System.out.println("");
			}else if(i==1) {
				for(int j=0; j<6; j++) {
					System.out.print(z*x+" ");
					z++;
				}
				System.out.println("");
			}else {
				for(int j=0; j<6; j++) {
					System.out.print(z*x+" ");
					x++;
				}
				System.out.println("");
			}
		}

	}

}
