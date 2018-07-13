package mutex;

public class MutexMain1 {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
		Thread th1 = new Thread(mutex);
		th1.start();
		//sum에 synchronized를 하지 않았을 때,
		// 아래 스레드를 하나 더 넣으니 값이 나와야 할 값보다 크게 나옴.
		// 그리고 계산 결과가 매번 다름.
		//sum 수행 도중 다른 스레드가 끼어들어서 +idx의 값이 0 다음이 1이 아니라
		//끼어든 스레드가 영향을 준 값으로 변했고, 그것이 sum에 더해져 버렸다.
		//따라서 수행할 때마다 다른 결과가 나옴.
		Thread th2 = new Thread(mutex);
		th2.start();

		// 25초 후에 mutex의 result값을 확인
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(mutex.getResult());
	}

}
