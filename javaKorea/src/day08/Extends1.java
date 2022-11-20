package day08;

public class Extends1 {
	public static void main(String[] args) {
		Star st = new Star("아메리카노", 3000);
		st.sell();
		st.sell2();
		StarBupyeong stb = new StarBupyeong("믹스커피", 10000, "부평점");
		stb.sell();
		stb.sell2();
		
		
		
	}
}

// 1. 상속용, 2. 모든 메서드가 재정의되어야만 함, 3. 명세서(룰제공)   ====> Interface : 명세서대로 안하면 오류발생(누락방지)
class Star{
	// 본사 : 스타벅스가 갖춰야할 기본 데이터와 기능
	protected int price;
	protected String menu;
	static int menu2; 		// 기존 변수와 다른 공간에 저장되어서 계속 살아있음
	
	// 생성자로 가격, 메뉴 정하기
	Star(String menu, int price){
		this.menu = menu;
		this.price = price;
	}
	// OO을 판매합니다.
	public void sell() {
		System.out.println(menu+"를 판매합니다.");
	}
	
	// OO의 가격은 OO입니다.
	public void sell2() {
		System.out.println(menu+"의 가격은 "+price+"원 입니다.");
	}
	
}

class StarBupyeong extends Star{
	
	// 부평점 : 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	private String lo;
	StarBupyeong(String menu, int price, String lo) {
		super(menu, price);
		this.lo = lo;
		this.menu = menu;
		this.price = price;
		
	}

	// 부평점 - OO을 판매합니다.
	public void sell() {
		System.out.println(lo+" - "+menu+"를 판매합니다.");
	}
	// 부평점 - OO의 가격은 OO입니다.
	public void sell2() {
		System.out.println(lo+" - "+menu+"의 가격은 "+price+"원 입니다.");
	}
	
}

// 인터페이스를 상속받을 때는 implement
class StarGangnam implements Star2{
	int price;
	String menu;
	
	
	public StarGangnam(int price, String menu) {
		this.price = price;
		this.menu = menu;
	}
	@Override
	public void sell() {
		System.out.println("강남점 - "+menu+"를 판매합니다.");
	
	}

	@Override
	public void sell2() {
		System.out.println("강남점 - "+menu+"의 가격은 "+price+"원 입니다.");
		
	}

}

interface AA{
	
}

// 다중상속 가능
class SS implements AA, Star2{

	
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell2() {
		// TODO Auto-generated method stub
		
	}
	
}














