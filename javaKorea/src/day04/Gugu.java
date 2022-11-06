package day04;

public class Gugu {
	public static void main(String[] args) {
		System.out.println("=====구구단=====");
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.println(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}
