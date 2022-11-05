package day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		//윤년 구하는 프로그램 만들기(2월달이 29일까지)
		//년도를 입력받고 윤년인지 아닌지 판별해주는 프로그램을 만들어보기
		
		//윤년 : 해당 년도가 4로 나누어 떨어지고 100으로는 나누어 떨어지지 않으면 윤년
		//혹은 400으로 나누어 떨어지면 무조건 윤년
		//2012 : 윤년 (4의배수이면서 100의 배수가 아님)
		//2200 : 윤년이 아님 (100의배수)
		//2013 : 윤년이 아님 (4의 배수가 아님)
		//2000 : 윤년 (400의 배수)
		//2400 : 윤년 (400의 배수)
		
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.println("년도를 입력하세요>>");
		year = sc.nextInt();
		
		//년도에 따라서 '윤년' 혹은 '윤년이 아님' 출력하기
		
		
		if(year%4==0) {
			if(year%100!=0||year%400==0) {
				System.out.println("윤년");
			}else {
				System.out.println("윤년이 아님");
			}
		}else {
			System.out.println("윤년이 아님");
		}
		
		
		
		
	}	
}
		
		
		
	

