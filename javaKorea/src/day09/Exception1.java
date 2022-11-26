package day09;

// 예외처리 : 프로그램 오동작 방지
// 에러 : 심각한 문제
// 예외 : 덜 심각한 문제
public class Exception1 {
	public static void main(String[] args) {
		Try1 try1 = new Try1(10, 0);
		try1.go();
	}
}

class Try1{
	private int num1;
	private int num2;
	
	public Try1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void go() {
		if(num2 != 0) {					// java에서 지원하는 클래스에서 오류가 났을 경우 -> 예외처리 불가능 -> try
			System.out.println(num1/num2);
		}else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}
	
	
}
