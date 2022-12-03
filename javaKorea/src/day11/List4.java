package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	public static void main(String[] args) {
		
	}
}

class ListClass4{
	
	public void go() {
		
		ArrayList<String> arr2 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("추가할 항목 입력 (0을 입력하면 종료)>>");
			String str = sc.next();
			if(str.equals("0")) {
				break;
			}else {
				arr2.add(str);
			}
		}
		for(int i=0;i<arr2.size();i++) {
			System.out.print(arr2.get(i)+" ");
		}
	}
}