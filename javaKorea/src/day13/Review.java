package day13;

public class Review {
	public static void main(String[] args) {
		// 컬렉션 : ArrayList(자바에서 만든 배열), HashMap(순서->키), Set(중복X, 순서X)
		// 쓰레드 : Thread, Runnable 를 상속
		MyThread t1 = new MyThread();
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1);
		
		t1.start();					// 쓰레드 시작
		
		try {t1.join();} catch (Exception e) {}			// join 외에 다른 쓰레드는 대기
		
		t2.start();					// 쓰레드 시작
		
		
	}
}


class MyThread extends Thread{
	@Override
	public void run() {				// 쓰레드 구현
		System.out.println("여기 있는 코드가 실행");
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {				// 쓰레드 구현
		System.out.println("인터페이스 재정의");
	}
	
}