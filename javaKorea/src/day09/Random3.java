package day09;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
	public static void main(String[] args) {
		MyRandom3 mr3 = new MyRandom3();
		mr3.go();
	}
}

class MyRandom3{
	// 입력받은 두 수 사이에서 램덤을 돌려 출력
	public void go() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = -1;
		System.out.print("최소 범위를 입력하세요>>");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("최대 범위를 입력하세요>>");
		num2 = Integer.parseInt(sc.nextLine());
		
		Random random = new Random();
		
		result = random.nextInt(num2 - num1 +1) + num1;
		System.out.println(result);
		
		
		
		
	}
}