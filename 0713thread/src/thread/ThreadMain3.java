package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		//Runnable인터페이스를 implements한 클래스를 이용해서 스레드 시작
		ThreadEx3 obj = new ThreadEx3();
		Thread th = new Thread(obj);
		//start를 바로 못 부르고 thread를 만들고 불러야 함
		//thread를 상속받으면 바로 부를 수 있음.(현재 implement상태)
		th.start();
	}
}
