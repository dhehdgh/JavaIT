package day04;

public class For3 {
	public static void main(String[] args) {
		
		//안녕 5번
		for(int i=0;i<5;i++) {
			System.out.println("안녕");
		}
		
		//1~10까지 합 구하기
		int 총합 = 0;
		for(int a=0;a<11;a++) {
			총합 += a;
		}
		System.out.println(총합);
		
		//10부터 1 거꾸로 출력하기
		for(int b=10;b>0;b--) {
			System.out.println(b);
		}
		
		//0~20까지 2씩 증가시키면서 출력하기
		for (int c=0;c<=20;c+=2) {
			System.out.println(c);
		}
		
		
	}
}
