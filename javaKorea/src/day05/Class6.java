package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.name = "홍길동";
		홍길동.age = 20;
		홍길동.sex = "남성";
		홍길동.height = 180;
		
		이순신.setInfo("이순신", 50, "남성", 170);
		
		홍길동.personInfo();
		이순신.personInfo();
		홍길동.인사하기();
		이순신.인사하기();
		
		
	}
}

class Person{
	//이름,나이,성별,키
	
	// 정보보기 기능 (이름,나이,성별,키 출력)
	// 인사하기 (홍길동이 인사합니다)
	
	String name;
	String sex;
	int age;
	double height;
	
	public void personInfo() {
		System.out.println("이름 : "+name+" 나이 : "+age+" 성별 : "+sex+" 키 : "+height);
	}
	public void setInfo(String name, int age, String sex, double height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	public void 인사하기() {
		System.out.println(name+"이 인사합니다.");
	}
	
}