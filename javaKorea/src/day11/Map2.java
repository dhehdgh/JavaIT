package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl mi = new Map2Impl();
		mi.go();
		mi.tester();
	}
}


class Map2Impl{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		hm.put("cat", "고양이");
		hm.put("dog", "강아지");
		hm.put("bird", "새");
		hm.put("rat", "쥐");
		hm.put("cow", "소");
	}
	
	public void tester() {
		Scanner sc = new Scanner(System.in);
		String word_eng = null, word_kor = null;
		System.out.println("[영한사전]검색할 단어를 입력하세요>>");
		word_eng = sc.nextLine();
		word_kor = hm.get(word_eng);
		if(word_kor == null ||word_kor.equals("")) {
			System.out.println("없는 단어입니다.");
		}else {
			System.out.println("뜻: "+word_kor);
		}
	}
}
