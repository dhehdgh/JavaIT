package day04;

public class For1 {
	public static void main(String[] args) {
		//for : while이 너무 지저분하니까 정리해서 쓰자
		
		//while버전
		int x = 0;
		while (x<5) {
			System.out.println("while안녕");
			x++;
		}
		
		//for버전
		for(int i=0; i<5; i++) { //소괄호 안에 다 집어넣음
			System.out.println("for안녕");
		}
		
		/*
		 * for(초기값;조건식;증감량){
		 * 반복하고자 하는 코드들;
		 * }
		 */
		
		//while버전
		int a = 0;
		int sum = 0;
		while (a<=10) {
			sum += a;
			a++;
		}
		System.out.println(sum);
		
		//for버전
		int 총합 = 0;
		for(int b=0;b<=10;b++) {
			총합 += b;
		}
		System.out.println(총합);
		
		// 1. 초기값을 생성
		// 2. 조건식 검사
		// 3. {} 실행
		// 4. 증감연산
		// 5. 조건식 검사
		// 6. {} 실행...
	}
}
