package day08;

import java.util.Scanner;


public class Interface2Impl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 다형성 : 부모의 자료형을 통일 (코드 재사용성이 증가됨)
		Interface2 shop;
		int shop_num;
		
		System.out.println("지점을 입력하세요(1:강남, 2:신촌, 3:인천, 0:종료)>>");
		shop_num = sc.nextInt();
		if(shop_num == 1) {
			shop = new Gangnam();
		}else if(shop_num == 2) {
			shop = new Shinchon();
		}else if(shop_num == 3) {
			shop = new Incheon();
		}
		
		shop = new Gangnam();
		Interface2 gangnam = new Gangnam();			// 다형성 (자료형을 부모의 것으로 통일할 수 있음)
		Interface2 shinchon = new Shinchon();
		Interface2 incheon = new Incheon();
		gangnam.make("아메리카노", 3000);
		gangnam.make("꿀아메리카노", 3000);
		gangnam.make("에스프레소", 2000);
		gangnam.coffeeList();
		System.out.print("구입할 커피를 입력하세요>>");
		gangnam.sell(sc.next());
		
	}
}


class Gangnam implements Interface2{
	String menu[] = new String[100];
	int priceList[] = new int[100];
	int end_idx = 0;
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		
		int index = -1;
		for(int i=0;i<menu.length;i++) {
			if(coffee.equals(menu[i])) {
				index = i;
		}
		}
		System.out.println("강남점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;
		System.out.println("강남점 - 커피를 추가했습니다.");
		
	}

	@Override
	public void coffeeList() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("========강남점=========");
		for(int i=0;i<end_idx;i++) {
			if(menu[i].equals(null)|| menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+" : "+priceList[i]+"원");
		}
		
		
	}
	
}

class Shinchon implements Interface2{
	String menu[] = new String[100];
	int priceList[] = new int[100];
	int end_idx = 0;
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		
		int index = -1;
		for(int i=0;i<menu.length;i++) {
			if(coffee.equals(menu[i])) {
				index = i;
		}
		}
		System.out.println("신촌점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;
		System.out.println("신촌점 - 커피를 추가했습니다.");
		
	}

	@Override
	public void coffeeList() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("========신촌점=========");
		for(int i=0;i<end_idx;i++) {
			if(menu[i].equals(null)|| menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+" : "+priceList[i]+"원");
		}
		
		
	}
	
}

class Incheon implements Interface2{
	String menu[] = new String[100];
	int priceList[] = new int[100];
	int end_idx = 0;
	
	@Override
	public void sell(String coffee) {
		// 판매했다고 출력
		
		int index = -1;
		for(int i=0;i<menu.length;i++) {
			if(coffee.equals(menu[i])) {
				index = i;
		}
		}
		System.out.println("인천점 - "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다.");
	}

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] = coffee;
		priceList[end_idx] = price;
		end_idx++;
		System.out.println("인천점 - 커피를 추가했습니다.");
		
	}

	@Override
	public void coffeeList() {
		// 현재 커피리스트와 가격리스트를 출력
		// 에스프레소 : 2000원...
		System.out.println("========인천점=========");
		for(int i=0;i<end_idx;i++) {
			if(menu[i].equals(null)|| menu[i].equals("")) {
				break;
			}
			System.out.println(menu[i]+" : "+priceList[i]+"원");
		}
		
		
	}
	
}