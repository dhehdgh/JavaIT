package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램
		String nations[] = {"한국","대한민국","미국","중국","일본"};
		String cities[] = {"서울","서울","워싱턴","베이징","도쿄"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어느 나라의 수도가 궁금하신가요? (0을 입력하면 종료)");
		
		while(true) {
			String in;
			int idx = -1;
			in = sc.next();
			for(int i=0;i<nations.length;i++) {
				if(in.equals(nations[i])) {
					idx=i;
				}
				}
			if(in.equals("0")) {
				System.out.println("프로그램 종료");
				break;
			}
			if(idx != -1) {
			System.out.println(nations[idx]+"의 수도는 "+cities[idx]+"입니다");
			}else {
				System.out.println("해당 국가가 없습니다");
			}
		
		}
	}
}
