package day09;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		String 문자열변수 = "문자열저장";
		int 정수형변수 = 314;
		double 실수형변수 = 3.14;
		boolean 불린형변수 = true;
		
		Scanner sc = new Scanner(System.in);
		
		//문자열변수 = sc.next();			// 단어를 입력(띄어쓰기 금지)
		//정수형변수 = sc.nextInt();			// 정수를 입력
		//실수형변수 = sc.nextDouble();		// 실수를 입력
		
		
		//문자열변수 = sc.nextLine();							// 문장을 입력(버그가 있어서 next, nextInt와 혼용 금지)
		//정수형변수 = Integer.parseInt(sc.nextLine());			// 정수를 입력(nextInt 대체용)
		//실수형변수 = Double.parseDouble(sc.nextLine());		// 입력받은 문자열을 실수로 변환 (nextDouble 대체용)
		sc.close();
		
		// 자료형 변환
		// int <-> double : 기본자료형
		int num = 4;
		double dNum =3.14;
		System.out.println((double)num);
		System.out.println((int)dNum);
		
		// Stirng <-> int : 개발된 자료형(클래스)
		// toString, Integer.parseInt
		String str = "001230";
		num = Integer.parseInt(str);		// 문자열을 정수로
		str = Integer.toString(num);		// 정수를 문자열로
		
		System.out.println(num);


		// 조건문 if~else if~else
		if(num < 0){
			System.out.println("숫자는 0보다 작다");
		}else if(num == 0){
			System.out.println("숫자는 0이다.");
		}else if(num > 0) {
			System.out.println("숫자는 0보다 크다");
		}else {
			System.out.println("그 밖에");
		}
		
		// switch~case~break
		switch(num) {
		case 0:
			System.out.println("num은 0이다.");
			break;
		case 1:
			System.out.println("num은 1이다.");
			break;
		default:
			System.out.println("그 밖에");
		}
		
		
		// 반복문 while, for
		
		int count = 0;
		while(count < 5) {
			System.out.println("현재 "+(count+1)+"번");
			count++;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("현재 "+(i+1)+"번");
			
			if(i == 2) {
				break;			// 반복문 끝
				//continue;		// 밑에 부분 실행하지 않고 첫 부분으로 올라감
			}
		}
		
		ReviewTest rt = new ReviewTest();		// 객체화
		rt.go();
		rt.setStr("안녕");
		System.out.println(rt.getStr());
		
		
	}		// main 메서드
}			// 클래스

// 클래스 : 변수 + 함수
class ReviewTest extends TheOne implements TheTwo{
	// 멤버변수
	private int num[] = {10,20,30,40,50};
	
	
	// 메서드 public
	public void go() {
		for(int i=0;i<5;i++) {
			// 지역변수 i는 중괄호가 끝나면 없어짐
			System.out.println(num[i]);
		}
	}	
}

class TheOne{
	private String str;
	public TheOne() {
		// 클래스 이름과 같고 소괄호가 있으면 '생성자'
		// 생성자 : 객체화하는 순간에 사용될 메서드
		System.out.println("객체화 성공");
	}
	public String getStr() {			// 메서드의 자료형 : return의 자료형
		return str;					// return : 함수를 종료시키면서 해당 값을 사용한 곳에 전달
	}
	public void setStr(String str) {			// () : 매개변수, 사용하는 곳에서 전달해줘야하는 값을 지정하는 변수들
		this.str = str;						// this. : 이 클래스의, 멤버에 있는 변수나 메서드를 사용하기 위해 앞에 붙여줌
	}
}

interface TheTwo{
	public void go();
}





























