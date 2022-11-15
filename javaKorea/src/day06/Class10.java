package day06;

// public class : 파일당 1개
public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		mc.헬로월드();
		mc.문자열출력("문자열");
		String result3 = mc.문자열합치기("안녕", "하세요");
		System.out.println(result3);
		int result4 = mc.절댓값(-4, 3);
		System.out.println(result4);
	}
}


class MyClass10{
	
	// #1 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	
	void 헬로월드() {
		System.out.println("Hello World");
	}
	
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	void 문자열출력(String str) {
		System.out.println(str);
	}
	
	// #3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return
	// return한 값은 main메서드에서 출력
	String 문자열합치기(String a, String b) {
		return a + b;
		
		
	}
	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	// 절댓값으로 만들고 더한 다음 return -> main에서 변수로 받아 출력
	public int 절댓값(int a, int b) {
		if(a<0) {
			a=-a;
		}
		if(b<0) {
			b=-b;
		}
		return a + b;
	}
	
	
}