package day03;

import java.util.Scanner;

public class If2 {
	public static void main(String[] args) {
		//입력 (사용자가 값을 제공)
		Scanner sc = new Scanner(System.in);
		
		int 숫자1 = 0;
		String 글자1 = null;
		double 숫자2 = 0.0;
		
		
		System.out.println("정수를 입력하세요 :");
		숫자1 = sc.nextInt();
		System.out.println("문자열을 입력하세요 :");
		글자1 = sc.next();
		System.out.println("실수를 입력하세요 :");
		숫자2 = sc.nextDouble();
		
		System.out.println(숫자1);
		System.out.println(글자1);
		System.out.println(숫자2);
		
				
		if(숫자1 == 10) {
			System.out.println("입력한 숫자는 10입니다.");
		}
		if(숫자2 == 3.14) {
			System.out.println("입력한 실수는 3.14입니다.");
		}
		if(글자1.equals("비교대상")) {
			System.out.println("입력한 문자열은 비교대상 입니다.");
		}
		
		
	}
}
