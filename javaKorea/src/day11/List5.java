package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5 {
	public static void main(String[] args) {
		ListClass5 lc5 = new ListClass5();
		lc5.go();
	}
}

class ListClass5{
	
	public void go() {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr1 = new ArrayList<>();
		
		while(true) {
		System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
		int i = sc.nextInt();
		
		if(i == 1) {
			System.out.print("추가할 항목입력>>");
			arr1.add(sc.next());
		}
		if(i == 2) {
			System.out.print("수정할 위치를 입력하세요");
			int a = sc.nextInt();
			System.out.print("수정내용을 입력하세요");
			String b = sc.next();
			arr1.set(a, b);
		}
		if(i == 3) {
			System.out.print("삭제할 위치를 입력하세요");
			int c = sc.nextInt();
			arr1.remove(c);
		}
		if(i == 4) {
			for(int e=0;e<arr1.size();e++) {
				System.out.print(arr1.get(e)+" ");
			}
			System.out.println();
		}
		if(i == 0) {
			System.out.println("프로그램 종료");
			break;
		}
		}
	}
}