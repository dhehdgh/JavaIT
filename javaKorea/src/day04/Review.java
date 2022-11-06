package day04;

public class Review {
	public static void main(String[] args) {
		String name = "sung";		//문자열 변수
		int age = 33;				//정수 변수
		double height = 177.0;		//실수 변수
		boolean marry = false;		//참거짓
		//변수 : 저장공간
		
		//조건문 : if, switch (조건이 맞으면 {}을 실행)
		//if ~ else if ~ else
		//switch ~ case ~ break
		
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 0) {
			System.out.println("미성년자");
		}else {
			System.out.println("?");
		}
		
		
		//switch : 소괄호에 있는 내용과 case 옆에 있는 내용이 같으면 해당 라인부터 시작,  break만나면 종료
		switch(age/10) {
		case 0:
			System.out.println("어린이");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
		default:
			System.out.println("30대 이상");
		}
		
		
	}
}
