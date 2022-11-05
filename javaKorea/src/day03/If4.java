package day03;
import java.util.Scanner;

import day01.Syos1;

public class If4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int 국어;
		int 영어;
		int 수학;
		System.out.println("국어점수:");
		국어 = sc.nextInt();
		System.out.println("영어점수:");
		영어 = sc.nextInt();
		System.out.println("수학점수:");
		수학 = sc.nextInt();
		
		int 합계 = 국어+영어+수학;
		
		
//		if(국어>=40&&영어>=40&&수학>=40&&합계>=150) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		if(합계 >= 150) {
			if(국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
				System.out.println("합격");
			}else {
				System.out.println("과락");
			}
		}else {
			System.out.println("불합격");
		}
		//if 중첩사용 ver.
		
	}
}
