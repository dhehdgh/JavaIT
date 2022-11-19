package day07;


public class Extends4 {
	public static void main(String[] args) {
		Human hu = new Human("홍길동",20);
		System.out.println("이름: "+hu.getName()+", 나이: "+hu.getAge());
		
		Member me = new Member("멤버", 30, 9999);
		
		me.memberInfo();
		
	}
}


// 사람Human
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터세터
class Human{
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


// 회원Member
// +회원번호
// 생성자를 통해서 정보를 입력
// 회원번호 게터세터
// +회원소개
class Member extends Human{
	
	private int memNO;
	public Member(String name, int age, int memNO) {
		super(name, age);
		this.memNO = memNO;
	
	}
	public int getMemNO() {
		return memNO;
	}
	public void setMemNO(int memNO) {
		this.memNO = memNO;
	}
	public void memberInfo() {
		System.out.println("이름: "+this.getName()+", 나이: "+this.getAge()+", 회원번호: "+this.getMemNO());
	}
	
	
	
}
	
	
	
	
		

