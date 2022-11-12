package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String array[] = {"a1", "a2" , "a3" , "a4"};
		
		array[0] = "b1";
		array[1] = "b2";
		array[2] = "b3";
		array[3] = "b4";
		
		for(int x = 0;x<array.length;x++) {
			System.out.print(array[x] + " ");
		}
		
		
	}
}
