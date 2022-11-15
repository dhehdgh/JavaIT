package day12;

public class Array_1 {
	public static void main(String[] args) {
		//3명의 학생 점수를 저장하고 싶다

		int scores[] = new int[3];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		
		for(int i=0;i<3;i++) {
		System.out.println("i 번째 학생의 점수: "+scores[i]+"점");
		}
		
		
	}
}
