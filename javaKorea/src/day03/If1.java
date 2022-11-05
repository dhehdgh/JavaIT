package day03;

public class If1 {
	public static void main(String[] args) {
		//조건문
		//if, wsitch
		
		//if (){}
		//() 안에 내용이 맞으면 {}을 실행
		//틀리면 {} 무시
//		int age =16;
//		if(age>=20) {
//			System.out.println("성인입니다");
//		}
//		else {
//			System.out.println("미자입니다");
//		}
		
		int age = 6;
		if(age >= 20) {
			System.out.println("성인입니다");
		}
		else if(age >= 14) {
			System.out.println("청소년입니다");
		}
		else if(age >= 0) {
			System.out.println("어린이입니다");
		}
		else {
			System.out.println("?");
		}
	}
}
