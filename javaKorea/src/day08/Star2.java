package day08;

// 구현 기준을 제공하기 위한 상속용
public interface Star2 {
	int price = 0;
	public static final String menu = null;
	// static : 멤버|지역 변수를 전역변수처럼 취급(전역변수 : 해당 함수 또는 클래스가 긑나도 계속 남아있음) 
	// final : 값 변경이 불가능 
	int index = 0;
	
	// interface : 메서드는 구현을 하지 않음
	public void sell();
	
	abstract public void sell2();			// 상속받은 곳에서 만들어라
	
}

// 인터페이스를 사용하는 경우
// 1. 반드시 구현해야하는 메서드를 안내하기 위해 (명세서)
// 2. 다중 상속이 가능 (extends는 한번에 하나만, implements는 여러개 가능)
