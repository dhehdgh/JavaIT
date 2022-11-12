package day05;

public class Class4 {
	public static void main(String[] args) {
		Aircon aircon = new Aircon();
		aircon.temp = 20;
		System.out.println(aircon.temp);
		
		aircon.powerOn();
		aircon.tempUp();
		aircon.tempUp();
		aircon.tempDown();
		aircon.currentTemp();
	}
}
class Aircon{
	int temp = 25;		//클래스 안에서 만들어진 변수(멤버변수)
	
	void currentTemp() {
		int temp = 0;		// 함수 안에서 만들어진 변수(지역변수) 
		//함수가 끝나면 사라짐,우선순위가 멤버변수보다 높음, 해당 함수 안에서만 사용 가능
		System.out.println("현재 온도는 "+this.temp+"입니다.");
		// this. : 멤버에 있는 변수 또는 메서드를 지칭
	}
	void tempUp() {
		temp++;
		System.out.println("에어컨을 온도를 올립니다.온도: "+temp);
	}
	void tempDown() {
		temp--;
		System.out.println("에어컨을 온도를 내립니다.온도: "+temp);
	}
	void powerOn() {
		System.out.println("에어컨을 가동합니다. 온도: "+temp);
	}
}