package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl map = new Map3Impl();
		map.go();
	}
}

class Map3Impl{
	private HashMap<String, String> hm = new HashMap<>();
	public void go() {
		
		Set<String> set = null;
		Iterator<String> it = null;
		Scanner sc = new Scanner(System.in);
		String nation = null, capital = null;
		hm.put("한국", "서울");
		hm.put("미국", "워싱턴");
		hm.put("일본", "도쿄");
		hm.put("중국", "베이징");
		System.out.println("국가를 입력하세요(0을 입력하면 전체보기)");
		nation = sc.nextLine();
		capital = hm.get(nation);
		
		if(hm.get(nation) == null || hm.get(nation).equals("")) {
			System.out.println("다시 입력해주세요");
		}else if(nation.equals("0")) {
			set = hm.keySet();
			it = set.iterator();
			while(it.hasNext()) {
				String country = it.next();
				System.out.println(country+":"+hm.get(country));
			}
		}else {
			System.out.println(nation+":"+hm.get(nation));
		}
			
		
			
		
				
	}
}