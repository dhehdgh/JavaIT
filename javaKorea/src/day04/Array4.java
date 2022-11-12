package day04;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		//입력받은 나라의 수도를 알려주는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		String nations[] = {"한국","미국","중국","일본"};
		String cities[] = {"서울","워싱턴","베이징","도쿄"};
		
		String in = "null";		//사용자로부터 입력받은 값을 저장할 변수
		int idx = 0;			//입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
				
		while(true) {
		System.out.println("어느 나라의 수도가 궁금하신가요?");
		for(int i=0;i<nations.length;i++) {
			System.out.println(nations[i]);
			
		}
			in = sc.next();
		
		
			
		
			
		
		
		}
		
	}
	
}

