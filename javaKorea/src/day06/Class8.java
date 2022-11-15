package day06;

public class Class8 {
	public static void main(String[] args) {
		
		Person 홍길동 = new Person("홍길동", 22, "남성", 177.6);
		Person 이순신 = new Person("이순신", 23, "남성", 188.8);
		// 해당 클래스 사용을 위해서 먼저 해줘야 하는 작업을 문법으로 만듦 (생성자)
		
		/*
		홍길동.name = "홍길동";
		홍길동.age = 20;
		홍길동.sex = "남성";
		홍길동.height = 180;
		*/
		
		
		홍길동.personInfo();
		이순신.personInfo();
		홍길동.인사하기();
		이순신.인사하기();
	}
}

class Person{
	String name;
	String sex;
	int age;
	double height;
	
	//생성자의 이름은 클래스의 이름과 같음, 자료형이 없음
	Person(String name, int age, String sex, double height){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		
	}
	
	public void personInfo() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 성별 : "+sex+" 키 : "+height);
	}

	
	public void 인사하기() {
		System.out.println(name+"이 인사합니다.");
	}
}