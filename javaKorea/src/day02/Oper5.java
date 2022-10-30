package day02;

public class Oper5 {
	public static void main(String[] args) {
		// 연산자(연산기호,특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++,--
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&, ||, !
		
		boolean 참거짓1 = true;
		boolean 참거짓2 = false;
		
		System.out.println(3>2);
		System.out.println(3<2);
		
		// > 크다 
		//< 작다 
		//>= 크거나 같다 
		//<= 작거나 같다 
		//== 같다 
		//!= 다르다
		int 숫자1 = 1;
		int 숫자2 = 2;
		System.out.println(숫자1 > 숫자2);
		System.out.println(숫자1 < 숫자2);
		System.out.println(숫자1 >= 숫자2);
		System.out.println(숫자1 <= 숫자2);
		System.out.println(숫자1 == 숫자2);
		System.out.println(숫자1 != 숫자2);
		
		System.out.println("================");
		
		
		int x = 20;
		int y = 10;
		boolean result = false;
		
		result = x > y;
		System.out.println("x > y = "+result);
		result = x < y;
		System.out.println("x < y = "+result);
		result = x >= y;
		System.out.println("x >= y = "+result);
		result = x <=y;
		System.out.println("x <= y = "+result);
		result = x == y;
		System.out.println("x == y = "+result);
		result = x != y;
		System.out.println("x != y = "+result);
		
		// 각 자료형의 기본값
		int 정수 = 0;
		double 실수 = 0.0;
		String 문자열 = null;
		boolean 불린 = false;
		char 문자 = '\0';
		
				
		
		
		
	}
}
