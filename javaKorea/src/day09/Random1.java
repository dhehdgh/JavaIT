package day09;

public class Random1 {
	public static void main(String[] args) {
		MyRandom1 mr1 = new MyRandom1();
		mr1.go();
	}
}

class MyRandom1{
	
	public void go() {
		// 랜덤을 돌리는 방법 2가지
		// 1. Math.random()
		// 2. Random클래스
		
		
		// 1. Math.random()
		double num1 = Math.random();		// 0.0 ~ 0.999999 랜덤
		System.out.println(num1);
		
		// 0 ~ 99
		int num2 = (int)(Math.random()*100);
		System.out.println(num2);
		
		// 1 ~ 100
		int num3 = (int)(Math.random()*100)+1;
		System.out.println(num3);
		
		// 50 ~ 100
		int num4 = (int)(Math.random()*51)+50;			// 0 ~ 50
		System.out.println(num4);
	}
}