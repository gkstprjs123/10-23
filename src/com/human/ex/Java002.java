package com.human.ex;

public class Java002 {

	public static void main(String[] args) {
		String str1="홍길동";
		String str2="홍길동";
		//String의  equals 메소드는 들어있는 문자열 데이터를 비교한다.
		//str1,str2는 힙에 같은 저장소로 저장
		//str3,str4는 힙에 new가 생성되어 다른 저장소에 저장
		String str3=new String("홍길동");
		String str4=new String("홍길동");
		
		//String 비교 ==는 주소가 같냐 equals는 안에 데이터가 같냐
		if(str1==str2) {
			System.out.println("같다");
		}
		if(str1==str3) {
			System.out.println("같다");
		}
		if(str1.equals(str2)) {
			System.out.println("같다");
		}
		if(str1.equals(str3)) {
			System.out.println("같다");
		}
		


		
	
		
	}

}
