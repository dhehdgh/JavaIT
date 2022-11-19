package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.Print();
		TestClassEx tce = new TestClassEx();
		tce.Print(5, "hello");
		tce.add();
	}
}

class TestClass{
	// private : 나 외에 다 사용 불가
	// protected : 상속받은 클래스까지는 허용
	// default(안적으면) : 같은 패키지면 허용
	// public : 같은 프로젝트면 허용
	
	// 상속할거면 private -> protected
	
	protected int num;
	protected String str;
	private double dNum;
	
	public void Print() {
		System.out.println("테스트 클래스 사용");
	}
}

// TestClass를 상속받아서 수정&추가

class TestClassEx extends TestClass{
	// 수정(오버라이딩)
	private int num2;
	
	public void Print(int num, String str) {
		this.num = num;
		this.str = str;
		System.out.println("TestClassEx가 만든 Print 사용");
		super.Print();
	
	}
	public int add() {
		System.out.println("추가된 메서드");
		return 0;
	}
	
}
