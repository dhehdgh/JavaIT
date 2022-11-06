package day03;

public class While2 {
	public static void main(String[] args) {
		
		//while은 무한반복을 방지하기 위해 플래그를 세움
		//반복문 : 유사한 코드를 원하는 횟수만큼 실행시키기 위해서
		
		int i = 0;
		
		while(i != 7) {
			System.out.println("Hello");
			i++;		//중괄호 실행시마다 i를 1씩 늘려줌
		}
	}
}
