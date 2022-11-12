package day05;

public class Class2 {
	int x = 0;
	// main메서드 : 프로그램 시작을 담당
	public static void main(String[] args) {
		//리턴값은 변수로 받아서 사용
		int a1 = 1+2;
		int a2 = 2-1;
		int a3 = 3*3;
		double a4 = 4.0/2;
		
		Class2 c = new Class2();
		int b1 = c.sum(1,2);
		int b2 = c.sub(2,1);
		int b3 = c.mul(3,3);
		double b4 = c.div(4,2);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("=======");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}
	
	//함수의 자료형 int : 나중에 return할 값의 자료형
	// () : 매개변수, 함수를 사용하는 곳에서 적어줄 값
	int sum(int a, int b) {
		//sum을 실행하면 수행할 코드
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}
