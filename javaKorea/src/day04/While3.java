package day04;

public class While3 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i+"번");
			i += 1;
			
		}
		
		int x = 0;
		while (x<5) {
			System.out.println("안녕");
			x++;
		}
		
		int a = 0;
		int sum = 0;
		while (a<=50) {
			sum += a;
			a++;
			
		}
		System.out.println(sum);
		//1~50까지 합 구하기 1275
		
		
		
	}
}
