package day02;

public class If2 {
	public static void main(String[] args) {
		
		int age = 80;
		
		if(age<10) {
			System.out.println("미성년자");
		}else if(age < 20) {
			System.out.println("10대");
		}else if(age < 30) {
			System.out.println("20대");
		}else if(age < 40) {
			System.out.println("30대");
		}else {
			System.out.println("40대 이상");
		}
		
		//버스카드기계
		//나이 14살 미만이면 어린이
		//14살 이상, 20살미만이면 청소년
		//20살 이상이면 성인
		int 나이 = 8;
		int 요금;
		if(나이<14) {
			System.out.println("어린이");
			요금 = 400;
		}else if(나이<20) {
			System.out.println("청소년");
			요금 = 650;
		}else {
			System.out.println("성인");
			요금 = 1000;
		}
		System.out.println("요금은 "+요금+"원");
		
	}
}
