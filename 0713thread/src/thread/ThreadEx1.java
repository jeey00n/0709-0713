package thread;

public class ThreadEx1 extends Thread {
	@Override
	public void run() {
		// 스레드로 수행할 내용
		// 1초마다 쉬면서 0~9까지 순서대로 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
