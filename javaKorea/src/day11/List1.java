package day11;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		// ArrayList, HashMap, (HashSet)
		ListClass1 lc1 = new ListClass1();
		lc1.go();
	}
}


class ListClass1{
	
	public void go() {
		// int ==> Integer
		// double ==> Double
		ArrayList<Integer> arr1 = new ArrayList<>();			// <Integer> : int 자료형을 보관하게끔 선언
		// 배열
		int num[] = new int[10];
		
		// 값 대입
		num[0] = 1;
		arr1.add(1);			// 방을 만들면서 값 대입
		
		num[1] = 2;
		arr1.add(2);
		
		num[2] = 3;
		arr1.add(3);
		
		// 수정
		num[1] = 22;
		arr1.set(1, 22);
		
		// 삽입 1번방과 2번방 사이에
		arr1.add(2, 123);
		
		for(int i=num.length-1;i>2;i--) {
			if(i != num.length-1) {
			num[i] = num[i-1];
			}
		}
		num[2] = 123;
		
		// 1번방을 없애고 싶다. (ArrayList)
		arr1.remove(1);
		
		// 1번방을 없애고 싶다. (배열) 방 삭제가 번거로움
		for(int i=1;i<num.length;i++) {
			if(i != num.length-1) {
			num[i] = num[i+1];
			}
		}
		num[num.length-1] = 0;
		
		// 배열을 전체 보기
		for(int i=0;i<num.length;i++) {
			if(num[i] != 0) {
			System.out.println(num[i]);
			}
		}
		
		// ArrayList 전체보기
		for(int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
	}
}