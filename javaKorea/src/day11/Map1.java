package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map1Impl m1i = new Map1Impl();
		m1i.go();
		
		
		// List : 배열 대체 (삽입, 제거 용이)
		// Set : 중복X
		// Map : 순서를 단어로 지정
	}
}

class Map1Impl{
	public void go() {
		HashMap<String, Integer> hm = new HashMap<>();
		// put : 대입
		// remove : 제거
		// get : 읽기
		// Set/Iterator : 전체읽기
		
		hm.put("아메리카노", 1500);		// key , value(값)
		hm.put("카페라떼", 2500);
		hm.put("카페모카", 2500);
		hm.put("카라멜마끼아또", 3500);
		
		// 해당하는 키를 갖고있는지?
		System.out.println(hm.containsKey("카페라떼"));
		//해당 값을 갖고있는지?
		System.out.println(hm.containsValue(2500));
		
		// 제거
		hm.remove("카라멜마끼아또");
		System.out.println(hm.get("카페모카"));
		
		// 전체보기
		Set<String> keyset = hm.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key+":");
			System.out.println(hm.get(key));
		}
	}
	
}