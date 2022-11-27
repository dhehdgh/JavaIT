package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 ms4 = new MyString4();
		ms4.go();
	}
}

class MyString4{
	Scanner sc = new Scanner(System.in);
	public void go() {
		won();
		
	}
	
	public void won() {
		// 정수를 입력받아서 천원단위로 , 를 찍어 출력
		// 5000000 ==> 5,000,000
		System.out.println("숫자를 입력하세요");
		String a = sc.nextLine();
		
		
		if(a.length()==4) {
			String a2 = a.substring(0, 1);
			String a3 = a.substring(1, 4);
			String a4 = a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==5) {
			String a2 = a.substring(0, 2);
			String a3 = a.substring(2, 5);
			String a4 = a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==6) {
			String a2 = a.substring(0, 3);
			String a3 = a.substring(3, 6);
			String a4 = a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==7) {
			String a1 = a.substring(0, 1);
			String a2 = a.substring(1, 4);
			String a3 = a.substring(4, 7);
			String a4 = a1+","+a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==8) {
			String a1 = a.substring(0, 2);
			String a2 = a.substring(2, 5);
			String a3 = a.substring(5, 8);
			String a4 = a1+","+a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==9) {
			String a1 = a.substring(0, 3);
			String a2 = a.substring(3, 6);
			String a3 = a.substring(6, 9);
			String a4 = a1+","+a2+","+a3;
			System.out.println(a4);
		}else if(a.length()==1) {
			System.out.println(a);
		}else if(a.length()==2) {
			System.out.println(a);
		}else if(a.length()==3) {
			System.out.println(a);
		
		}
	}
	
	
	
	
}
