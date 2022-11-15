package day12;

public class InitAr {
	public static void main(String[] args) {
		int arInt[] = new int[3];
		double arDouble[] = new double[3];
		char arChar[] = new char[3];
		String arString[] = new String[3];
		
		
		for(int i=0;i<3;i++) {
			System.out.print(arInt[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arDouble[i]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arChar[1]+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print(arString[i]+" ");
		}
	}
}
