package day03;

public class Review {
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		
		String 변수1;
		int 변수2;
		double 변수3; //실수
		//변수 선언 : 자료형 변수명;
		
		변수1 = "Java";
		변수2 = 123;
		변수3 = 3.14;
		//이미 생성된 변수에 대해서는 자료형은 적으면 안됨
		
		//변수 초기화 : 선언과 동시에 대입을 한번에
		String 변수4 = "선언과 동시에 대입";
		
		
		//변수 사용 : 변수명을 적 어줌
		System.out.println(변수4);
		
		//대입시 유의사항
		변수4=변수1;		//오른쪽에 있는 것은 값사용, 왼쪽에 있는 것은 공간
		
		System.out.println(변수4);
		//연산자
		//== 같다
		System.out.println(변수1 == 변수4);
		
		/*!= 다르다
		 * >, <, >=, <=
		 * +, -, *, /, %
		 * +=, -=, *=,/=
		 * ++, --
		 * &&, ||, !
		*/
		
		//누적/증감 연산
		int num1 = 0;
		int num2 = 0;
		num1 = num1 + 2;
		System.out.println(num1);
		
		num2 += 2; //위 num1식과 같은 의미
		System.out.println(num2);
		
		//만약에 누적 증가값이 1이면 한번 더 생략 가능
		num1 += 1;
		num2++;	//num2 += 1;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = num1 - 1;		//num1 -= 1;
		num2--;
		System.out.println(num1);
		System.out.println(num2);
		
		
		// 자료형 변환 (정수 <-> 실수)
		int 정수1 = 3;
		double 실수1 = 3.14;
		System.out.println(정수1);
		System.out.println(실수1);
		
		System.out.println("=====형변환=====");
		System.out.println((double)정수1);
		System.out.println((int)실수1);
		
		
		/*정수 / 정수 == 정수
		 * 실수 / 정수 == 실수
		 * 실수 / 실수 == 실수
		 */
		
		
		
}
}