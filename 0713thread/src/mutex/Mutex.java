package mutex;

public class Mutex implements Runnable {
	private int result;
	private int idx;

	// synchronized가 붙은 메소드는 여러 개의 스레드가 동시에 호출하더라도
	// 하나의 수행이 종료된 후에 메소드가 호출된다.
	// (메소드의 결과형 앞에 synchronized 붙여주기.)
	// private synchronized void sum() {
	// for(int i=0; i<10000; i++) {
	// idx = idx + 1;
	// try {
	// Thread.sleep(1);
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// result = result + idx;
	// }
	// }

	private void sum() {
		for (int i = 0; i < 10000; i++) {
			// 자신이 가지고 있는 자원을 사용할 때는
			// 이 코드 영역은 동기적으로 동작하도록 해주는 설정이다.
			synchronized (this) {
				idx = idx + 1;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				result = result + idx;
			}
		}
	}

	@Override
	public void run() {
		sum();
	}

	// result값을 return해주는 메소드
	public int getResult() {
		return result;
	}
}
